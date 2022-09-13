
package formularios;

import classes.Cliente;
import classes.Dados;
import classes.Utilidades;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AndersoNMN
 */
public class frmClientes extends javax.swing.JInternalFrame {

    private Dados msDados;
    public int clientAtual = 0;
    private boolean novo = false;
    private DefaultTableModel mTablela; 
    
    public void setDados(Dados msDados) {
        this.msDados = msDados;
    }
    
    public frmClientes() {
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
        txtIDCliente = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtSobreNome = new javax.swing.JTextField();
        btnCadastroAnterior = new javax.swing.JButton();
        btnProximoCadastro = new javax.swing.JButton();
        btnNovoCadastro = new javax.swing.JButton();
        btnEditarCadastro = new javax.swing.JButton();
        btnSalvarCadastro = new javax.swing.JButton();
        btnExcluirCadastro = new javax.swing.JButton();
        btnCancelarCadastro = new javax.swing.JButton();
        btnPesquisarCadastro = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();
        txtEndereco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmbCidade = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastrar Cliente");
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
        jLabel2.setText("ID Cliente");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Endereço");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Sobre Nome");

        txtIDCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtIDCliente.setEnabled(false);
        txtIDCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDClienteActionPerformed(evt);
            }
        });

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNome.setEnabled(false);

        txtSobreNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSobreNome.setEnabled(false);

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

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cliente.png"))); // NOI18N
        jLabel7.setPreferredSize(new java.awt.Dimension(32, 32));

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

        txtEndereco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEndereco.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Telefone");

        txtTelefone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTelefone.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Cidade");

        cmbCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma Cidade", "Rio de janeior", "São paulo" }));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Data");

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Email");

        txtData.setEditable(false);
        txtData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCadastroAnterior)
                                .addGap(18, 18, 18)
                                .addComponent(btnProximoCadastro)
                                .addGap(18, 18, 18)
                                .addComponent(btnNovoCadastro)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditarCadastro)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalvarCadastro)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluirCadastro)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelarCadastro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPesquisarCadastro))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(275, 275, 275))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(cmbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(41, 41, 41)
                                .addComponent(txtEndereco))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtSobreNome))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail)
                                    .addComponent(txtTelefone))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtSobreNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cmbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisarCadastro)
                    .addComponent(btnExcluirCadastro)
                    .addComponent(btnSalvarCadastro)
                    .addComponent(btnEditarCadastro)
                    .addComponent(btnNovoCadastro)
                    .addComponent(btnProximoCadastro)
                    .addComponent(btnCadastroAnterior)
                    .addComponent(btnCancelarCadastro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDClienteActionPerformed

    private void mostrarProdutos(){
        txtIDCliente.setText(msDados.getClientes()[clientAtual].getIdCliente());
        txtNome.setText(msDados.getClientes()[clientAtual].getNome());
        txtSobreNome.setText("" + msDados.getClientes()[clientAtual].getSobreNome());
        txtEndereco.setText(msDados.getClientes()[clientAtual].getEndereco());
        txtEmail.setText(msDados.getClientes()[clientAtual].getEmail());
        txtTelefone.setText(msDados.getClientes()[clientAtual].getTelefone());
        cmbCidade.setSelectedIndex(msDados.getClientes()[clientAtual].getCidade());
        
    }
    
    private void btnCadastroAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroAnteriorActionPerformed
        clientAtual--;
        if(clientAtual == -1){ // se o numero de Produtos for igual ao seu retorno, coloca a variavel usuatual como 0
            clientAtual = msDados.numeroProdutos()-1;
        }
        mostrarProdutos();
    }//GEN-LAST:event_btnCadastroAnteriorActionPerformed

    private void btnProximoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoCadastroActionPerformed
        clientAtual++;
        if(clientAtual == msDados.numeroProdutos()){ // se o numero de Produtos for igual ao seu proximo, coloca a variavel usuatual como 0
            clientAtual = 0;
        }
        mostrarProdutos();
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
        txtIDCliente.setEnabled(true);
        txtNome.setEnabled(true);
        txtSobreNome.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtEmail.setEnabled(true);
        txtTelefone.setEnabled(true);
        cmbCidade.setEditable(true);
        
        //Limpar caixar de inputs
        txtIDCliente.setText("");
        txtNome.setText("");
        txtSobreNome.setText("");
        txtEndereco.setText("");
        txtEmail.setText("");
        cmbCidade.setSelectedIndex(0);
        txtTelefone.setText("");
        
        novo = true;
        
        txtIDCliente.requestFocus();
        
        
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
        txtIDCliente.setEnabled(true);
        txtNome.setEnabled(true);
        txtSobreNome.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtEmail.setEnabled(true);
        txtTelefone.setEnabled(true);
        cmbCidade.setEditable(true);
        
        novo = false;
      
        txtNome.requestFocus();
                
    }//GEN-LAST:event_btnEditarCadastroActionPerformed

    private void btnSalvarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCadastroActionPerformed
        if (txtIDCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane,"Favor inserir um ID.");
            txtIDCliente.requestFocusInWindow();
            return;
        }
        
