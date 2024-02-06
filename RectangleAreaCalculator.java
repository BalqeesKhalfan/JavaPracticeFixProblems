public class RectangleAreaCalculator {
    public static void main(String[] args) {
        double length = 10.5; // Length of the rectangle
        double width = 7.2;   // Width of the rectangle

        double area = calculateArea(length, width);

        System.out.println("The area of the rectangle with length " + length + " and width " + width + " is: " + area);
    }

    public static double calculateArea(double length, double width) {
        // Area of a rectangle = length * width
        return length * width;
    }
}