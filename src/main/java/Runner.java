import db.DBHelper;
import models.Administrator;
import models.Manager;

public class Runner {

    public static void main(String[] args) {

        Manager manager1 = new Manager("Bob",999,25000,100000,"Sainsburys");
        DBHelper.save(manager1);
        Administrator administrator1 = new Administrator("Joe", 666,20000,manager1);
        DBHelper.save(administrator1);



    }

}
