package br.unileao.telas;

import DAO.ClienteDAO;
import classes.Cliente;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TCadCliente extends JFrame{
    private JPanel contentPane;
	private JTextField campo_Nome;
	private Cliente cliente;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TCadCliente frame = new TCadCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TCadCliente() {
		initComponents();
	}
	
	public TCadCliente(Cliente cliente){
		initComponents();
		this.cliente = cliente;
		tfNome.setText(cliente.getNome());
	}
	
	public void limpaCampos(){
		tfNome.setText("");
	}
	
	public void initComponents(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfNome = new JTextField();
		tfNome.setBounds(0, 49, 114, 19);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		JButton btSalvar = new JButton("New button");
		btSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cliente.getId()==null){
					cliente = new Cliente();
				}
				
				cliente.setNome(tfNome.getText().toString());
				
				ClienteDAO clienteDAO = new ClienteDAO();
				if(cliente.getId()==null){
					clienteDAO.salvar(cliente);
				} else {
					clienteDAO.editar(cliente);
				}
				limpaCampos();
				JOptionPane.showMessageDialog(null, 
						"Cliente cadastrado com sucesso!");
			}
		});
		btSalvar.setBounds(12, 183, 117, 25);
		contentPane.add(btSalvar);
	}

}
