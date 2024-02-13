public class RoomPaintingCostCalculator {
    public static void main(String[] args) {
        double length = 8.0; // Length of the room in meters
        double width = 8.0;   // Width of the room in meters
        double height = 3.0;  // Height of the room in meters
        double paintCostPerSquareMeter = 15.0; // Cost of paint per square meter

        double totalCost = calculateTotalCost(length, width, height, paintCostPerSquareMeter);

        System.out.println("The total cost of painting the room is: $" + totalCost);
    }

    public static double calculateTotalCost(double length, double width, double height, double paintCostPerSquareMeter) {
        // Calculate the surface area of the walls to be painted
       // double wallArea = 2 * (length * height + width * height); // this formola used to calculate if the room rectagle 
        double wallArea = 4 * length * height; // use this formala if the room is square 
        // Calculate the total cost of painting
        double totalCost = wallArea * paintCostPerSquareMeter;
        
        return totalCost;
    }
}
