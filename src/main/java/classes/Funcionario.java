package classes;

import classes.*;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.swing.JLabel;

@Entity
@Table(name="funcionario")
public class Funcionario extends Pessoa implements Serializable{
    
    private String setor;
    private String funcao;
    private String turno;

    public Funcionario(String setor, String funcao, String turno, String nome, String email, String estado, String cidade, String endereco, String sexo, String senha, String dataDeNascimento) {
        super(nome, email, estado, cidade, endereco, sexo, senha, dataDeNascimento);
        this.setor = setor;
        this.funcao = funcao;
        this.turno = turno;
    }
    
    public Funcionario(){
        
    }
    
    
    

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String setNome(JLabel nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String setFuncao(JLabel funcao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String setDataDeNascimento(JLabel dataDeNascimento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    

