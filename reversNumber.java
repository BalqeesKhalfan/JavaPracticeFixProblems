   public static void main(String[] args) {
        int number=90611645;
        int reversedNumber = reverseNumber(number);
        System.out.println("ReversedNumber ="+reversedNumber);
        
        
        
    }
    public static int reverseNumber(int number){
        int  reversedNumber=0;
        
        while(number!=0){ 
            int digits=number%10; // get the reminder of each digits by 10 
            reversedNumber=reversedNumber*10+digits;
            number /=10;
        }
        return reversedNumber;
    }