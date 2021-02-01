package OOPs;

import java.io.IOException;
import java.io.Serializable;
import java.sql.SQLDataException;

public abstract class Employee implements Serializable, Cloneable {
    //Fields
    public static int employeeAge = 12;
    static String employeeName = "Shravan";
    public static String employeeAddress = "Hyderabad";

    //Constructors
    public Employee(int eno, String employeeName, String employeeAddress) {

    }

    public Employee(int eno) throws IOException {

    }

    //Methods
    public void add(int eno, String employeeName, String employeeAddress) {

    }

    public Boolean search(int eno) throws IOException {
        return true;
    }

    public String delete(int eno) throws SQLDataException {
        return "Success";
    }
}
