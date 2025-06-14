
import javax.swing.DefaultListModel;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author HP
 */
public class GUICollection2 extends javax.swing.JFrame {

    DefaultListModel<String> dlm;
    List<String> items = new ArrayList<>();
    Set<String> itemsSet = new HashSet<>();
    Map<Integer, String> itemsMap = new HashMap<>();
    String[] datas = {"buku", "meja", "kursi", "tas", "pintu jati"};
    
    /**
     * Creates new form GUIsimple
     */
    public GUICollection2() {
        initComponents();
        this.dlm = new DefaultListModel<>();
        this.jListItem.setModel(dlm);
        
        for (String data : datas){
            this.dlm.addElement(data);
            this.items.add(data); 
            this.itemsSet.add(data);
            this.itemsMap.put(this.itemsMap.size(), data);
        }
        updateAllDataCount();
    }
    
    private void addItem(String namaItem){
        if (!namaItem.trim().isEmpty()) {
        dlm.addElement (namaItem);
        }
    }
    
    private void updateAllDataCount(){
        jLabel2.setText("Data tersimpan = " + items.size());
        jLabel3.setText("Data tersimpan = " + itemsSet.size());
        jLabel4.setText("Data tersimpan = " + itemsMap.size());
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
        jListItem = new javax.swing.JList<>();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonAdd = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonClearAlll = new javax.swing.JButton();
        jButtonInsertdataList = new javax.swing.JButton();
        jButtonSavetoList = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonSavetoSet = new javax.swing.JButton();
        jButtonInsertdataSet = new javax.swing.JButton();
        jButtonSavetoMap = new javax.swing.JButton();
        jButtonInsertdataMap = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(jListItem);

        jLabel1.setText("Nama Item:");

        jButtonAdd.setText("  Add  ");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonUpdate.setText(" Update ");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonClearAlll.setText("Clear All");
        jButtonClearAlll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearAlllActionPerformed(evt);
            }
        });

        jButtonInsertdataList.setText("<- Insert data List");
        jButtonInsertdataList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertdataListActionPerformed(evt);
            }
        });

        jButtonSavetoList.setText("  Save to List ->   ");
        jButtonSavetoList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSavetoListActionPerformed(evt);
            }
        });

        jLabel2.setText("Data tersimpan = 4");

        jButtonSavetoSet.setText("  Save to Set ->   ");
        jButtonSavetoSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSavetoSetActionPerformed(evt);
            }
        });

        jButtonInsertdataSet.setText("<- Insert data Set");
        jButtonInsertdataSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertdataSetActionPerformed(evt);
            }
        });

        jButtonSavetoMap.setText("  Save to Map ->   ");
        jButtonSavetoMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSavetoMapActionPerformed(evt);
            }
        });

        jButtonInsertdataMap.setText("<- Insert data Map");
        jButtonInsertdataMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertdataMapActionPerformed(evt);
            }
        });

        jLabel3.setText("Data tersimpan = 7");

        jLabel4.setText("Data tersimpan = 9");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonClearAlll)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAdd)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDelete)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonSavetoList)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addComponent(jButtonInsertdataList)
                                    .addComponent(jButtonInsertdataSet)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonSavetoMap)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4))
                                    .addComponent(jButtonInsertdataMap)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonSavetoSet)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField2)
                                        .addGap(111, 111, 111)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jButtonSavetoList))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonInsertdataList)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSavetoSet)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonInsertdataSet)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSavetoMap)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonInsertdataMap)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonClearAlll)
                    .addComponent(jButtonAdd)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonDelete))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        addItem(jTextField2.getText());
        
        jTextField2.setText("");
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        int index = jListItem.getSelectedIndex();
        dlm.removeElementAt(index);
        
        jTextField2.setText("");
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        int index = jListItem.getSelectedIndex();
        String selected = jTextField2.getText();
        dlm.setElementAt(selected, index);
        
        jTextField2.setText("");
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonClearAlllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearAlllActionPerformed
        dlm.clear();
    }//GEN-LAST:event_jButtonClearAlllActionPerformed

    private void jButtonInsertdataListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertdataListActionPerformed
        //String[] items = {"buku", "meja", "kursi", "tas", "pintu"};
        dlm.clear();
        for (String item : items){
            dlm.addElement(item);
        }
    }//GEN-LAST:event_jButtonInsertdataListActionPerformed

    private void jButtonSavetoListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSavetoListActionPerformed
        if (!items.isEmpty()){
            items.clear();
        }
        
        for(int i = 0; i < dlm.getSize(); i++){
            items.add(dlm.getElementAt(i));
        }
        
        updateAllDataCount();
    }//GEN-LAST:event_jButtonSavetoListActionPerformed

    private void jButtonSavetoSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSavetoSetActionPerformed
        itemsSet.clear();
        for (int i = 0; i < dlm.getSize(); i++) {
            itemsSet.add(dlm.getElementAt(i));
        }
        updateAllDataCount();
    }//GEN-LAST:event_jButtonSavetoSetActionPerformed

    private void jButtonInsertdataSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertdataSetActionPerformed
        dlm.clear();
        for (String item : itemsSet) {
            dlm.addElement(item);
        }
    }//GEN-LAST:event_jButtonInsertdataSetActionPerformed

    private void jButtonSavetoMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSavetoMapActionPerformed
        itemsMap.clear();
        for (int i = 0; i < dlm.getSize(); i++) {
            itemsMap.put(i, dlm.getElementAt(i));
        }
        updateAllDataCount();
    }//GEN-LAST:event_jButtonSavetoMapActionPerformed

    private void jButtonInsertdataMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertdataMapActionPerformed
        dlm.clear();
        for (Map.Entry<Integer, String> entry : itemsMap.entrySet()) {
            dlm.addElement(entry.getValue());
        }
    }//GEN-LAST:event_jButtonInsertdataMapActionPerformed
    
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
            java.util.logging.Logger.getLogger(GUICollection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUICollection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUICollection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUICollection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUICollection2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonClearAlll;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsertdataList;
    private javax.swing.JButton jButtonInsertdataMap;
    private javax.swing.JButton jButtonInsertdataSet;
    private javax.swing.JButton jButtonSavetoList;
    private javax.swing.JButton jButtonSavetoMap;
    private javax.swing.JButton jButtonSavetoSet;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jListItem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}

