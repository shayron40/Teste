package DAO;


import classes.Cliente;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import util.HibernateUtil;



public class ClienteDAO extends GenericDAO<Cliente>{
    
    private Session sessao;
    public ClienteDAO() {
        super(Cliente.class);
    }
    
    @Override
    public boolean salvar(Cliente cliente){
        if(cliente.getId() == 0){
            return super.salvar(cliente);
        }else{
            return super.editar(cliente);
        }
    }
    
    @Override
    public List<Cliente> listar(){
        sessao = HibernateUtil.getSessionFactory().openSession();
        List lista = sessao.createCriteria(Cliente.class).list();
        sessao.close();
        return lista;
    }
    
    }    

