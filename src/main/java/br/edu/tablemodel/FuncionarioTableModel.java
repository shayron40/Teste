
package br.edu.tablemodel;

import classes.Funcionario;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class FuncionarioTableModel extends AbstractTableModel{

    private String[] colunas = new String[] {"Codigo", "Nome","Função","Turno","Setor" };
    private List<Funcionario> funcionarios;
    
    public FuncionarioTableModel (List<Funcionario> funcionario){
        this.funcionarios = funcionario;
    }
    
    public int getRowCount(){
        return this.funcionarios.size();
    }
    
    public int getColumCount(){
        return colunas.length;
    }
    
    public Object getValueAt(int rowIndex, int columIndex){
    Funcionario funcionario = funcionarios.get(rowIndex);
    switch (columIndex) {
        case 0:
            return funcionario.getId();
        case 1:
            return funcionario.getNome();
        case 2:
            return funcionario.getEmail();
        case 3:
            return funcionario.getFuncao();
        case 4:
            return funcionario.getTurno();
        case 5:
            return funcionario.getSetor();
        default:
            break;
    }
    return null;
    }
    
    public Funcionario getValueAt(int rowIndex){
        return funcionarios.get(rowIndex);
    }
   
    public String getColumnName(int column) {
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
