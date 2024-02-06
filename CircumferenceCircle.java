class CircumferenceCircle{
    public static final double PI = 3.14;

    public static void main(String[] args) {
        int radius = 5;
        double circumference = calculateCircumference(radius);
        System.out.println("Circumference of the circle with radius " + radius + " is: " + circumference);
    }

    public static double calculateCircumference(int radius) {
        return 2 * PI * radius;
    }
}