package dao;

import model.Student;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;
//
//public class StudentDAO {
//
//    public Student StudSave(Student student){
//        try {
//            Session session = HibernateUtil.getSessionFactory().openSession();
//            session.save(student);
//            session.beginTransaction().commit();
//            session.close();
//        }
//        catch (Exception exe){
//            exe.printStackTrace();
//        }
//        return null;
//
//    }
//
//}

import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class StudentDAO {

    public Student studSave(Student student) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.save(student);
            session.beginTransaction().commit();
            session.close();
        } catch (Exception exe) {
            exe.printStackTrace();
        }
        return null;
    }

    public void studDelete(Student student) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.delete(student);
            transaction.commit();
            session.close();
        } catch (Exception exe) {
            exe.printStackTrace();
        }
    }

    public void studUpdate(Student student) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.update(student);
            transaction.commit();
            session.close();
        } catch (Exception exe) {
            exe.printStackTrace();
        }
    }

    public Student getStudentById(int id) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Student student = session.get(Student.class, id);
            session.close();
            return student;
        } catch (Exception exe) {
            exe.printStackTrace();
        }
        return null;
    }

    public List<Student> getAllStudents() {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            List<Student> students = session.createQuery("from Student", Student.class).list();
            session.close();
            return students;
        } catch (Exception exe) {
            exe.printStackTrace();
        }
        return null;
    }
}
