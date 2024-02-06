public class TotalDistanceCalculator {
    public static void main(String[] args) {
        double averageSpeed = 60.0; // Average speed of the car in km/h
        double time = 2.5;           // Time traveled in hours

        double totalDistance = averageSpeed * time;

        System.out.println("The total distance covered by the car is: " + totalDistance + " kilometers");
    }
}