public class InchesToCentimetersConverter {
    public static void main(String[] args) {
        double inches = 8; // Change this to the number of inches you want to convert

        double centimeters = convertToCentimeters(inches);

        System.out.println(inches + " inches is equal to " + centimeters + " centimeters.");
    }

    public static double convertToCentimeters(double inches) {
        // 1 inch = 2.54 centimeters
        return inches * 2.54;
    }
}