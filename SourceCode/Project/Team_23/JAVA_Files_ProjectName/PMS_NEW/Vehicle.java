public class Vehicle {
    private String type;
    private String licensePlate;

    // Constructor
    public Vehicle(String type, String licensePlate) {
        this.type = type;
        this.licensePlate = licensePlate;
    }

    // Getter for type
    public String getType() {
        return type;
    }

    // Setter for type
    public void setType(String type) {
        this.type = type;
    }

    // Getter for licensePlate
    public String getLicensePlate() {
        return licensePlate;
    }

    // Setter for licensePlate
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
}
