
package br.unileao.telas;

import DAO.ClienteDAO;
import br.edu.tablemodel.ClienteTableModel;
import classes.Cliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class TListaCliente {
    private JPanel contentPane;
	private JTable tbClientes;
	private JButton btnEditar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TListaCliente frame = new TListaCliente();
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
	public TListaCliente() {
		initComponents();
		atualizaTabelaCliente();
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tbClientes.getSelectedRow()<0){
					JOptionPane.showMessageDialog(null, 
							"Selecione uma linha!");
				} else {
					ClienteTableModel ctm = (ClienteTableModel) 
												tbClientes.getModel();
					Cliente clienteASerExcluido = 
									ctm.getValueAt(tbClientes.getSelectedRow());
					ClienteDAO clienteDAO = new ClienteDAO();
					clienteDAO.deletar(clienteASerExcluido);
					atualizaTabelaCliente();
				}
			}
		});
		btnExcluir.setBounds(218, 261, 117, 25);
		contentPane.add(btnExcluir);
		
		btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tbClientes.getSelectedRow()<0){
					JOptionPane.showMessageDialog(null, 
							"Selecione uma linha!");
				} else {
					ClienteTableModel ctm = 
							(ClienteTableModel) tbClientes.getModel();
					Cliente clienteASerEditado = 
							ctm.getValueAt(tbClientes.getSelectedRow());
					TCadCliente tcc = new TCadCliente(clienteASerEditado);
					tcc.setVisible(true);
					atualizaTabelaCliente();
				}
			}
		});
		btnEditar.setBounds(350, 261, 117, 25);
		contentPane.add(btnEditar);
	}
	
	public void initComponents(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tbClientes = new JTable();
		tbClientes.setBounds(12, 24, 404, 214);
		contentPane.add(tbClientes);
	}
	
	public void atualizaTabelaCliente(){
		ClienteDAO clienteDAO = new ClienteDAO();
		ClienteTableModel ctm = 
				new ClienteTableModel(clienteDAO.listar());
		tbClientes.setModel(ctm);
	}
}
