package formularios;

import classes.Dados;
import classes.Opcoes;
import classes.Utilidades;
import static formularios.frmPrincipal.total;
import java.awt.Color;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AndersoNMN
 */
public class frmFinal extends javax.swing.JInternalFrame {
    
    private Dados msDados;
    private DefaultTableModel mTablela; 
    
    public void setDados(Dados msDados) {
        this.msDados = msDados;
    }

    /**
     * Creates new form frmFaturamento
     */
    public frmFinal() {
        initComponents();
        Color minhaCor = new Color (223,223,223);
        getContentPane().setBackground(minhaCor); // cor do form de login do sistema
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        btnFinalizarNota = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTotalFinal = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        descontoFinal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        entregaFinal = new javax.swing.JTextField();
        subTotalFinal = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JLabel();
        btnAplicarTotal = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        cmbCliente = new javax.swing.JComboBox<>();
        bntPesquisarClient = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        bntPesquisarClient1 = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        txtData = new javax.swing.JLabel();

        jButton7.setText("jButton7");

        setClosable(true);
        setIconifiable(true);
        setTitle("Formulario de Venda");
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

        btnFinalizarNota.setBackground(new java.awt.Color(42, 101, 158));
        btnFinalizarNota.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnFinalizarNota.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizarNota.setText("Finalizar");
        btnFinalizarNota.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFinalizarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarNotaActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(42, 101, 158));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Subtotal:");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("R$");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Entrega");

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("R$");

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total a pagar:");

        txtTotalFinal.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txtTotalFinal.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalFinal.setText("00,00");

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("R$");

        descontoFinal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        descontoFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descontoFinalActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Desconto");

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("%");

        entregaFinal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        entregaFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entregaFinalActionPerformed(evt);
            }
        });

        txtSubtotal.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txtSubtotal.setForeground(new java.awt.Color(255, 255, 255));
        txtSubtotal.setText("00,00");

        btnAplicarTotal.setText("Aplicar");
        btnAplicarTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1))
                        .addGap(0, 144, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAplicarTotal)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(entregaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(descontoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(subTotalFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(txtTotalFinal))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(txtSubtotal)))
                        .addGap(50, 50, 50))))
            .addComponent(jSeparator1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(subTotalFinal))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtSubtotal))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(descontoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(entregaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(btnAplicarTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtTotalFinal))
                .addGap(31, 31, 31))
        );

        jPanel2.setBackground(new java.awt.Color(197, 36, 43));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton3.setBackground(new java.awt.Color(42, 101, 158));
        jButton3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Cartão de Débito");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(42, 101, 158));
        jButton5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Dinheiro");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(42, 101, 158));
        jButton6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Pix");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(42, 101, 158));
        jButton4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Cartão de Crédito");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cmbCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        bntPesquisarClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-pesquisar-36.png"))); // NOI18N
        bntPesquisarClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntPesquisarClientActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Cliente");

        bntPesquisarClient1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-pesquisar-36.png"))); // NOI18N
        bntPesquisarClient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntPesquisarClient1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bntPesquisarClient1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(140, 140, 140)
                .addComponent(bntPesquisarClient)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bntPesquisarClient)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bntPesquisarClient1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        btnVoltar.setBackground(new java.awt.Color(42, 101, 158));
        btnVoltar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        txtData.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        txtData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFinalizarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(359, 359, 359))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtData, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFinalizarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21))
        );

        setBounds(0, 0, 780, 528);
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        Opcoes opc = new Opcoes("andersonmoura812@gmail.com", "Selecione um cliente");
        cmbCliente.addItem(opc.toString());

        for (int i = 0; i<msDados.numeroClientes(); i++) {
            opc = new Opcoes(
                  msDados.getClientes()[i].getIdCliente(),
                  msDados.getClientes()[i].getNome() +""+
                  msDados.getClientes()[i].getSobreNome());
                  cmbCliente.addItem(opc.toString());
        }        
         
        txtData.setText(Utilidades.getDate());
        
        char c[] = total.toCharArray();
        int size = total.length();
        for(int i = 1; i < size; i++)
        {
            if (c[i] == ',') c[i] = '.';
        }
        String str = String.valueOf(c);
        txtSubtotal.setText("" + str);
          
        //double subtotal = Double.valueOf(txtSubtotal.getText()).doubleValue();
          
    }//GEN-LAST:event_formInternalFrameOpened

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void bntPesquisarClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntPesquisarClientActionPerformed

    }//GEN-LAST:event_bntPesquisarClientActionPerformed

    private void bntPesquisarClient1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntPesquisarClient1ActionPerformed
        frmPesqClient mPesqCliente;
        mPesqCliente = new frmPesqClient(null, closable);
        mPesqCliente.setDados(msDados);
        mPesqCliente.setLocationRelativeTo(null);
        mPesqCliente.setVisible(true);
        String rta = mPesqCliente.getResposta();
        if(rta.equals("")){
            return;
        }
        //        for(int i =0; i<cmbCliente.getItemCount(); i++) {;
            //            if(((Opcoes)cmbCliente.getItemAt(i)).getValor().equals(rta)){
                //                cmbCliente.setSelectedIndex(i);
                //                return;
                //            }
            //        }
    }//GEN-LAST:event_bntPesquisarClient1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnFinalizarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarNotaActionPerformed
        if(cmbCliente.getSelectedIndex()==0) {
            JOptionPane.showMessageDialog(rootPane,"Favor Selecionar um cliente!");
            cmbCliente.requestFocusInWindow();
            return;
        }
        
        if(descontoFinal.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane,"Favor adicione um desconto!");
            descontoFinal.requestFocusInWindow();
            return;
        }
        
        if(entregaFinal.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane,"Favor adicione um valor de entrega!");
            entregaFinal.requestFocusInWindow();
            return;
        }
        
        if(txtTotalFinal.getText().equals("00,00")) {
            JOptionPane.showMessageDialog(rootPane,"Favor Aplique os valores de desconto e entrega!");
            btnAplicarTotal.requestFocusInWindow();
            return;
        }
        
        int resposta = JOptionPane.showConfirmDialog(rootPane,"Deseja realizar a venda?");
        if (resposta != 0) {
            return;
        }
        
        int numFatura = msDados.getNumeroFatura()+1;
        
        FileWriter fw = null;
        PrintWriter pw = null;
            try {
                fw = new FileWriter("Data/Fatura.txt", true);
                pw = new PrintWriter(fw);
                
                var opcItemVal = (cmbCliente.getSelectedItem().toString());
                //System.out.println("360 ---->" + opcItemVal);
                
                var auxiliar = "1|"
                        +numFatura + "|"
                        +opcItemVal +"|"
                        +txtTotalFinal.getText()+"|"
                        +txtData.getText();
                
                
                pw.println("----------------------------");                      
                pw.println(auxiliar);
                pw.println("----------------------------");
             

            } catch (Exception e1) {
                e1.printStackTrace();
                
            } finally{
                try {
                    if(fw != null) {
                        fw.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            
            JOptionPane.showMessageDialog(rootPane,"Venda " + numFatura+ " REALIZADA COM SUCESSO!");
            msDados.setNumeroFatura(numFatura);
            cmbCliente.setSelectedIndex(0);
            this.dispose();
    }//GEN-LAST:event_btnFinalizarNotaActionPerformed

    private void btnAplicarTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarTotalActionPerformed

        double entrega = Double.valueOf(entregaFinal.getText()).doubleValue();
        double desconto = Double.valueOf(descontoFinal.getText()).doubleValue();
        double subtotal = Double.valueOf(txtSubtotal.getText()).doubleValue();

        double totalFinal = entrega + (subtotal - ((desconto / 100) * subtotal));

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        //txtValorTot.setText("" + somaQuant);
        var formatadoValFinal = decimalFormat.format(totalFinal);

        txtTotalFinal.setText("" + formatadoValFinal);
    }//GEN-LAST:event_btnAplicarTotalActionPerformed

    private void entregaFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entregaFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entregaFinalActionPerformed

    private void descontoFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descontoFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descontoFinalActionPerformed

        
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntPesquisarClient;
    private javax.swing.JButton bntPesquisarClient1;
    private javax.swing.JButton btnAplicarTotal;
    private javax.swing.JButton btnFinalizarNota;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cmbCliente;
    private javax.swing.JTextField descontoFinal;
    private javax.swing.JTextField entregaFinal;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JLabel subTotalFinal;
    private javax.swing.JLabel txtData;
    private javax.swing.JLabel txtSubtotal;
    private javax.swing.JLabel txtTotalFinal;
    // End of variables declaration//GEN-END:variables
        

//Cria os titulos da tabela de venda 
    private void preencherTabelaVenda(){
//        String titulos[] =  {"ID Produto", "Descrição", "Preço", "Quantidade", "Valor"};
//        String registro[] = new String[5];
//        mTablela = new DefaultTableModel(null, titulos);
//        tblDetalhesVenda.setModel(mTablela);
//        
//        DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
//        dtcr.setHorizontalAlignment(SwingConstants.RIGHT); // Metodo para alinha os item a direita
//        tblDetalhesVenda.getColumnModel().getColumn(2).setCellRenderer(dtcr);
//        tblDetalhesVenda.getColumnModel().getColumn(3).setCellRenderer(dtcr);
//        tblDetalhesVenda.getColumnModel().getColumn(4).setCellRenderer(dtcr);
    }
    

    
    
}


