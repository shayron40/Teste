package br.edu.tablemodel;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import classes.Cliente;
import javax.swing.table.DefaultTableModel;

public class ClienteTableModel extends AbstractTableModel{

    private String[] colunas = new String[] {"Codigo", "Nome","Email" };
    private List<Cliente> clientes;
    
    public ClienteTableModel (List<Cliente> cliente){
        this.clientes = cliente;
    }
    
    public int getRowCount(){
        return this.clientes.size();
    }
    
    public int getColumCount(){
        return colunas.length;
    }
    
    public Object getValueAt(int rowIndex, int columIndex){
    Cliente cliente = clientes.get(rowIndex);
    switch (columIndex) {
        case 0:
            return cliente.getId();
        case 1:
            return cliente.getNome();
        case 2:
            return cliente.getEmail();
        default:
            break;
    }
    return null;
    }
    
    public Cliente getValueAt(int rowIndex){
        return clientes.get(rowIndex);
    }
   
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                    return colunas[0];
            case 1:
                    return colunas[1];
            case 2:
                return colunas[2];
            default:
                    break;
        }
            return null;
    }

    @Override
    public int getColumnCount() {
    return colunas.length;
    }
}
