
public class BodaBodaDemo {
    public static void main(String[] args) {

        BodaBoda bike1 =
            new BodaBoda("UBB123X", "Nakato Faith", 1500);

        BodaBoda bike2 =
            new BodaBoda("UFC456Y", "Okello Brian", 2000);

        System.out.println("BIKE 1 DETAILS");
        bike1.displayDetails();

        System.out.println("\nBIKE 2 DETAILS");
        bike2.displayDetails();

        System.out.println("\nFARE CALCULATIONS");

        System.out.println("Bike 1 for 5 km: UGX "
            + bike1.computeFare(5));

        System.out.println("Bike 1 for 10 km: UGX "
            + bike1.computeFare(10));

        System.out.println("Bike 2 for 3 km: UGX "
            + bike2.computeFare(3));

        // Demonstrate fare validation
        bike1.setFarePerKm(-500);
    }
}
