class Patient {
    private static String hospitalName = "City Hospital";
    private static int totalPatients = 0;
    private final int patientID;
    private String name;
    private int age;
    private String ailment;

    // Constructor using `this`
    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    // Static method to get total patients
    public static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    // Instanceof check before displaying patient details
    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Patient ID: " + patientID + ", Name: " + name +
                    ", Age: " + age + ", Ailment: " + ailment + ", Hospital: " + hospitalName);
        }
    }
}

