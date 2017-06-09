package classes;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="cliente")
public class Cliente extends Pessoa implements Serializable{

    public Cliente(String nome, String email, String estado, String cidade, String endereco, String sexo, String senha, String dataDeNascimento) {
        super(nome, email, estado, cidade, endereco, sexo, senha, dataDeNascimento);
    }
    
    public Cliente(){
    }
    
}
