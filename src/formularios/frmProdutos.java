
package formularios;

import classes.Dados;
import classes.Produto;
import classes.Usuario;
import classes.Utilidades;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AndersoNMN
 */
public class frmProdutos extends javax.swing.JInternalFrame {

    private Dados msDados;
    public int prodAtual = 0;
    private boolean novo = false;
    private DefaultTableModel mTablela; 
    
    public void setDados(Dados msDados) {
        this.msDados = msDados;
    }
    
    public frmProdutos() {
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
        txtIDProduto = new javax.swing.JTextField();
        txtDescrcao = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        impImposto = new javax.swing.JComboBox<>();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAnotacao = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastrar Produtos ");
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
        jLabel1.setText("Descrição");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("ID Produto");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Anotação");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Preço");

        txtIDProduto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtIDProduto.setEnabled(false);
        txtIDProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDProdutoActionPerformed(evt);
            }
        });

        txtDescrcao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDescrcao.setEnabled(false);

        txtPreco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPreco.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Imposto");

        impImposto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        impImposto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0%", "10%", "15%" }));
        impImposto.setEnabled(false);

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

        txtAnotacao.setColumns(20);
        txtAnotacao.setRows(5);
        jScrollPane2.setViewportView(txtAnotacao);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/produto.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
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
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                        .addComponent(btnCancelarCadastro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnPesquisarCadastro))
                                    .addComponent(jScrollPane2)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(txtIDProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(impImposto, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDescrcao))))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(txtIDProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(impImposto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDescrcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel7)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDProdutoActionPerformed

    private void mostrarProdutos(){
        txtIDProduto.setText(msDados.getProdutos()[prodAtual].getIdProduto());
        txtDescrcao.setText(msDados.getProdutos()[prodAtual].getDescircao());
        txtPreco.setText("" + msDados.getProdutos()[prodAtual].getPreco());
        txtAnotacao.setText(msDados.getProdutos()[prodAtual].getAnotacao());
        impImposto.setSelectedIndex(msDados.getProdutos()[prodAtual].getImposto());
        
    }
    
    private void btnCadastroAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroAnteriorActionPerformed
        prodAtual--;
        if(prodAtual == -1){ // se o numero de Produtos for igual ao seu retorno, coloca a variavel usuatual como 0
            prodAtual = msDados.numeroProdutos()-1;
        }
        mostrarProdutos();
    }//GEN-LAST:event_btnCadastroAnteriorActionPerformed

    private void btnProximoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoCadastroActionPerformed
        prodAtual++;
        if(prodAtual == msDados.numeroProdutos()){ // se o numero de Produtos for igual ao seu proximo, coloca a variavel usuatual como 0
            prodAtual = 0;
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
        txtIDProduto.setEnabled(true);
        txtDescrcao.setEnabled(true);
        txtPreco.setEnabled(true);
        impImposto.setEnabled(true);
        txtAnotacao.setEnabled(true);
        
        //Limpar caixar de inputs
        txtIDProduto.setText("");
        txtDescrcao.setText("");
        txtPreco.setText("");
        impImposto.setSelectedIndex(0);
        txtAnotacao.setText("");
        
        novo = true;
        
        txtIDProduto.requestFocus();
        
        
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
        txtIDProduto.setEditable(true);
        txtDescrcao.setEnabled(true);
        txtPreco.setEnabled(true);
        txtAnotacao.setEditable(true);
        impImposto.setEnabled(true);
        
        novo = false;
      
        txtDescrcao.requestFocus();
                
    }//GEN-LAST:event_btnEditarCadastroActionPerformed

    private void btnSalvarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCadastroActionPerformed
        if (txtIDProduto.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane,"Favor inserir um ID.");
            txtIDProduto.requestFocusInWindow();
            return;
        }
        
        if (impImposto.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane,"Favor Selecionar um Imposto.");
            impImposto.requestFocusInWindow();
            return;
        }
        
        
        if (txtDescrcao.getText().equals("") || txtPreco.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane,"Favor Prencher todos os campos.");
            return;
        }
        
        if (!Utilidades.isNumeric(txtPreco.getText())) {
            JOptionPane.showMessageDialog(rootPane,"Favor Digitar somente numeros.");
            txtPreco.requestFocusInWindow();
            return;
        }
        
        int preco = Integer.parseInt(txtPreco.getText());
        if (preco <= 0){
            JOptionPane.showMessageDialog(rootPane,"Favor Digitar um numero acima de zero.");
            txtPreco.requestFocusInWindow();
            return;
        }
        
        
       int pos = msDados.posicaoUsuario(txtIDProduto.getText());
       if(novo){
            if(pos != -1){
                JOptionPane.showMessageDialog(rootPane,"Este Produto já existe!");
                txtIDProduto.requestFocusInWindow();
                return;
            }
       } else {
           if (pos == -1) {
               JOptionPane.showMessageDialog(rootPane,"Este Produto ainda não existe!");
                txtIDProduto.requestFocusInWindow();
                return;
           }
       }
       
        Produto mProduto = new Produto(
                txtIDProduto.getText(),
                txtDescrcao.getText(),            
                preco,
                impImposto.getSelectedIndex(),
                txtAnotacao.getText());
        
        
        String msg;
        if(novo){
            msg = msDados.adicionarProduto(mProduto);
        } else {
            msg = msDados.editarProduto(mProduto, pos);
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
        txtIDProduto.setEditable(true);
        txtDescrcao.setEditable(true);
        txtPreco.setEditable(true);
        txtAnotacao.setEditable(true);
        impImposto.setEditable(true);
        
        preencherTabela();
        
    }//GEN-LAST:event_btnSalvarCadastroActionPerformed

    private void btnExcluirCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCadastroActionPerformed
        int resposta = JOptionPane.showConfirmDialog(rootPane,"Deseja realmente Deletar este Produto?");
        if (resposta != 0) {
            return;
        }
        
        String msg;
        msg = msDados.deletarProduto(prodAtual);
        JOptionPane.showMessageDialog(rootPane,msg);
        prodAtual= 0;
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
        String produto = JOptionPane.showInputDialog("Favor Inserir o código do Produtos");
        if(produto.equals("")) {
            return;
        } 

        int pos = msDados.posicaoProduto(produto);
        if(pos == -1) {
            JOptionPane.showMessageDialog(rootPane,"Este Produtos NÃO EXISTE");
            return;
        } 
            prodAtual = pos;
            mostrarProdutos();
        
    }//GEN-LAST:event_btnPesquisarCadastroActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        //voltar aqui para resolver problema de quando não tem nenhum item não abre o formulario
        // if (!msDados.getProdutos().equals("")){
        mostrarProdutos();
        preencherTabela();
        
    }//GEN-LAST:event_formInternalFrameOpened

    private void preencherTabela(){
        String titulos[] =  {"ID Produto", "Nome", "Preço", "Imposto", "Anotação"};
        String registro[] = new String[5];
        mTablela = new DefaultTableModel(null, titulos);
        for(int i =0; i < msDados.numeroProdutos(); i++) {
            registro[0] = msDados.getProdutos()[i].getIdProduto();
            registro[1] = msDados.getProdutos()[i].getDescircao();
            registro[2] = "" + msDados.getProdutos()[i].getPreco();
            registro[3] = msDados.getProdutos()[i].getAnotacao(); 
            registro[4] = Imposto(msDados.getProdutos()[i].getImposto());
            
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
    private javax.swing.JComboBox<String> impImposto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextArea txtAnotacao;
    private javax.swing.JTextField txtDescrcao;
    private javax.swing.JTextField txtIDProduto;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
