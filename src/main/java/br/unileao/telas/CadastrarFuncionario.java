package br.unileao.telas;

import DAO.FuncionarioDAO;
import classes.Funcionario;
import javax.swing.JOptionPane;

public class CadastrarFuncionario extends javax.swing.JFrame {

   
    public CadastrarFuncionario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo_Botoes = new javax.swing.ButtonGroup();
        funcionario = new javax.swing.JLabel();
        separador_Funcionario = new javax.swing.JSeparator();
        nome = new javax.swing.JLabel();
        campo_Nome = new javax.swing.JTextField();
        setor = new javax.swing.JLabel();
        campo_Setor = new javax.swing.JTextField();
        funcao = new javax.swing.JLabel();
        campo_Funcao = new javax.swing.JTextField();
        turno = new javax.swing.JLabel();
        sexo = new javax.swing.JLabel();
        caixaDeCombinacaoDoSexo = new javax.swing.JComboBox<>();
        dataDeNascimento = new javax.swing.JLabel();
        campo_DataDeNascimento = new javax.swing.JTextField();
        cadastrar = new javax.swing.JButton();
        fechar = new javax.swing.JButton();
        campo_Turno = new javax.swing.JComboBox<>();
        botao_home = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        funcionario.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        funcionario.setText("Cadastro de Funcionários");
        getContentPane().add(funcionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 250, 30));
        getContentPane().add(separador_Funcionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 62, 670, 20));

        nome.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        nome.setText("Nome*");
        getContentPane().add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 60, 30));
        getContentPane().add(campo_Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 370, 30));

        setor.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        setor.setText("Setor*");
        getContentPane().add(setor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 30));
        getContentPane().add(campo_Setor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 240, 30));

        funcao.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        funcao.setText("Função*");
        getContentPane().add(funcao, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, 30));
        getContentPane().add(campo_Funcao, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 290, 30));

        turno.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        turno.setText("Turno*");
        getContentPane().add(turno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 30));

        sexo.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        sexo.setText("Sexo*");
        getContentPane().add(sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, 30));

        caixaDeCombinacaoDoSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Masculino", "Feminino" }));
        getContentPane().add(caixaDeCombinacaoDoSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 110, 30));

        dataDeNascimento.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        dataDeNascimento.setText("Data de Nascimento*");
        getContentPane().add(dataDeNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, -1, 50));

        campo_DataDeNascimento.setText("      dd/mm/aa");
        campo_DataDeNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_DataDeNascimentoActionPerformed(evt);
            }
        });
        getContentPane().add(campo_DataDeNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 90, 30));

        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, -1, 30));

        fechar.setText("Fechar");
        fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharActionPerformed(evt);
            }
        });
        getContentPane().add(fechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, -1, 30));

        campo_Turno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Manhã", "Tarde", "Noite" }));
        campo_Turno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_TurnoActionPerformed(evt);
            }
        });
        getContentPane().add(campo_Turno, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 90, 30));

        botao_home.setText("Home");
        getContentPane().add(botao_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campo_DataDeNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_DataDeNascimentoActionPerformed
     
    }//GEN-LAST:event_campo_DataDeNascimentoActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Tem certeza que quer cadastrar?")== 0){
            Funcionario funcionario = new Funcionario();
            funcionario.setNome(campo_Nome.getText().toString());
            funcionario.setSetor(campo_Setor.getText().toString());
            funcionario.setFuncao(campo_Funcao.getText().toString());
            funcionario.setTurno(campo_Turno.getSelectedItem().toString());
            funcionario.setSexo(caixaDeCombinacaoDoSexo.getSelectedItem().toString());
            funcionario.setDataDeNascimento(campo_DataDeNascimento.getText().toString());
            FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
            funcionarioDAO.salvar(funcionario);
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!");
        }
        
    }//GEN-LAST:event_cadastrarActionPerformed

    private void fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja fechar?")== 0){
            this.dispose();
        }
        
    }//GEN-LAST:event_fecharActionPerformed

    private void campo_TurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_TurnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_TurnoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Grupo_Botoes;
    private javax.swing.JButton botao_home;
    private javax.swing.JButton cadastrar;
    private javax.swing.JComboBox<String> caixaDeCombinacaoDoSexo;
    private javax.swing.JTextField campo_DataDeNascimento;
    private javax.swing.JTextField campo_Funcao;
    private javax.swing.JTextField campo_Nome;
    private javax.swing.JTextField campo_Setor;
    private javax.swing.JComboBox<String> campo_Turno;
    private javax.swing.JLabel dataDeNascimento;
    private javax.swing.JButton fechar;
    private javax.swing.JLabel funcao;
    private javax.swing.JLabel funcionario;
    private javax.swing.JLabel nome;
    private javax.swing.JSeparator separador_Funcionario;
    private javax.swing.JLabel setor;
    private javax.swing.JLabel sexo;
    private javax.swing.JLabel turno;
    // End of variables declaration//GEN-END:variables
}
