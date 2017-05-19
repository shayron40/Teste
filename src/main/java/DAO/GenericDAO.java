package DAO;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;


public abstract class GenericDAO<T> 
                      implements DAO<T> {
    private Session sessao;
    private Transaction transacao;
   
    
    public boolean salvar(T t){
        try{
            this.sessao = HibernateUtil.getSessionFactory().openSession();
            this.sessao.save(t);
            this.transacao.commit();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            this.sessao.close();
        }
    }    
    
    public boolean editar(T t){
       
        try{
            this.sessao = HibernateUtil.getSessionFactory().openSession();
            this.sessao.update(t);
            this.transacao.commit();
            return true;
        } catch(Exception e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            this.sessao.close();
        }
        
       }
       
       public boolean excluir(T t){
         try{
            this.sessao = HibernateUtil.getSessionFactory().openSession();
            this.sessao.delete(t);
            this.transacao.commit();
            return true;
        } catch(Exception e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            this.sessao.close();
        }  
       }
       
       public List listar(){
       return null;
       } 
}
    

