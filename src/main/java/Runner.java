import db.DBHelper;
import db.DBManager;
import models.Administrator;
import models.Department;
import models.Employee;
import models.Manager;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Manager manager1 = new Manager("Bob",999,25000,100000);
        DBHelper.save(manager1);
        Manager manager2 = new Manager("Stu",998,25800,10000);
        DBHelper.save(manager2);


        Department department = new Department("frozen food", manager1);
        DBHelper.save(department);
        Department department2 = new Department("Alcohol", manager2);
        DBHelper.save(department2);

        Administrator administrator1 = new Administrator("Joe", 666,20000,manager1);
        DBHelper.save(administrator1);


        List<Employee> employees = DBManager.getEmployeesForManger(manager1);

        DBManager.getDepartment(manager2);

    }

}
