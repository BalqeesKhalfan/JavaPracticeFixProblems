public class SphereVolumeCalculator {
    public static void main(String[] args) {
        double radius = 5.0; // Radius of the sphere

        double volume = calculateVolume(radius);

        System.out.println("The volume of the sphere with radius " + radius + " is: " + volume);
    }

    public static double calculateVolume(double radius) {
       
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        return volume;
    }
}