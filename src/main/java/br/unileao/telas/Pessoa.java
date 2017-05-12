package br.unileao.telas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pessoa")
public abstract class Pessoa {
    
    @Id
    @GeneratedValue
    
    
    private long id;
    private String nome;
    private String email;
    private String estado;
    private String cidade;
    private String endereco;
    private String sexo;
    private String senha;
    private String dataDeNascimento;

    public Pessoa(long id, String nome, String email, String estado, String cidade, String endereco, String sexo, String senha, String dataDeNascimento) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.estado = estado;
        this.cidade = cidade;
        this.endereco = endereco;
        this.sexo = sexo;
        this.senha = senha;
        this.dataDeNascimento = dataDeNascimento;
    }
    
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    
}
 

