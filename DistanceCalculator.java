public class DistanceCalculator {
    public static void main(String[] args) {
        double initialVelocity = 10.0; // Initial velocity in m/s
        double acceleration = 2.0;     // Acceleration in m/s^2
        double time = 5.0;             // Time in seconds

        double distance = calculateDistance(initialVelocity, acceleration, time);

        System.out.println("The distance traveled by the object is: " + distance + " meters");
    }

    public static double calculateDistance(double initialVelocity, double acceleration, double time) {
        // Distance traveled = initialVelocity * time + (1/2) * acceleration * time^2
        return initialVelocity * time + 0.5 * acceleration * Math.pow(time, 2);
    }
}
