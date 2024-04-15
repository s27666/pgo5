import java.util.ArrayList;

public class Manager extends Employee {
    private ArrayList<Goal> goals;
    public Manager(String name, String lastName, String email, String address, String pesel, int rokZatrudnieia) {
        super(name, lastName, email, address, pesel, rokZatrudnieia);
        this.goals = new ArrayList<>();
    }

    public void addGoals(Goal g) {
        goals.add(g);
    }

    @Override
    public double calculateSalary() {
        double managerSalary = super.calculateSalary() + 1000 * goals.size();
        return managerSalary;
    }
}
