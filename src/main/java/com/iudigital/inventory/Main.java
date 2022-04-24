package com.iudigital.inventory;

import com.iudigital.inventory.client.InventoryClient;
import com.iudigital.inventory.client.dto.InventoryDTO;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame {
    
    private final InventoryClient inventoryClient;
    
    private static final String[] COLUMNS = { "Serial", "Modelo", 
        "Descripción", "Color", "Fecha Compra", "Precio", 
        "Usuario", "Marca", "Estado", "Tipo" };
    
    public Main() {
        initComponents();
        inventoryClient = new InventoryClient();
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        this.setResizable(false);
        initData();
    }

    private void initData() {
        DefaultTableModel model = new DefaultTableModel();
        
        Arrays.asList(COLUMNS).forEach(column -> model.addColumn(column));
        
        tblInventories.setModel(model);
        
        try {
            List<InventoryDTO> inventories = inventoryClient.getInventories();
            model.setRowCount(inventories.size());
            AtomicInteger atomicInteger = new AtomicInteger(0);
            inventories.forEach(inv -> {
                model.setValueAt(inv.getSerial(), atomicInteger.get(), 0);
                model.setValueAt(inv.getModel(), atomicInteger.get(), 1);
                model.setValueAt(inv.getDescription(), atomicInteger.get(), 2);
                model.setValueAt(inv.getColor(), atomicInteger.get(), 3);
                model.setValueAt(inv.getPurchaseDate(), atomicInteger.get(), 4);
                model.setValueAt(inv.getPrice(), atomicInteger.get(), 5);
                model.setValueAt(inv.getUser().getName(), atomicInteger.get(), 6);
                model.setValueAt(inv.getBrand().getName(), atomicInteger.get(), 7);
                model.setValueAt(inv.getEquipmentStatus().getName(), atomicInteger.get(), 8);
                model.setValueAt(inv.getEquipmentType().getName(), atomicInteger.get(), 9);
                atomicInteger.getAndIncrement();
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInventories = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inventarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        tblInventories.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblInventories);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblInventories;
    // End of variables declaration//GEN-END:variables
}