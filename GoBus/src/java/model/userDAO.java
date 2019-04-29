package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class userDAO {
    
    public boolean check(user original){
        
        user dbuser = null;
        
        Configuration cf = new Configuration();
        cf.configure();
        
        SessionFactory sf = cf.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        
        dbuser = (user)session.get(user.class,original.getUname());
        
        tx.commit();
        session.close();
        sf.close();
        
        if(dbuser == null) {
            return false;
        } else {
            return original.equals(dbuser);
        }
    }
}
