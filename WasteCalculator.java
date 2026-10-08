import java.util.Scanner;

public class WasteCollection {

    // Method to calculate total waste
    public static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read waste collected at two points
        System.out.print("Enter waste collected at Point 1 (kg): ");
        double point1Waste = sc.nextDouble();

        System.out.print("Enter waste collected at Point 2 (kg): ");
        double point2Waste = sc.nextDouble();

        // Call the method
        double totalWaste = calculateTotalWaste(point1Waste, point2Waste);

        // Display the result
        System.out.println("Total waste collected: " + totalWaste + " kg");

        sc.close();
    }
}
