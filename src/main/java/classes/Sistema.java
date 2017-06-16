package classes;

import util.HibernateUtil;


public class Sistema {
    
    /*
    Chamar conexão e fazer atualização no banco de dados
    */
    public static void main(String [] args){
        HibernateUtil.getSessionFactory();
    }
}
