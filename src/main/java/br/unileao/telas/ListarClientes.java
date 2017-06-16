
package br.unileao.telas;

import DAO.ClienteDAO;
import br.edu.tablemodel.ClienteTableModel;
import classes.Cliente;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;


public class ListarClientes extends javax.swing.JFrame {

    
    public ListarClientes() {
        initComponents();
        listar();
    }
    
    public static void listar(){
        ClienteDAO clD = new ClienteDAO();
        ClienteTableModel modelo = new ClienteTableModel(clD.listar());
        tbclientes.setModel(modelo);
    }
    
    private Cliente getCliente(){
        if(tbclientes.getSelectedRow() >= 0){
            try {
                ClienteTableModel ctm = (ClienteTableModel) tbclientes.getModel();
                Cliente cliente = ctm.getValueAt(tbclientes.getSelectedRow());
                return cliente;
            } catch (Exception e) {
                System.out.println("Erro no get do cliente " + e);
                return null;
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linnha primeiro.");
            return null;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbclientes = new javax.swing.JTable();
        home = new javax.swing.JButton();
        btexcluir = new javax.swing.JButton();
        bteditar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbclientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbclientes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 99, 620, 244));

        home.setText("Home");
        home.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        getContentPane().add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 37, -1, -1));

        btexcluir.setText("Excluir");
        btexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btexcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btexcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 403, -1, -1));

        bteditar.setText("Editar");
        bteditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteditarActionPerformed(evt);
            }
        });
        getContentPane().add(bteditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 403, -1, -1));

        jPanel1.setBackground(new java.awt.Color(100, 100, 100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Listar Clientes");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 11, 160, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
      telaPrincipal telaPrincipal = new telaPrincipal();
      telaPrincipal.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_homeActionPerformed

    private void bteditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteditarActionPerformed
        cadastrarCliente c = new cadastrarCliente(getCliente());
        c.setVisible(true);
    }//GEN-LAST:event_bteditarActionPerformed

    private void btexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexcluirActionPerformed
        if((JOptionPane.showConfirmDialog(null, "Deseja deletar o cliente?") == 0) && getCliente() != null){
            try {
                ClienteDAO clD = new ClienteDAO();
                if(clD.excluir(getCliente())){
                    JOptionPane.showMessageDialog(null, "Cliente deletado com sucesso");
                    listar();
                }
            } catch (Exception e) {
                System.out.println("Erro no delete do cliente");
            }
        }
    }//GEN-LAST:event_btexcluirActionPerformed

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
            java.util.logging.Logger.getLogger(ListarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bteditar;
    private javax.swing.JButton btexcluir;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable tbclientes;
    // End of variables declaration//GEN-END:variables
}
