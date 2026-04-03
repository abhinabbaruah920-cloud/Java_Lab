interface Int {
    void setEmployee(String name, int Cid);
    void salary(double amount);
}

class Employee {
    private String name;
    private int Cid;

    public Employee(String name, int Cid) {
        this.name = name;
        this.Cid = Cid;
    }

    public String getName() {
        return name;
    }

    public int getCid() {
        return Cid;
    }

    public void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Id: " + Cid);
    }
}

class Salary implements Int {
    private Employee employee;
    private double money;

    public Salary(Employee employee, double money) {
        this.employee = employee;
        this.money = money;
    }

    public void setEmployee(String name, int Cid) {
        this.employee = new Employee(name, Cid);
    }

    public void salary(double amount) {
        this.money = amount;
    }

    public void displaySalary() {
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Salary: " + money);
    }

    public void showEmployeeDetails() {
        employee.displayEmployee();
        displaySalary();
    }
}

public class Gross {
    public static void main(String[] args) {
        Employee c1 = new Employee("Abhinab Baruah", 101);
        Salary s1 = new Salary(c1, 8000);

        s1.showEmployeeDetails();
    }
}
