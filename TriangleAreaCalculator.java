public class TriangleAreaCalculator {
    public static void main(String[] args) {
        double base = 5.0; // Base of the triangle
        double height = 8.0; // Height of the triangle

        double area = calculateArea(base, height);

        System.out.println("The area of the triangle with base " + base + " and height " + height + " is: " + area);
    }

    public static double calculateArea(double base, double height) {
        // Area of a triangle = (base * height) / 2
        return (base * height) / 2;
    }
}
