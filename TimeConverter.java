import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of seconds you want to convert: ");
        int seconds = scanner.nextInt();

        int days = seconds / (24 * 3600);
        int weeks = days / 7;
        int years = days / 365;

        System.out.println(seconds + " seconds is equivalent to:");
        System.out.println("Days: " + days);
        System.out.println("Weeks: " + weeks);
        System.out.println("Years: " + years);

        scanner.close();
    }
}
