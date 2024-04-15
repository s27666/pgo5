import java.util.ArrayList;

public class Tester extends Employee {
    private ArrayList<String> testTypes;
    public Tester(String name, String lastname, String address, String email, String pesel, int rokZatrudnienia) {
        super(name, lastname, address, email, pesel, rokZatrudnienia);
        this.testTypes = new ArrayList<>();
    }
    public void addTestType(String testType) {
        testTypes.add(testType);
    }
    @Override
    public double calculateSalary() {
        double testerSalary = super.calculateSalary() + testTypes.size() * 300;
        return testerSalary;
    }
}
