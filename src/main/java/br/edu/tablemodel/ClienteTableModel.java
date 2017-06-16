package br.edu.tablemodel;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import classes.Cliente;
import javax.swing.table.DefaultTableModel;

public class ClienteTableModel extends AbstractTableModel{

    private String[] colunas = new String[] {"Codigo", "Nome","Email","DataDeNascimento","Endereço","Cidade","Estado" };
    private List<Cliente> clientes;
    
    public ClienteTableModel (List<Cliente> cliente){
        this.clientes = cliente;
    }
    /* Retorna a quantidade de linhas. */
    public int getRowCount(){
        // Retorna o tamanho da lista de cliente.
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
        case 3:
            return cliente.getDataDeNascimento();
        case 4:
            return cliente.getEndereco();
        case 5:
            return cliente.getCidade();
        case 6:
            return cliente.getEstado();
        default:
            break;
    }
    return null;
    }
    
    public Cliente getValueAt(int rowIndex){
        return clientes.get(rowIndex);
    }
   
    public String getColumnName(int column) {
        /*Retorna a classe referente a coluna especificada.
          Aqui é feito um switch para verificar qual é a coluna.
        e retornar o tipo adequado. As colunas são as mesmas
        que foram especificadas no array "colunas".
        */
        switch (column) {
            case 0:
                    return colunas[0];
            case 1:
                    return colunas[1];
            case 2:
                    return colunas[2];
            case 3:
                    return colunas[3];
            case 4:
                    return colunas[4];
            case 5:
                    return colunas[5];
            case 6:
                    return colunas[6];
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
