package br.unileao.telas;

import DAO.ClienteDAO;
import classes.Cliente;
import javax.swing.JOptionPane;


public class CadastrarCliente extends javax.swing.JFrame {

    
    public CadastrarCliente() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cliente = new javax.swing.JLabel();
        separador_Cliente = new javax.swing.JSeparator();
        Nome = new javax.swing.JLabel();
        campo_Nome = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        campo_Email = new javax.swing.JTextField();
        dataDeNascimento = new javax.swing.JLabel();
        campo_DataDeNascimento = new javax.swing.JTextField();
        cidade = new javax.swing.JLabel();
        campo_Cidade = new javax.swing.JTextField();
        sexo = new javax.swing.JLabel();
        caixaDeCombinacaoDoSexo = new javax.swing.JComboBox<>();
        senha = new javax.swing.JLabel();
        campo_Senha = new javax.swing.JTextField();
        cadastrar = new javax.swing.JButton();
        fechar = new javax.swing.JButton();
        endereco = new javax.swing.JLabel();
        campo_Endereco = new javax.swing.JTextField();
        estado = new javax.swing.JLabel();
        campo_Estado = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cliente.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        cliente.setText("Cadastro de Clientes");
        getContentPane().add(cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 230, 40));
        getContentPane().add(separador_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 62, 670, 10));

        Nome.setText("Nome*");
        getContentPane().add(Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 30));
        getContentPane().add(campo_Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 290, 30));

        email.setText("E-mail*");
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 30));
        getContentPane().add(campo_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 290, 30));

        dataDeNascimento.setText("Data de Nascimento*");
        getContentPane().add(dataDeNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, 30));

        campo_DataDeNascimento.setText("        dd/mm/aa");
        getContentPane().add(campo_DataDeNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 110, 30));

        cidade.setText("Cidade*");
        getContentPane().add(cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, 30));
        getContentPane().add(campo_Cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 210, 30));

        sexo.setText("Sexo*");
        getContentPane().add(sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, 30));

        caixaDeCombinacaoDoSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Masculino", "Feminino" }));
        getContentPane().add(caixaDeCombinacaoDoSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 80, 30));

        senha.setText("Senha*");
        getContentPane().add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, 70));
        getContentPane().add(campo_Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 140, 30));

        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, -1, -1));

        fechar.setText("Fechar");
        getContentPane().add(fechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, -1, -1));

        endereco.setText("Endereço*");
        getContentPane().add(endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 60, 30));
        getContentPane().add(campo_Endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 240, 30));

        estado.setText("Estado*");
        getContentPane().add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 50, 30));
        getContentPane().add(campo_Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 130, 30));

        jButton1.setText("Home");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
       if(JOptionPane.showConfirmDialog(null, "Tem certeza que deseja cadastrar")== 0){
           Cliente cliente = new Cliente();
           cliente.setNome(campo_Nome.getText().toString());
           cliente.setEmail(campo_Email.getText().toString());
           cliente.setEstado(campo_Estado.getText().toString());
           cliente.setCidade(campo_Cidade.getText().toString());
           cliente.setEndereco(campo_Endereco.getText().toString());
           cliente.setSexo(caixaDeCombinacaoDoSexo.getSelectedItem().toString());
           cliente.setDataDeNascimento(campo_DataDeNascimento.getText().toString());
           cliente.setSenha(campo_Senha.getText().toString());
           ClienteDAO clienteDAO = new ClienteDAO();
           clienteDAO.salvar(cliente);
           JOptionPane.showMessageDialog(null, "Cadastrado Com Sucesso");
           
           
       }
        
    }//GEN-LAST:event_cadastrarActionPerformed
     
    
    
    private void fecharActionPerformed(java.awt.ActiveEvent evt) {
        if(JOptionPane.showConfirmDialog(null, "Tem certeza que deseja fechar?")== 0){
            this.dispose();
        }
        
    }
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
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nome;
    private javax.swing.JButton cadastrar;
    private javax.swing.JComboBox<String> caixaDeCombinacaoDoSexo;
    private javax.swing.JTextField campo_Cidade;
    private javax.swing.JTextField campo_DataDeNascimento;
    private javax.swing.JTextField campo_Email;
    private javax.swing.JTextField campo_Endereco;
    private javax.swing.JTextField campo_Estado;
    private javax.swing.JTextField campo_Nome;
    private javax.swing.JTextField campo_Senha;
    private javax.swing.JLabel cidade;
    private javax.swing.JLabel cliente;
    private javax.swing.JLabel dataDeNascimento;
    private javax.swing.JLabel email;
    private javax.swing.JLabel endereco;
    private javax.swing.JLabel estado;
    private javax.swing.JButton fechar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel senha;
    private javax.swing.JSeparator separador_Cliente;
    private javax.swing.JLabel sexo;
    // End of variables declaration//GEN-END:variables
}
