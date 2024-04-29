package dao;


import model.Signup;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    // Build SessionFactory
    private static SessionFactory buildSessionFactory() {
        try {
            Configuration configuration = new Configuration();

            Properties properties = new Properties();
            properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
            properties.put(Environment.URL, "jdbc:mysql://localhost:3306/webdb");
            properties.put(Environment.USER, "root");
            properties.put(Environment.PASS, "");
            properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
            properties.put(Environment.HBM2DDL_AUTO, "update");
            properties.put(Environment.SHOW_SQL, true);

            configuration.setProperties(properties);

            // Add annotated classes
            configuration.addAnnotatedClass(Signup.class);

            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();

            return configuration.buildSessionFactory(serviceRegistry);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException("Error building SessionFactory: " + ex.getMessage());
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
}
}