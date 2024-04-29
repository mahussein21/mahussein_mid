package dao;
import model.StudentReg;
import org.hibernate.Session;
public class StudentRegDAO {
    public StudentReg regisSave(StudentReg studentreg){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.save(studentreg);
            session.beginTransaction().commit();
            session.close();
        }
        catch (Exception exe){
            exe.printStackTrace();
        }
        return null;

    }
    public StudentReg regisdelete(StudentReg studentreg){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.delete(studentreg);
            session.beginTransaction().commit();
            session.close();
        }
        catch (Exception exe){
            exe.printStackTrace();
        }
        return null;

    }
    public StudentReg regisupdate(StudentReg studentreg){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.update(studentreg);
            session.beginTransaction().commit();
            session.close();
        }
        catch (Exception exe){
            exe.printStackTrace();
        }
        return null;

    }
}
