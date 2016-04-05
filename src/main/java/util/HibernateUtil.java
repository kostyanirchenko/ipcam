package util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Created by Kostya Nirchenko on 05.04.2016.
 */
public class HibernateUtil {

    private static SessionFactory sessionFactory;
    private static ServiceRegistry serviceRegistry;

   public static SessionFactory createSessionFactory() throws HibernateException {
       Configuration configuration = new Configuration();
       configuration.configure();
       serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
       sessionFactory = configuration.buildSessionFactory(serviceRegistry);
       return sessionFactory;
   }

   public static SessionFactory getSessionFactory() {
        return createSessionFactory();
   }
}
