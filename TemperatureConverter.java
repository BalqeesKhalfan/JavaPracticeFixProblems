public class TemperatureConverter {
    public static void main(String[] args) {
        int temperatureInCelsius = 39; 
        int fahrenheitIntegral = convertToIntegral(temperatureInCelsius);
        double fahrenheitFloatingPoint = convertToFloatingPoint(temperatureInCelsius);

        System.out.println("Temperature in Celsius: " + temperatureInCelsius);
        System.out.println("Temperature in Fahrenheit (Integral): " + fahrenheitIntegral);
        System.out.println("Temperature in Fahrenheit (Floating Point): " + fahrenheitFloatingPoint);
    }
    public static int convertToIntegral(int celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double convertToFloatingPoint(int celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }
}