public class EvenOrOdd {
    public static void main(String[] args) {
        int number = 100; 

        if (isEven(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

    public static boolean isEven(int number) {
      
        return number % 2 == 0;
    }
}
