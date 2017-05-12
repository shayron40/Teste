package br.unileao.telas;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="funcionarios")
public class Funcionarios extends Pessoa {
    
    private String setor;
    private String funcao;
    private String turno;

    public Funcionarios(String setor, String funcao, String turno, long id, String nome, String email, String estado, String cidade, String endereco, String sexo, String senha, String dataDeNascimento) {
        super(id, nome, email, estado, cidade, endereco, sexo, senha, dataDeNascimento);
        this.setor = setor;
        this.funcao = funcao;
        this.turno = turno;
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
}
    

