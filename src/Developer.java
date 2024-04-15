import java.util.ArrayList;

public class Developer extends Employee {

    private ArrayList<Technology> technologies;

    public Developer(String name, String lastname, String address, String email, String pesel, int rokZatrudnienia) {
        super(name, lastname, address, email, pesel, rokZatrudnienia);
        this.technologies = new ArrayList<>();

    }

    public void addTechnology(Technology t) {
        technologies.add(t);

    }

    @Override
    public double calculateSalary() {
        double developerSalary = super.calculateSalary() + technologies.size() * 800;
        return developerSalary;

    }

}
