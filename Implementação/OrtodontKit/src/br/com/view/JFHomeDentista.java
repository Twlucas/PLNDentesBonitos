/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.view;

import br.com.model.bd.Dentista;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;

/**
 *
 * @author a1061712
 */
public class JFHomeDentista extends javax.swing.JFrame {
    private Dentista owner;
    /**
     * Creates new form JFHome
     */
    public JFHomeDentista(Dentista owner) {
        this.owner=owner;
        initComponents();
        this.setLocationRelativeTo(null);
        addListeners();
    }

    private void addListeners(){
        this.addWindowListener( new WindowListener(){
            public void windowClosing( WindowEvent e ){
                close();
            }
            public void windowClosed( WindowEvent e ){
                
                JFLogin jf = new JFLogin();
                jf.setVisible(true);
            }

            @Override
            public void windowOpened(WindowEvent e) {
            //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowIconified(WindowEvent e) {
            //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowActivated(WindowEvent e) {
            //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabelBackGround = new javax.swing.JLabel();
        jBAgenda = new javax.swing.JButton();
        jBRecibo = new javax.swing.JButton();
        jBTratamento = new javax.swing.JButton();
        jBSecretaria = new javax.swing.JButton();
        jBCliente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jBSair = new javax.swing.JButton();
        jBRelatorios = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuTramento = new javax.swing.JMenu();
        jMIStartTratamento = new javax.swing.JMenuItem();
        jMenuAgenda = new javax.swing.JMenu();
        jMIVer = new javax.swing.JMenuItem();
        jMenuRecibos = new javax.swing.JMenu();
        jMIEmitirRecibo = new javax.swing.JMenuItem();
        JMenuCadastros = new javax.swing.JMenu();
        jMICliente = new javax.swing.JMenuItem();
        jMISecretaria = new javax.swing.JMenuItem();
        jMIDentista = new javax.swing.JMenuItem();
        Relatórios = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icons/Icons/agenda48.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jLabelBackGround.setFont(new java.awt.Font("TakaoPGothic", 1, 14)); // NOI18N
        jLabelBackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icons/Icons/logo128.png"))); // NOI18N
        jLabelBackGround.setText("Ortodont System");

        jBAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icons/Icons/agenda48.png"))); // NOI18N
        jBAgenda.setText("Agenda");
        jBAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgendaActionPerformed(evt);
            }
        });

        jBRecibo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icons/Icons/recibo48.png"))); // NOI18N
        jBRecibo.setText("Recibos");
        jBRecibo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBReciboActionPerformed(evt);
            }
        });

        jBTratamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icons/Icons/tratamento48.png"))); // NOI18N
        jBTratamento.setText("Tratamento");
        jBTratamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTratamentoActionPerformed(evt);
            }
        });

        jBSecretaria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icons/Icons/secretaria48.png"))); // NOI18N
        jBSecretaria.setText("Secretaria");
        jBSecretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSecretariaActionPerformed(evt);
            }
        });

        jBCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icons/Icons/cliente48.png"))); // NOI18N
        jBCliente.setText("Cliente");
        jBCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBClienteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icons/Logo/nkStation16.png"))); // NOI18N
        jLabel3.setText("Powered by Nk Station");

        jBSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icons/Icons/logout48.png"))); // NOI18N
        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        jBRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icons/Icons/report48.png"))); // NOI18N
        jBRelatorios.setText("Relatorios");

        jMenuTramento.setText("Tratamento");

        jMIStartTratamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMIStartTratamento.setText("Iniciar Tratamento");
        jMIStartTratamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIStartTratamentoActionPerformed(evt);
            }
        });
        jMenuTramento.add(jMIStartTratamento);

        jMenuBar1.add(jMenuTramento);

        jMenuAgenda.setText("Agenda");

        jMIVer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMIVer.setText("Abrir");
        jMIVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIVerActionPerformed(evt);
            }
        });
        jMenuAgenda.add(jMIVer);

        jMenuBar1.add(jMenuAgenda);

        jMenuRecibos.setText("Recibo");

        jMIEmitirRecibo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMIEmitirRecibo.setText("Emitir ");
        jMenuRecibos.add(jMIEmitirRecibo);

        jMenuBar1.add(jMenuRecibos);

        JMenuCadastros.setText("Cadastros");
        JMenuCadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuCadastrosActionPerformed(evt);
            }
        });

        jMICliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        jMICliente.setText("Cadastrar Cliente");
        jMICliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIClienteActionPerformed(evt);
            }
        });
        JMenuCadastros.add(jMICliente);

        jMISecretaria.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
        jMISecretaria.setText("Cadastrar Secretária");
        jMISecretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISecretariaActionPerformed(evt);
            }
        });
        JMenuCadastros.add(jMISecretaria);

        jMIDentista.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_MASK));
        jMIDentista.setText("Cadastrar Dentista");
        jMIDentista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIDentistaActionPerformed(evt);
            }
        });
        JMenuCadastros.add(jMIDentista);

        jMenuBar1.add(JMenuCadastros);

        Relatórios.setText("Relatórios");

        jMenuItem1.setText("Relatorio de Recibos");
        Relatórios.add(jMenuItem1);

        jMenuItem2.setText("Relatorio de Clientes");
        Relatórios.add(jMenuItem2);

        jMenuBar1.add(Relatórios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelBackGround, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBAgenda, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(jBCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBTratamento, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(jBSecretaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBSair, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(jBRecibo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBRelatorios, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                        .addGap(5, 5, 5))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jBAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(3, 3, 3)
                            .addComponent(jBCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jBTratamento, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBRecibo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(53, 53, 53)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(3, 3, 3)
                .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3))
            .addComponent(jLabelBackGround, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMIVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIVerActionPerformed
        JFAgenda jfa = new JFAgenda(owner);
        jfa.setVisible(true);
    }//GEN-LAST:event_jMIVerActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        close();
    }//GEN-LAST:event_jBSairActionPerformed

    private void crudClienteAction(){
        JDCRUDCliente jd = new JDCRUDCliente(this, true);
        jd.setVisible(true);
    }
    
    private void jMIClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIClienteActionPerformed
        crudClienteAction();
    }//GEN-LAST:event_jMIClienteActionPerformed

    private void jBReciboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBReciboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBReciboActionPerformed

    private void doCrudSecretariaAction(){
        JDCRUDSecretaria jd = new JDCRUDSecretaria(this, true,owner);
        jd.setVisible(true);
    }
    
    private void jBSecretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSecretariaActionPerformed
        doCrudSecretariaAction();
    }//GEN-LAST:event_jBSecretariaActionPerformed

    private void jBClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBClienteActionPerformed
        crudClienteAction();
    }//GEN-LAST:event_jBClienteActionPerformed

    private void JMenuCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuCadastrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JMenuCadastrosActionPerformed

    private void jBAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgendaActionPerformed
        JFAgenda jda = new JFAgenda(owner);
        jda.setVisible(true);
    }//GEN-LAST:event_jBAgendaActionPerformed

    private void jMISecretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISecretariaActionPerformed
        doCrudSecretariaAction();
    }//GEN-LAST:event_jMISecretariaActionPerformed

    private void jMIDentistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIDentistaActionPerformed
        JDCRUDDentista jd = new JDCRUDDentista(this, true);
        jd.setVisible(true);
    }//GEN-LAST:event_jMIDentistaActionPerformed

    private void jMIStartTratamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIStartTratamentoActionPerformed
        doTratamentoAction();
    }//GEN-LAST:event_jMIStartTratamentoActionPerformed

    private void doTratamentoAction(){
        JFTratamento jft = new JFTratamento();
        jft.setVisible(true);
    }
    
    private void jBTratamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTratamentoActionPerformed
        doTratamentoAction();
    }//GEN-LAST:event_jBTratamentoActionPerformed
    
    private void close(){
        int res = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?");
        if(res==0){
            this.dispose();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMenuCadastros;
    private javax.swing.JMenu Relatórios;
    private javax.swing.JButton jBAgenda;
    private javax.swing.JButton jBCliente;
    private javax.swing.JButton jBRecibo;
    private javax.swing.JButton jBRelatorios;
    private javax.swing.JButton jBSair;
    private javax.swing.JButton jBSecretaria;
    private javax.swing.JButton jBTratamento;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelBackGround;
    private javax.swing.JMenuItem jMICliente;
    private javax.swing.JMenuItem jMIDentista;
    private javax.swing.JMenuItem jMIEmitirRecibo;
    private javax.swing.JMenuItem jMISecretaria;
    private javax.swing.JMenuItem jMIStartTratamento;
    private javax.swing.JMenuItem jMIVer;
    private javax.swing.JMenu jMenuAgenda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu jMenuRecibos;
    private javax.swing.JMenu jMenuTramento;
    // End of variables declaration//GEN-END:variables
}
