package db;

import models.Department;
import models.Employee;
import models.Manager;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBManager {

    private static Session session;
    private static Transaction transaction;

    public static List<Employee> getEmployeesForManger(Manager manager) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Employee> results = null;
        try {
            Criteria cr = session.createCriteria(Employee.class);
            cr.add(Restrictions.eq("manager", manager));
            results = cr.list();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }

    public static Department getDepartment(Manager manager) {
        session = HibernateUtil.getSessionFactory().openSession();
        Department department = null;
        try {
            Criteria cr = session.createCriteria(Department.class);
            cr.add(Restrictions.eq("manager", manager));
            department = (Department) cr.uniqueResult();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }finally {
            session.close();
        }
            return department;
    }
}
