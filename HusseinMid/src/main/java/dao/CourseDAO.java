package dao;

import model.Course;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CourseDAO {

    public Course courseSave(Course cour){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.save(cour);
            session.beginTransaction().commit();
            session.close();
        }
        catch (Exception exe){
            exe.printStackTrace();
        }
        return null;

    }
    public Course coursedelete(Course cour){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.delete(cour);
            session.beginTransaction().commit();
            session.close();
        }
        catch (Exception exe){
            exe.printStackTrace();
        }
        return null;

    }
}