class Vehicle {
    private static double registrationFee = 1000.0; // Common for all vehicles
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    // Constructor using `this`
    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Static method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Updated Registration Fee: $" + registrationFee);
    }

    // Instanceof check before displaying vehicle details
    public void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName + ", Vehicle Type: " + vehicleType +
                    ", Registration Number: " + registrationNumber + ", Fee: $" + registrationFee);
        }
    }
}




