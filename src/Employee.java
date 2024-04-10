import java.time.Year;


public class Employee {
    public String name;
    public String lastName;
    public String email;
    public String address;
    public String pesel;
    public int rokZatrudnieia;
    public int calculateSalary(){
        int raise = 1000;
        int year = Year.now().getValue();
        int calculateSalary = 3000 + (rokZatrudnieia - year)*raise;
        return calculateSalary;
    }
}
