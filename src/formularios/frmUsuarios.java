
package formularios;

import classes.Dados;
import classes.Dados_DB;
import classes.Usuario;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

/**
 *
 * @author AndersoNMN
 */
public class frmUsuarios extends javax.swing.JInternalFrame {

    private Dados msDados;
    
    private Dados_DB msDados_DB;
    
    public int usuAtual = 0;
    private boolean novo = false;
    private DefaultTableModel mTablela; 
    
    public void setDados(Dados msDados) {
        this.msDados = msDados;
    }
    
    public void setDados_DB(Dados_DB msDados_DB) {
        this.msDados_DB = msDados_DB;
    }
    
    public frmUsuarios() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIDUsuario = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtSobreNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SelecionarPerfil = new javax.swing.JComboBox<>();
        txtConfirmarSenha = new javax.swing.JPasswordField();
        txtSenha = new javax.swing.JPasswordField();
        btnCadastroAnterior = new javax.swing.JButton();
        btnProximoCadastro = new javax.swing.JButton();
        btnNovoCadastro = new javax.swing.JButton();
        btnEditarCadastro = new javax.swing.JButton();
        btnSalvarCadastro = new javax.swing.JButton();
        btnExcluirCadastro = new javax.swing.JButton();
        btnCancelarCadastro = new javax.swing.JButton();
        btnPesquisarCadastro = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastrar Usuarios ");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Nome");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("ID Usuario");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Senha");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Sobre Nome");

        txtIDUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtIDUsuario.setEnabled(false);
        txtIDUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDUsuarioActionPerformed(evt);
            }
        });

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNome.setEnabled(false);

        txtSobreNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSobreNome.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Perfil");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Confimar senha");

        SelecionarPerfil.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SelecionarPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar Um Perfil", "Administrador", "Funcionário" }));
        SelecionarPerfil.setEnabled(false);

        txtConfirmarSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtConfirmarSenha.setEnabled(false);

        txtSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSenha.setEnabled(false);
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        btnCadastroAnterior.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCadastroAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-anterior-36.png"))); // NOI18N
        btnCadastroAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroAnteriorActionPerformed(evt);
            }
        });

        btnProximoCadastro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnProximoCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-próximo-36.png"))); // NOI18N
        btnProximoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoCadastroActionPerformed(evt);
            }
        });

        btnNovoCadastro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNovoCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-adicionar-arquivo-36.png"))); // NOI18N
        btnNovoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoCadastroActionPerformed(evt);
            }
        });

        btnEditarCadastro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEditarCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-crie-um-novo-36.png"))); // NOI18N
        btnEditarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCadastroActionPerformed(evt);
            }
        });

        btnSalvarCadastro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalvarCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-salvar-e-fechar-36.png"))); // NOI18N
        btnSalvarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCadastroActionPerformed(evt);
            }
        });

        btnExcluirCadastro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnExcluirCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-remove-properties-36.png"))); // NOI18N
        btnExcluirCadastro.setEnabled(false);
        btnExcluirCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCadastroActionPerformed(evt);
            }
        });

        btnCancelarCadastro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancelarCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-cancelar-assinatura-36.png"))); // NOI18N
        btnCancelarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCadastroActionPerformed(evt);
            }
        });

        btnPesquisarCadastro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPesquisarCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-pesquisa-propriedade-36.png"))); // NOI18N
        btnPesquisarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarCadastroActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adduser.png"))); // NOI18N

        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblTabela);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(SelecionarPerfil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(txtSenha)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtSobreNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(1, 1, 1)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCadastroAnterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnProximoCadastro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnNovoCadastro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEditarCadastro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSalvarCadastro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnExcluirCadastro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancelarCadastro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPesquisarCadastro)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(SelecionarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel7)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtSobreNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProximoCadastro)
                    .addComponent(btnCadastroAnterior)
                    .addComponent(btnEditarCadastro)
                    .addComponent(btnNovoCadastro)
                    .addComponent(btnSalvarCadastro)
                    .addComponent(btnExcluirCadastro)
                    .addComponent(btnCancelarCadastro)
                    .addComponent(btnPesquisarCadastro))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDUsuarioActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void mostrarCadastros(){
        txtIDUsuario.setText(msDados.getUsuarios()[usuAtual].getIdUsuario());
        txtNome.setText(msDados.getUsuarios()[usuAtual].getNome());
        txtSobreNome.setText(msDados.getUsuarios()[usuAtual].getSobreNome());
        txtSenha.setText(msDados.getUsuarios()[usuAtual].getSenha());
        txtConfirmarSenha.setText(msDados.getUsuarios()[usuAtual].getSenha());
        SelecionarPerfil.setSelectedIndex(msDados.getUsuarios()[usuAtual].getPerfil());
        
    }
    
    private void btnCadastroAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroAnteriorActionPerformed
        usuAtual--;
        if(usuAtual == -1){ // se o numero de usuaro for igual ao seu retorno, coloca a variavel usuatual como 0
            usuAtual = msDados.numeroUsuarios()-1;
        }
        mostrarCadastros();
    }//GEN-LAST:event_btnCadastroAnteriorActionPerformed

    private void btnProximoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoCadastroActionPerformed
        usuAtual++;
        if(usuAtual == msDados.numeroUsuarios()){ // se o numero de usuaro for igual ao seu proximo, coloca a variavel usuatual como 0
            usuAtual = 0;
        }
        mostrarCadastros();
    }//GEN-LAST:event_btnProximoCadastroActionPerformed

    private void btnNovoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoCadastroActionPerformed
        btnProximoCadastro.setEnabled(false);
        btnCadastroAnterior.setEnabled(false);
        btnNovoCadastro.setEnabled(false);
        btnEditarCadastro.setEnabled(false);
        btnExcluirCadastro.setEnabled(false);
        btnPesquisarCadastro.setEnabled(false);
        btnSalvarCadastro.setEnabled(true);
        btnCancelarCadastro.setEnabled(true);
        
        //caixar de inputs
        txtIDUsuario.setEnabled(true);
        txtNome.setEnabled(true);
        txtSobreNome.setEnabled(true);
        txtSenha.setEnabled(true);
        txtConfirmarSenha.setEnabled(true);
        SelecionarPerfil.setEnabled(true);
        
        //Limpar caixar de inputs
        txtIDUsuario.setText("");
        txtNome.setText("");
        txtSobreNome.setText("");
        txtSenha.setText("");
        txtConfirmarSenha.setText("");
        SelecionarPerfil.setSelectedIndex(0);
        
        novo = true;
        
        txtIDUsuario.requestFocus();
        
        
    }//GEN-LAST:event_btnNovoCadastroActionPerformed

    private void btnEditarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCadastroActionPerformed
        btnProximoCadastro.setEnabled(false);
        btnCadastroAnterior.setEnabled(false);
        btnNovoCadastro.setEnabled(true);
        btnEditarCadastro.setEnabled(false);
        btnExcluirCadastro.setEnabled(false);
        btnPesquisarCadastro.setEnabled(false);
        btnSalvarCadastro.setEnabled(true);
        btnCancelarCadastro.setEnabled(true);
        
        //caixar de inputs
        txtIDUsuario.setEditable(false);
        txtNome.setEnabled(true);
        txtSobreNome.setEnabled(true);
        txtSenha.setEnabled(true);
        txtConfirmarSenha.setEnabled(true);
        SelecionarPerfil.setEnabled(true);
        
        novo = false;
      
        txtNome.requestFocus();
                
    }//GEN-LAST:event_btnEditarCadastroActionPerformed

    private void btnSalvarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCadastroActionPerformed
        if (txtIDUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane,"Favor inserir um ID.");
            txtIDUsuario.requestFocusInWindow();
            return;
        }
        
        if (SelecionarPerfil.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane,"Favor Selecionar um perfil.");
            SelecionarPerfil.requestFocusInWindow();
            return;
        }
        
        String senha = new String(txtSenha.getPassword());
        String confirmar = new String(txtConfirmarSenha.getPassword());
        
        if (txtNome.getText().equals("") || txtSobreNome.getText().equals("") || senha.equals("")|| confirmar.equals("")) {
            JOptionPane.showMessageDialog(rootPane,"Favor Prencher todos os campos.");
            return;
        }
        
        if (!senha.equals(confirmar)) {
            JOptionPane.showMessageDialog(rootPane,"Sua senha está diferente da confirmação.");
            txtSenha.setText("");
            return;
        }
        
       int pos = msDados.posicaoUsuario(txtIDUsuario.getText());
       if(novo){
            if(pos != -1){
                JOptionPane.showMessageDialog(rootPane,"Este usuario já existe!");
                txtIDUsuario.requestFocusInWindow();
                return;
            }
       } else {
           if (pos == -1) {
               JOptionPane.showMessageDialog(rootPane,"Este usuario ainda não existe!");
                txtIDUsuario.requestFocusInWindow();
                return;
           }
       }
       
        Usuario mUsuario = new Usuario(
                txtIDUsuario.getText(), txtNome.getText(), txtSobreNome.getText(), senha, SelecionarPerfil.getSelectedIndex());
        
        
        String msg;
        if(novo){
            msg = msDados.adicionarUsuario(mUsuario);
        } else {
            msg = msDados.editarUsuario(mUsuario, pos);
        }    
            JOptionPane.showMessageDialog(rootPane, msg);
        
        
        btnProximoCadastro.setEnabled(true);
        btnCadastroAnterior.setEnabled(true);
        btnNovoCadastro.setEnabled(true);
        btnEditarCadastro.setEnabled(true);
        btnExcluirCadastro.setEnabled(true);
        btnPesquisarCadastro.setEnabled(true);
        btnSalvarCadastro.setEnabled(false);
        btnCancelarCadastro.setEnabled(false);
        
        // Desabilitar os butões
        txtIDUsuario.setEditable(true);
        txtNome.setEditable(true);
        txtSobreNome.setEditable(true);
        txtSenha.setEditable(true);
        txtConfirmarSenha.setEditable(true);
        SelecionarPerfil.setEditable(true);
        
        preencherTabela();
        
    }//GEN-LAST:event_btnSalvarCadastroActionPerformed

    private void btnExcluirCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCadastroActionPerformed
        int resposta = JOptionPane.showConfirmDialog(rootPane,"Deseja realmente Deletar este Usuário?");
        if (resposta != 0) {
            return;
        }
        
        String msg;
        msg = msDados.deletarUsuario(usuAtual);
        JOptionPane.showMessageDialog(rootPane,msg);
        usuAtual= 0;
        mostrarCadastros();
        preencherTabela();
    }//GEN-LAST:event_btnExcluirCadastroActionPerformed

    private void btnCancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCadastroActionPerformed
        btnProximoCadastro.setEnabled(true);
        btnCadastroAnterior.setEnabled(true);
        btnNovoCadastro.setEnabled(true);
        btnEditarCadastro.setEnabled(true);
        btnExcluirCadastro.setEnabled(true);
        btnPesquisarCadastro.setEnabled(true);
        btnSalvarCadastro.setEnabled(false);
        btnCancelarCadastro.setEnabled(false);
    }//GEN-LAST:event_btnCancelarCadastroActionPerformed

    private void btnPesquisarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarCadastroActionPerformed
        String usuario = JOptionPane.showInputDialog("Favor Inserir o código do Usuario");
        if(usuario.equals("")) {
            return;
        } 

        int pos = msDados.posicaoUsuario(usuario);
        if(pos == -1) {
            JOptionPane.showMessageDialog(rootPane,"Este usuario NÃO EXISTE");
            return;
        } 
            usuAtual = pos;
            mostrarCadastros();
        
    }//GEN-LAST:event_btnPesquisarCadastroActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        mostrarCadastros();
        preencherTabela();
    }//GEN-LAST:event_formInternalFrameOpened

    private void preencherTabela(){
            String titulos[] =  {"ID Usuario", "Nome", "Sobre nome", "Perfil"};
        String registro[] = new String[4];
        mTablela = new DefaultTableModel(null, titulos);
        for(int i =0; i < msDados.numeroUsuarios(); i++) {
            registro[0] = msDados.getUsuarios()[i].getIdUsuario();
            registro[1] = msDados.getUsuarios()[i].getNome();
            registro[2] = msDados.getUsuarios()[i].getSobreNome();
            registro[3] = perfil(msDados.getUsuarios()[i].getPerfil());
            mTablela.addRow(registro);
            
        }
        tblTabela.setModel(mTablela);
    }
                             
    public String perfil(int idPerfil){
        if(idPerfil == 1) {
            return "Administrador";
        } else {
            return "Funcionario";
        } 
       
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> SelecionarPerfil;
    private javax.swing.JButton btnCadastroAnterior;
    private javax.swing.JButton btnCancelarCadastro;
    private javax.swing.JButton btnEditarCadastro;
    private javax.swing.JButton btnExcluirCadastro;
    private javax.swing.JButton btnNovoCadastro;
    private javax.swing.JButton btnPesquisarCadastro;
    private javax.swing.JButton btnProximoCadastro;
    private javax.swing.JButton btnSalvarCadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTabela;
    private javax.swing.JPasswordField txtConfirmarSenha;
    private javax.swing.JTextField txtIDUsuario;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtSobreNome;
    // End of variables declaration//GEN-END:variables
}
