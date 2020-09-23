package lt.boreisa.databaseConn;

import lt.boreisa.model.Employer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class Hello {

    public static void main(String[] args) {

//        Configuration cfg = new Configuration();
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            // Database Queries

            Query<Employer> query = session.createQuery("FROM Employer ", Employer.class);
            List<Employer> list = query.list();
            list.forEach(System.out::println);

            // End
            tx.commit();
        } catch (Exception e){
            if(tx != null){
                tx.rollback();
                e.printStackTrace();
            }
        } finally {
            session.close();
        }
    }
}
