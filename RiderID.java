
public class RiderID {
    public static void main(String[] args) {

        String riderName = "Nakato Faith";
        String plateNumber = "UBB123X";

        String firstThree =
            riderName.substring(0, 3).toUpperCase();

        String riderID = firstThree + "-" + plateNumber;

        System.out.println("Rider Name: " + riderName);
        System.out.println("Plate Number: " + plateNumber);
        System.out.println("Rider ID: " + riderID);
    }
}
