package com.mycompany.conexao;

import com.mycompany.AreaDoCliente;
import com.mycompany.CarrinhoDeCompras;
import com.mycompany.ProdutoCarrinho;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import com.mycompany.ProdutoCarrinho;
import com.mycompany.TelaRelatorioSintetico;
import java.util.Date;

public class ConexaoDAO {

    private static String url = "jdbc:mysql://localhost:3306/mercado";
    private static String user = "pedroo";
    private static String password = "123";

    // Método para obter uma conexão
    private static Connection obterConexao() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao obter a conexão.", e);
        }
    }

    // Método para cadastrar cliente
    public static void cadastrarCliente(String nome, String email, String idade, String telefone,
            String sexo, String estadoCivil, String cpf,
            String endereco, String complemento, String numero) {
        try (Connection conn = obterConexao()) {
            String sql = "INSERT INTO clientes (nome, email, idade, telefone, sexo, estado_civil, cpf, endereco, complemento, numero) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                preparedStatement.setInt(1, 0);
                preparedStatement.setString(2, "");
                preparedStatement.setString(1, nome);
                preparedStatement.setString(2, email);
                preparedStatement.setString(3, idade);
                preparedStatement.setString(4, telefone);
                preparedStatement.setString(5, sexo);
                preparedStatement.setString(6, estadoCivil);
                preparedStatement.setString(7, cpf);
                preparedStatement.setString(8, endereco);
                preparedStatement.setString(9, complemento);
                preparedStatement.setString(10, numero);

                preparedStatement.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao cadastrar o cliente.", e);
        }
    }

    // Método para cadastrar produto
    public static void cadastrarProduto(String nome, String quantidade, String preco) {
    try (Connection conexao = obterConexao()) {
        String sql = "INSERT INTO produtos (produto, quantidade, preco) VALUES (?, ?, ?)";
        try (PreparedStatement preparedStatement = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setString(1, nome);
            preparedStatement.setString(2, quantidade);
            preparedStatement.setString(3, preco);

            preparedStatement.executeUpdate();

            // Obtém a chave gerada automaticamente (neste caso, o ID)
            try (ResultSet generatedKeys = preparedStatement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    int idGerado = generatedKeys.getInt(1);
                    System.out.println("ID gerado: " + idGerado);
                } else {
                    System.err.println("Não foi possível obter o ID gerado.");
                }
            }
        }
    } catch (SQLException e) {
        // Adicione logs de depuração
        System.err.println("Erro ao cadastrar o produto.");
        System.err.println("Detalhes da exceção:");
        e.printStackTrace();

        // Relance a exceção como RuntimeException para interromper a execução
        throw new RuntimeException("Erro ao cadastrar o produto.", e);
    }
}

    public static List<TelaRelatorioSintetico> buscarPorCliente(String cpfCliente) {
    List<TelaRelatorioSintetico> resultados = new ArrayList<>();

    try (Connection conexao = obterConexao()) {
        String sql = "SELECT * FROM relatorio_sintetico WHERE cpf_cliente = ?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, cpfCliente);
            try (ResultSet resultado = stmt.executeQuery()) {
                while (resultado.next()) {
                    // Supondo que TelaRelatorioSintetico tenha um construtor adequado
                    TelaRelatorioSintetico relatorio = new TelaRelatorioSintetico(
                            resultado.getString("cpf_cliente"),
                            resultado.getDate("data_compra"),
                            resultado.getDouble("valor_gasto")
                            // Adicione outros campos conforme necessário
                    );
                    resultados.add(relatorio);
                }
            }
        }
    } catch (SQLException e) {
        e.printStackTrace(); // Trate o erro conforme necessário
    }

    return resultados;
}
   
    private boolean verificarCpfNoBancoDeDados(String cpfDigitado) {
        Connection conexao = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // Carregar o driver JDBC (ajuste para o seu banco de dados)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Estabelecer a conexão com o banco de dados
            String url = "jdbc:mysql://localhost:3306/mercado";
            String usuario = "pedroo";
            String senha = "123";
            conexao = DriverManager.getConnection(url, usuario, senha);

            // Consulta SQL para verificar se o CPF existe
            String sql = "SELECT COUNT(*) FROM tabela_clientes WHERE cpf = ?";
            pstmt = conexao.prepareStatement(sql);
            pstmt.setString(1, cpfDigitado);
            rs = pstmt.executeQuery();

            // Verificar se o CPF existe
            if (rs.next() && rs.getInt(1) > 0) {
                return true; // CPF encontrado no banco de dados
            } else {
                return false; // CPF não encontrado
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return false; // Tratar a exceção conforme necessário
        } finally {
            // Fechar recursos
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conexao != null) conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    } 

        public boolean verificarExistenciaCPF(String cpf) throws SQLException {
        String sql = "SELECT COUNT(*) FROM clientes WHERE cpf = ?";
        
        try (Connection conexao = obterConexao();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, cpf);

            try (ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    int count = resultSet.getInt(1);
                    return count > 0;
                }
            }
        }

        return false;
    }
        
        public static void transferirParaRelatorioSintetico(String cpfCliente, Date dataCompra, double valorGasto) {
        try (Connection conexao = obterConexao()) {
            String sql = "INSERT INTO relatorio_sintetico (cpf_cliente, data_compra, valor_gasto) VALUES (?, ?, ?)";

            try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                stmt.setString(1, cpfCliente);
                stmt.setDate(2, new java.sql.Date(dataCompra.getTime()));
                stmt.setDouble(3, valorGasto);

                stmt.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Lide com o erro conforme necessário.
        }
    }
        
        public static List<CarrinhoDeCompras> buscarComprasPorCliente(String cpfCliente) {
        List<CarrinhoDeCompras> compras = new ArrayList<>();

        try (Connection conexao = obterConexao()) {
            String sql = "SELECT * FROM carrinhocompras WHERE cpf_cliente = ?";

            try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                stmt.setString(1, cpfCliente);

                try (ResultSet resultado = stmt.executeQuery()) {
                    while (resultado.next()) {
                        Date dataCompra = resultado.getDate("data_compra");
                        double valorGasto = resultado.getDouble("valor_gasto");

                        compras.add(new CarrinhoDeCompras(dataCompra, valorGasto, cpfCliente));
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Lide com o erro conforme necessário.
        }

        return compras;
    }
        
        
}