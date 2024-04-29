package dao;

import model.Signup;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class SignupDao {

    public Signup userSave(Signup up){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.save(up);
            session.beginTransaction().commit();
            session.close();
        }
        catch (Exception exe){
            exe.printStackTrace();
        }
        return null;
    }

    public Signup userUpdate(Signup up){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.save(up);
            session.beginTransaction().commit();
            session.close();
        }
        catch (Exception exe){
            exe.printStackTrace();
        }
        return null;
    }

    public void userDelete(Signup up){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.delete(up);
            session.beginTransaction().commit();
            session.close();
        }
        catch (Exception exe){
            exe.printStackTrace();
        }
    }

    public Signup searchByUsernameAndPassword(String username, String password) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = null;
            transaction = session.beginTransaction();

            String hql = "SELECT s FROM Signup s WHERE s.email = :userNm AND s.password = :pass";
            List<Signup> users = session.createQuery(hql, Signup.class)
                    .setParameter("userNm", username)
                    .setParameter("pass", password)
                    .getResultList();

            transaction.commit();
            session.close();

            // Assuming only one user should match the given username and password
            if (!users.isEmpty()) {
                return users.get(0); // Return the first user found
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null; // Return null if no user found
    }
    public List<Object[]> Search(String username, String password) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = null;
            transaction = session.beginTransaction();

            String hql = "SELECT h.email, h.password, h.role FROM Signup h WHERE h.email = :userNm AND h.password = :pass";
            List<Object[]> user = session.createQuery(hql, Object[].class)
                    .setParameter("userNm", username)
                    .setParameter("pass", password)
                    .getResultList();

            transaction.commit();
            session.close();

            return user;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
}
}