//        if (impImposto.getSelectedIndex() == 0) {
//            JOptionPane.showMessageDialog(rootPane,"Favor Selecionar um Imposto.");
//            impImposto.requestFocusInWindow();
//            return;
//        }
        
        
        if (txtNome.getText().equals("") || txtSobreNome.getText().equals("") || txtEmail.getText().equals("") || txtTelefone.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane,"Favor Prencher todos os campos.");
            return;
        }
                
        
       int pos = msDados.posicaoCliente(txtIDCliente.getText());
       if(novo){
            if(pos != -1){
                JOptionPane.showMessageDialog(rootPane,"Este Cliente já existe!");
                txtIDCliente.requestFocusInWindow();
                return;
            }
       } else {
           if (pos == -1) {
               JOptionPane.showMessageDialog(rootPane,"Este Cliente ainda não existe!");
                txtIDCliente.requestFocusInWindow();
                return;
           }
       }
       
        Cliente mCliente = new Cliente(
                txtIDCliente.getText(),
                txtNome.getText(),            
                txtSobreNome.getText(),
                txtEndereco.getText(),
                txtEmail.getText(),
                txtTelefone.getText(),
                cmbCidade.getSelectedIndex()
        );
        
        
        String msg;
        if(novo){
            msg = msDados.adicionarCliente(mCliente);
        } else {
            msg = msDados.editarCliente(mCliente, pos);
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
        txtIDCliente.setEnabled(true);
        txtNome.setEnabled(true);
        txtSobreNome.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtTelefone.setEnabled(true);
        cmbCidade.setEditable(true);
        
        preencherTabela();
        
    }//GEN-LAST:event_btnSalvarCadastroActionPerformed

    private void btnExcluirCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCadastroActionPerformed
        int resposta = JOptionPane.showConfirmDialog(rootPane,"Deseja realmente Deletar este Produto?");
        if (resposta != 0) {
            return;
        }
        
        String msg;
        msg = msDados.deletarUsuario(clientAtual);
        JOptionPane.showMessageDialog(rootPane,msg);
        clientAtual= 0;
        mostrarProdutos();
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
        String produto = JOptionPane.showInputDialog("Favor Inserir o ID do cliente");
        if(produto.equals("")) {
            return;
        } 

        int pos = msDados.posicaoProduto(produto);
        if(pos == -1) {
            JOptionPane.showMessageDialog(rootPane,"Este Produtos NÃO EXISTE");
            return;
        } 
            clientAtual = pos;
            mostrarProdutos();
        
    }//GEN-LAST:event_btnPesquisarCadastroActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        //voltar aqui para resolver problema de quando não tem nenhum item não abre o formulario
        mostrarProdutos();
        preencherTabela();
        txtData.setText(Utilidades.getDate());
    }//GEN-LAST:event_formInternalFrameOpened

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void preencherTabela(){
        String titulos[] =  {"ID Cliente", "Nome", "Sobre Nome", "Endereco", "Email", "Eelefone", "Cidade"};
        String registro[] = new String[7];
        mTablela = new DefaultTableModel(null, titulos);
        for(int i =0; i < msDados.numeroClientes(); i++) {
            registro[0] = msDados.getClientes()[i].getIdCliente();
            registro[1] = msDados.getClientes()[i].getNome();
            registro[2] = msDados.getClientes()[i].getSobreNome();
            registro[3] = msDados.getClientes()[i].getEndereco(); 
            registro[4] = msDados.getClientes()[i].getEmail();
            registro[5] = msDados.getClientes()[i].getTelefone();
            registro[6] = "" + msDados.getClientes()[i].getCidade();
            
            mTablela.addRow(registro);
            
        }
        tblTabela.setModel(mTablela);
    }
                             
    private String Imposto(int idImposto){
        switch (idImposto) {
            case 0:
                return "0%";
            
            case 1:
                return "10%";
            
            case 2:
                return "15%";
            
            default:
                    return "Não definido";
            
        }   
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastroAnterior;
    private javax.swing.JButton btnCancelarCadastro;
    private javax.swing.JButton btnEditarCadastro;
    private javax.swing.JButton btnExcluirCadastro;
    private javax.swing.JButton btnNovoCadastro;
    private javax.swing.JButton btnPesquisarCadastro;
    private javax.swing.JButton btnProximoCadastro;
    private javax.swing.JButton btnSalvarCadastro;
    private javax.swing.JComboBox<String> cmbCidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtIDCliente;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSobreNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
