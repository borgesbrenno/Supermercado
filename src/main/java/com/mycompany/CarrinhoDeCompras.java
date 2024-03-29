package com.mycompany;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CarrinhoDeCompras extends javax.swing.JFrame {

    private List<ProdutoCarrinho> produtosSalvos = new ArrayList<>();  // Adicione esta linha

    /**
     * Creates new form CarrinhoDeCompras
     */

public CarrinhoDeCompras() {
        initComponents();
    }

    public CarrinhoDeCompras(Date dataCompra, double valorGasto, String cpfCliente) {
        
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableCarrinho = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Produto", "Quantidade", "Valor Gasto", "CPF Cliente"
            }
        ));
        jScrollPane1.setViewportView(tableCarrinho);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CarrinhoDeCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarrinhoDeCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarrinhoDeCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarrinhoDeCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarrinhoDeCompras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCarrinho;
    // End of variables declaration//GEN-END:variables

    // Método para exibir produtos no carrinho
    public void exibirProdutos(List<ProdutoCarrinho> produtosSalvos) {
        DefaultTableModel model = (DefaultTableModel) tableCarrinho.getModel();
        model.setRowCount(0);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); // Formatador de data

        for (ProdutoCarrinho produto : produtosSalvos) {
            model.addRow(new Object[]{produto.getNome(), produto.getQuantidade(), produto.getValor(), produto.getCpfCliente(), dateFormat.format(produto.getDataCompra())});
        }
    }

// Método para atualizar a tabela
    public void atualizarTabela(List<ProdutoCarrinho> produtosSalvos) {
        DefaultTableModel model = (DefaultTableModel) tableCarrinho.getModel();

        // Limpar a tabela antes de adicionar os novos dados
        model.setRowCount(0);

        // Adicionar os produtos da lista à tabela
        for (ProdutoCarrinho produto : produtosSalvos) {
            model.addRow(new Object[]{produto.getNome(), produto.getQuantidade(), produto.getValor(), produto.getCpfCliente()});
        }
    }

// Métodos para obter e configurar a lista de produtos
    public List<ProdutoCarrinho> getProdutosSalvos() {
        return produtosSalvos;
    }

    public JTable getTableCarrinho() {
        return tableCarrinho;
    }
}