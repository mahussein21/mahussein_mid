package dao;

import model.Teacher;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class TeacherDAO {

    public Teacher teacherSave(Teacher teach) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.save(teach);
            session.beginTransaction().commit();
            session.close();
        } catch (Exception exe) {
            exe.printStackTrace();
        }
        return null;

    }
    public Teacher teacherdelete(Teacher teach) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.delete(teach);
            session.beginTransaction().commit();
            session.close();
        } catch (Exception exe) {
            exe.printStackTrace();
        }
        return null;

    }

    public Teacher teacherupdate(Teacher teach) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.update(teach);
            session.beginTransaction().commit();
            session.close();
        } catch (Exception exe) {
            exe.printStackTrace();
        }
        return null;

    }

}