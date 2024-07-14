package Task11;

public class Employee {
    // Attributes
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // Getters and Setters for attributes
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Method to get full name
    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public void raiseSalary(int percent) {
        double raiseAmount = salary * ((double) percent / 100);
        salary += raiseAmount;
    }

    public String toString() {
        return id + " " + getName() + " " + salary;
    }

    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee();

        // Set attributes using setters
        emp.setFirstName("Aswinee");
        emp.setLastName("Kesavan");
        emp.setSalary(20000);

        // Display employee information using getters
        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: $" + emp.getSalary());
        System.out.println("Employee Annual Salary: $" + emp.getAnnualSalary());

        // Raise salary by 40%
        emp.raiseSalary(40);
        System.out.println("Employee New Salary after 40% Raise: $" + emp.getSalary());

        // Display employee information using toString() method
        System.out.println("\nEmployee Details:");
        System.out.println(emp.toString());
    }
}
