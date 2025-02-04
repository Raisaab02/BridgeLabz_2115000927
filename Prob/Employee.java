class Employee {
    private static String companyName = "TechCorp";
    private static int totalEmployees = 0;
    private final int id;
    private String name;
    private String designation;

    // Constructor using `this`
    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    // Static method to display total employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Instanceof check before displaying employee details
    public void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("ID: " + id + ", Name: " + name + ", Designation: " + designation +
                    ", Company: " + companyName);
        }
    }
}




