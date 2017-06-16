package br.unileao.telas;

import DAO.FuncionarioDAO;
import br.edu.tablemodel.FuncionarioTableModel;
import classes.Funcionario;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

public class ListarFuncionarios extends javax.swing.JFrame {

 

    public ListarFuncionarios() {
        initComponents();
        listar();
    }
        /*
    Método DAO responsavel por pegar os dados do banco de dados e listar e inserir na tabela.
    */
    public static void listar(){
        FuncionarioDAO  ftm = new FuncionarioDAO();
        FuncionarioTableModel modelo = new FuncionarioTableModel(ftm.listar());
        tbfuncionario.setModel(modelo);
    }
    /*
    está checando se tem um linha selecionada se tiver vai pegar todos os dados do funcionario selecionado.
    */
    private Funcionario getFuncionario(){
        if(tbfuncionario.getSelectedRow() >= 0){
            try {
                FuncionarioTableModel ftm = (FuncionarioTableModel) tbfuncionario.getModel();
                Funcionario funcionario = ftm.getValueAt(tbfuncionario.getSelectedRow());
                return funcionario;
            } catch (Exception e) {
                System.out.println("Erro no get do funcionario " + e);
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
        tbfuncionario = new javax.swing.JTable();
        texto = new javax.swing.JLabel();
        btexcluir = new javax.swing.JButton();
        bteditar = new javax.swing.JButton();
        home = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbfuncionario.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbfuncionario);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 137, -1, 264));

        texto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        texto.setForeground(new java.awt.Color(255, 255, 255));
        texto.setText("  Listar Funcionario");
        getContentPane().add(texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 30, 224, 35));

        btexcluir.setText("Excluir");
        btexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btexcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btexcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 463, -1, -1));

        bteditar.setText("Editar");
        bteditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteditarActionPerformed(evt);
            }
        });
        getContentPane().add(bteditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 463, -1, -1));

        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        getContentPane().add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 42, -1, -1));

        jPanel1.setBackground(new java.awt.Color(100, 100, 100));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
      telaPrincipal telaPrincipal = new telaPrincipal();
      telaPrincipal.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_homeActionPerformed

    private void btexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexcluirActionPerformed
        /*
        Está checando se tem algum funcionario selecionado
        se for sim = 0
        */      
        if((JOptionPane.showConfirmDialog(null, "Deseja deletar o funcionario?") == 0) && getFuncionario() != null){
            try {
                FuncionarioDAO ctm = new FuncionarioDAO();
                /*
                Se ele for excluido aparece a mensagem.
                E depois atualiza os dados do banco de dados.
                */
                if(ctm.excluir(getFuncionario())){
                    JOptionPane.showMessageDialog(null, "Funcionario deletado com sucesso");
                    listar();
                }
            } catch (Exception e) {
                System.out.println("Erro no delete do Funcionario");
            }
        }
   
    }//GEN-LAST:event_btexcluirActionPerformed

    
    private void bteditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteditarActionPerformed
        if(getFuncionario() != null){
            /*
            Está criando uma variavel do tipo Jframe  e instanciando um novo cadastrarFuncionario e está pegando o Funcionario selecionado na tabela. 
            */
            cadastrarFuncionario caf = new cadastrarFuncionario(getFuncionario());
            caf.setVisibe(true);
        }
    }//GEN-LAST:event_bteditarActionPerformed

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
            java.util.logging.Logger.getLogger(ListarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bteditar;
    private javax.swing.JButton btexcluir;
    private javax.swing.JButton home;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable tbfuncionario;
    private javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables
}
