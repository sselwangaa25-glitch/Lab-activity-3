
public class BodaBoda {
    private String plateNumber;
    private String riderName;
    private double farePerKm;

    // Constructor
    public BodaBoda(String plateNumber, String riderName,
                    double farePerKm) {
        this.plateNumber = plateNumber;
        this.riderName = riderName;
        setFarePerKm(farePerKm);
    }

    // Getters and setters
    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getRiderName() {
        return riderName;
    }

    public void setRiderName(String riderName) {
        this.riderName = riderName;
    }

    public double getFarePerKm() {
        return farePerKm;
    }

    public void setFarePerKm(double farePerKm) {
        if (farePerKm > 0) {
            this.farePerKm = farePerKm;
        } else {
            System.out.println(
                "Invalid fare! Fare per km must be greater than 0."
            );
        }
    }

    // Display boda-boda details
    public void displayDetails() {
        System.out.println("Plate Number: " + plateNumber);
        System.out.println("Rider Name: " + riderName);
        System.out.println("Fare per Km: UGX " + farePerKm);
    }

    // Calculate fare
    public double computeFare(double distanceKm) {
        return farePerKm * distanceKm;
    }
}
