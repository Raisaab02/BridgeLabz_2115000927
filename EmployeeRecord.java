class Employee {
    public int employeeID;  // Public: Accessible anywhere
    protected String department; // Protected: Accessible within package and subclasses
    private double salary;  // Private: Only accessible within this class

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void updateSalary(double newSalary) {
        if (newSalary > 0) {
            this.salary = newSalary;
        }
    }

    public double getSalary() {
        return salary;
    }
}

// Subclass demonstrating access modifiers
class Manager extends Employee {
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayManagerDetails() {
        System.out.println("Manager - Employee ID: " + employeeID + ", Department: " + department);
    }
}

