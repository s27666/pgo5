import java.time.LocalDate;
import java.util.Date;


public class Employee {
    protected String name;
    protected String lastName;
    protected String email;
    protected String address;
    protected String pesel;
    protected int rokZatrudnieia;

    public Employee(String name, String lastName, String email, String address, String pesel, int rokZatrudnieia) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.pesel = pesel;
        this.rokZatrudnieia = rokZatrudnieia;
    }

    public double calculateSalary() {
        int salary = 3000;
        int raise = 1000;
        int year = LocalDate.now().getYear();
        double calculateSalary = salary + (year - rokZatrudnieia) * raise;
        return calculateSalary;
    }

}

