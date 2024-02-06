class CheckingChar{
    public static void main(String[] args) {
      char sample='A';
      char ch = '4'; 
        boolean isDigit = isDigit(ch);
          boolean isDigitcc = isDigitcc (sample);
        System.out.println("Is '" + ch + "' a digit? " + isDigit);
        System.out.println("Is '" + sample + "' a digit? " + isDigitcc );
    }

    public static boolean isDigit(char ch) {
        
        return ch >= '0' && ch <= '9';
    }
     public static boolean isDigitcc (char sample) {
        
        return sample >= '0' && sample <= '9';
    }
}