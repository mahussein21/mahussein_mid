package dao;

import model.CourseDefinition;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CourseDefinitionDAO {

    public CourseDefinition courseDefinitionSave(CourseDefinition def) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.save(def);
            session.beginTransaction().commit();
            session.close();
        } catch (Exception exe) {
            exe.printStackTrace();
        }
        return null;

    }
    public CourseDefinition courseDefinitiondelete(CourseDefinition def) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.delete(def);
            session.beginTransaction().commit();
            session.close();
        } catch (Exception exe) {
            exe.printStackTrace();
        }
        return null;

    }
    public CourseDefinition courseDefinitionupdate(CourseDefinition def) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.update(def);
            session.beginTransaction().commit();
            session.close();
        } catch (Exception exe) {
            exe.printStackTrace();
        }
        return null;

    }
}