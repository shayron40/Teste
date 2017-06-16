package DAO;

import classes.Funcionario;
import java.util.List;
import org.hibernate.Session;
import util.HibernateUtil;
import org.hibernate.Criteria;                


public class FuncionarioDAO extends GenericDAO<Funcionario> {
    
    private Session sessao;
      public FuncionarioDAO() {
        super(Funcionario.class);
    }
    
    @Override
    public boolean salvar(Funcionario funcionario){
        if(funcionario.getId() == 0){
            return super.salvar(funcionario);
        }else{
            return super.editar(funcionario);
        }
    }
    
    /*
     Abrindo a conexão com o banco de dados.
    */
    @Override
    public List<Funcionario> listar(){
        sessao = HibernateUtil.getSessionFactory().openSession();
        /*
        pega a sessão e faz uma listagem do funcionario
        */
        List lista = sessao.createCriteria(Funcionario.class).list();
        sessao.close();
        return lista;
    }  
    
    
}
