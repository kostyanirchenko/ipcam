import org.hibernate.Session;
import util.HibernateUtil;
import util.Test;

/**
 * Created by Администратор on 05.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Test");
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Test test = new Test();
        test.setUsername("lol");
        session.save(test);
        session.getTransaction().commit();
    }
}
