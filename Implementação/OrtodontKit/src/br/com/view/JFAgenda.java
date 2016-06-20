/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.view;


import br.com.DAO.DAOEvento;
import br.com.model.HorarioFilter;
import br.com.model.bd.Cliente;
import br.com.model.tables.ModelTabelaAgenda;
import br.com.util.TextFieldFormatter;
import br.com.view.exibicao.JDListCliente;
import java.awt.event.KeyEvent;
import java.util.Calendar;

/**
 *
 * @author nakao<nakaosensei@gmail.com>
 */
public class JFAgenda extends javax.swing.JFrame {
    Cliente selecionado;
    //DAOEvento daoEvento = new DAOEvento();
    TextFieldFormatter validator = new TextFieldFormatter();
    ModelTabelaAgenda model = new ModelTabelaAgenda();
    /**
     * Creates new form JFAgenda
     */
    public JFAgenda() {
        initComponents();
        this.setLocationRelativeTo(null);
        formatarDatas();
        this.jTBAgenda.setModel(model);
    }

    void formatarDatas() {
        jXDate.setFormats("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        int ano = cal.get(Calendar.YEAR);
        int mes = cal.get(Calendar.MONTH);
        System.out.println(Calendar.JANUARY);
        int dia = cal.get(Calendar.DAY_OF_MONTH);
        mes++;
        String data = dia+"/"+mes+"/"+ano;
        jXDate.getEditor().setText(data);        
    }
    
    void formatarData(String data){
        String v[]=data.split(" ");
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPData = new javax.swing.JPanel();
        jXDate = new org.jdesktop.swingx.JXDatePicker();
        jBAddAgenda = new javax.swing.JButton();
        jBRmAgenda = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTBAgenda = new javax.swing.JTable();
        JPanelCliente = new javax.swing.JPanel();
        jbAddCli = new javax.swing.JButton();
        jbClearCli = new javax.swing.JButton();
        jBRmCli = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jBGravar = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jBAbrir = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jTFHora = validator.getIntegerTextField();
        jPanel17 = new javax.swing.JPanel();
        jTFMinuto = validator.getIntegerTextField();
        jPanel4 = new javax.swing.JPanel();
        jTFNomeCliente = validator.getIntegerTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPData.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Data"));

        javax.swing.GroupLayout jPDataLayout = new javax.swing.GroupLayout(jPData);
        jPData.setLayout(jPDataLayout);
        jPDataLayout.setHorizontalGroup(
            jPDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDataLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jXDate, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPDataLayout.setVerticalGroup(
            jPDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDataLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jXDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jBAddAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icons/Icons/add1_20.png"))); // NOI18N
        jBAddAgenda.setText("Marcar");
        jBAddAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddAgendaActionPerformed(evt);
            }
        });

        jBRmAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icons/Icons/close1_20.png"))); // NOI18N
        jBRmAgenda.setText("Desmarcar");

        jSplitPane1.setDividerLocation(1100);

        jTBAgenda.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTBAgenda);

        jSplitPane1.setLeftComponent(jScrollPane2);
        jSplitPane1.setInheritsPopupMenu(true);

        jSplitPane1.setOneTouchExpandable(true);

        jbAddCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icons/Icons/add32.png"))); // NOI18N

        jbClearCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icons/Icons/clear32.png"))); // NOI18N

        jBRmCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icons/Icons/close32.png"))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Filtro por Clientes");

        javax.swing.GroupLayout JPanelClienteLayout = new javax.swing.GroupLayout(JPanelCliente);
        JPanelCliente.setLayout(JPanelClienteLayout);
        JPanelClienteLayout.setHorizontalGroup(
            JPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(JPanelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelClienteLayout.createSequentialGroup()
                        .addComponent(jbAddCli, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbClearCli, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBRmCli, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPanelClienteLayout.setVerticalGroup(
            JPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelClienteLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbAddCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbClearCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBRmCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(JPanelCliente);

        jBGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icons/Icons/save16.png"))); // NOI18N
        jBGravar.setText("Gravar");

        jBSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icons/Icons/logout16.png"))); // NOI18N
        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        jBAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icons/Icons/bookOpen16.png"))); // NOI18N
        jBAbrir.setText("Abrir");
        jBAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAbrirActionPerformed(evt);
            }
        });

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Hora"));

        jTFHora.setBorder(null);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTFHora, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTFHora, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Minuto"));

        jTFMinuto.setBorder(null);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTFMinuto, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTFMinuto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cliente"));

        jTFNomeCliente.setBorder(null);
        jTFNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeClienteActionPerformed(evt);
            }
        });
        jTFNomeCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFNomeClienteKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTFNomeCliente)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTFNomeCliente, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBSair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBGravar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBAbrir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBAddAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBRmAgenda))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jBRmAgenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                        .addComponent(jBAddAgenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBAbrir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBSair)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBGravar)
                        .addGap(5, 5, 5))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAddAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddAgendaActionPerformed
        HorarioFilter hf = new HorarioFilter();
        hf.setData(jXDate.getEditor().getText());
        hf.setHorario(jTFHora+":"+jTFMinuto);
      
        hf.setIdDentista(1);
        hf.setNomeCliente(selecionado.getNome());
        hf.setIdCliente(selecionado.getId());
        
    }//GEN-LAST:event_jBAddAgendaActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSairActionPerformed

    private void jBAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAbrirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBAbrirActionPerformed

    private void jTFNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomeClienteActionPerformed

    private void jTFNomeClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNomeClienteKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_F2||evt.getKeyCode() == KeyEvent.VK_F7){
            JDListCliente jd = new JDListCliente(null, true);
            jd.setVisible(true);
            
            while(jd.isClosed==false&&jd.isAborted==false){};
            if(jd.isClosed=true){
                selecionado = jd.clienteSelecionado;
                if(selecionado!=null){
                    jTFNomeCliente.setText(selecionado.getNome());
                }
            }
        }
    }//GEN-LAST:event_jTFNomeClienteKeyPressed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelCliente;
    private javax.swing.JButton jBAbrir;
    private javax.swing.JButton jBAddAgenda;
    private javax.swing.JButton jBGravar;
    private javax.swing.JButton jBRmAgenda;
    private javax.swing.JButton jBRmCli;
    private javax.swing.JButton jBSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPData;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jTBAgenda;
    private javax.swing.JTextField jTFHora;
    private javax.swing.JTextField jTFID;
    private javax.swing.JTextField jTFID1;
    private javax.swing.JTextField jTFMinuto;
    private javax.swing.JTextField jTFNomeCliente;
    private javax.swing.JTable jTable1;
    private org.jdesktop.swingx.JXDatePicker jXDate;
    private javax.swing.JButton jbAddCli;
    private javax.swing.JButton jbClearCli;
    // End of variables declaration//GEN-END:variables
}
