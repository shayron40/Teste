package br.unileao.telas;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="cliente")
public class Cliente extends Pessoa{

    public Cliente(long id, String nome, String email, String estado, String cidade, String endereco, String sexo, String senha, String dataDeNascimento) {
        super(id, nome, email, estado, cidade, endereco, sexo, senha, dataDeNascimento);
    }

    
     
    
    
    }
