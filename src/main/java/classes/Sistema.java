package classes;

import util.HibernateUtil;


public class Sistema {
     
    public static void main(String [] args){
        HibernateUtil.getSessionFactory();
    }
}
