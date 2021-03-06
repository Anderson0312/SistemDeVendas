
package formularios;

import classes.BackGround;
import classes.Dados;

/**
 *
 * @author AndersoNMN
 */
public class frmPrincipal extends javax.swing.JFrame {

    private Dados msDados;
    
    public void setDados(Dados msDados) {
        this.msDados = msDados;
    }
    
    public frmPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpnDesk = new BackGround();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArquivo = new javax.swing.JMenu();
        mnuArquivoClientes = new javax.swing.JMenuItem();
        mnuArquivoProdutos = new javax.swing.JMenuItem();
        mnuArquivoUsuarios = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuArquivoTSenha = new javax.swing.JMenuItem();
        mnuArquivoTUsuario = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuArquivoSair = new javax.swing.JMenuItem();
        mnuMoviment = new javax.swing.JMenu();
        mnuMovimentNvVenda = new javax.swing.JMenuItem();
        mnuMovimentRlVenda = new javax.swing.JMenuItem();
        mnuAjuda = new javax.swing.JMenu();
        mnuAjudaSobre = new javax.swing.JMenuItem();
        mnuAjudaAjuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de vendas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        dpnDesk.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout dpnDeskLayout = new javax.swing.GroupLayout(dpnDesk);
        dpnDesk.setLayout(dpnDeskLayout);
        dpnDeskLayout.setHorizontalGroup(
            dpnDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 867, Short.MAX_VALUE)
        );
        dpnDeskLayout.setVerticalGroup(
            dpnDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        mnuArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arquivosicon.png"))); // NOI18N
        mnuArquivo.setText("Arquivo");
        mnuArquivo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        mnuArquivoClientes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuArquivoClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clienteicon.png"))); // NOI18N
        mnuArquivoClientes.setText("Clientes");
        mnuArquivoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivoClientesActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuArquivoClientes);

        mnuArquivoProdutos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuArquivoProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/produtos.png"))); // NOI18N
        mnuArquivoProdutos.setText("Produtos");
        mnuArquivoProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivoProdutosActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuArquivoProdutos);

        mnuArquivoUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuArquivoUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usersicon.png"))); // NOI18N
        mnuArquivoUsuarios.setText("Usuarios");
        mnuArquivoUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivoUsuariosActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuArquivoUsuarios);
        mnuArquivo.add(jSeparator1);

        mnuArquivoTSenha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuArquivoTSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/password.png"))); // NOI18N
        mnuArquivoTSenha.setText("Trocar Senha");
        mnuArquivo.add(mnuArquivoTSenha);

        mnuArquivoTUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuArquivoTUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/renameuser.png"))); // NOI18N
        mnuArquivoTUsuario.setText("Trocar Usuario");
        mnuArquivo.add(mnuArquivoTUsuario);
        mnuArquivo.add(jSeparator2);

        mnuArquivoSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuArquivoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        mnuArquivoSair.setText("Sair");
        mnuArquivoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivoSairActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuArquivoSair);

        jMenuBar1.add(mnuArquivo);

        mnuMoviment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/movimentosicon.png"))); // NOI18N
        mnuMoviment.setText("Movimentos");
        mnuMoviment.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        mnuMovimentNvVenda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuMovimentNvVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Product-sale.png"))); // NOI18N
        mnuMovimentNvVenda.setText("Nova Venda");
        mnuMoviment.add(mnuMovimentNvVenda);

        mnuMovimentRlVenda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuMovimentRlVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/analytics-36.png"))); // NOI18N
        mnuMovimentRlVenda.setText("Relatorio Venda");
        mnuMoviment.add(mnuMovimentRlVenda);

        jMenuBar1.add(mnuMoviment);

        mnuAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ajudaicon.png"))); // NOI18N
        mnuAjuda.setText("Ajuda");
        mnuAjuda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        mnuAjudaSobre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuAjudaSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-informa????es-36.png"))); // NOI18N
        mnuAjudaSobre.setText("Sobre");
        mnuAjuda.add(mnuAjudaSobre);

        mnuAjudaAjuda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuAjudaAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-ajuda-36.png"))); // NOI18N
        mnuAjudaAjuda.setText("Ajuda");
        mnuAjuda.add(mnuAjudaAjuda);

        jMenuBar1.add(mnuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dpnDesk)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnDesk)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuArquivoUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivoUsuariosActionPerformed
        frmUsuarios mUsuarios = new frmUsuarios();
        mUsuarios.setDados(msDados);
        dpnDesk.add(mUsuarios);
        mUsuarios.show();
    }//GEN-LAST:event_mnuArquivoUsuariosActionPerformed

    private void mnuArquivoProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivoProdutosActionPerformed
        frmProdutos mProdutos = new frmProdutos();
        mProdutos.setDados(msDados);
        dpnDesk.add(mProdutos);
        mProdutos.show();
    }//GEN-LAST:event_mnuArquivoProdutosActionPerformed

    private void mnuArquivoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivoClientesActionPerformed
        frmClientes mClientes = new frmClientes();
        mClientes.setDados(msDados);
        dpnDesk.add(mClientes);
        mClientes.show();
    }//GEN-LAST:event_mnuArquivoClientesActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ((BackGround)dpnDesk).setImage("/images/background.jpg"); // setando a imagagem de fundo do formulario principal
    }//GEN-LAST:event_formWindowOpened

    private void mnuArquivoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivoSairActionPerformed
        msDados.salvarDados();
        System.exit(0);
    }//GEN-LAST:event_mnuArquivoSairActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpnDesk;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu mnuAjuda;
    private javax.swing.JMenuItem mnuAjudaAjuda;
    private javax.swing.JMenuItem mnuAjudaSobre;
    private javax.swing.JMenu mnuArquivo;
    private javax.swing.JMenuItem mnuArquivoClientes;
    private javax.swing.JMenuItem mnuArquivoProdutos;
    private javax.swing.JMenuItem mnuArquivoSair;
    private javax.swing.JMenuItem mnuArquivoTSenha;
    private javax.swing.JMenuItem mnuArquivoTUsuario;
    private javax.swing.JMenuItem mnuArquivoUsuarios;
    private javax.swing.JMenu mnuMoviment;
    private javax.swing.JMenuItem mnuMovimentNvVenda;
    private javax.swing.JMenuItem mnuMovimentRlVenda;
    // End of variables declaration//GEN-END:variables
}
