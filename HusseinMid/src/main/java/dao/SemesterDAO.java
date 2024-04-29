package dao;

import model.Semester;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class SemesterDAO {

    public Semester semesterSave(Semester sem) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.save(sem);
            session.beginTransaction().commit();
            session.close();
        } catch (Exception exe) {
            exe.printStackTrace();
        }
        return null;

    }
    public Semester semesterdelete(Semester sem) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.delete(sem);
            session.beginTransaction().commit();
            session.close();
        } catch (Exception exe) {
            exe.printStackTrace();
        }
        return null;

    }
    public Semester semesterupdate(Semester sem) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.update(sem);
            session.beginTransaction().commit();
            session.close();
        } catch (Exception exe) {
            exe.printStackTrace();
        }
        return null;

    }
}