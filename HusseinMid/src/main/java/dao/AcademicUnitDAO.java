package dao;
import model.AcademicUnit;

import org.hibernate.Session;
import org.hibernate.Transaction;
public class AcademicUnitDAO {
    public AcademicUnit academicSave(AcademicUnit unit) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.save(unit);
            session.beginTransaction().commit();
            session.close();
        } catch (Exception exe) {
            exe.printStackTrace();
        }
        return null;
    }
}