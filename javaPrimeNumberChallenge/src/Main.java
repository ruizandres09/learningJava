public class Main {

    public static void main(String[] args) {

        int count = 0;

        for (int i = 10; i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println("number" + i + "is a prime number");
                count++;
                if (count == 3) {
                    System.out.println("Found 3 - Existing for loop");
                    break;
                }
            }
        }
        // System.out.println("Total number of prime number between 10 and 50 is " + count);


        int EndNumber = 1000;
        int sumofNumbers = 0;
        int amountOfNumbers = 0;

        for (int startNumber = 1; startNumber <= EndNumber; startNumber++) {
            if ((startNumber % 3 == 0) && (startNumber % 5 == 0)) {
                amountOfNumbers++;
                System.out.println(startNumber + " is divisable by 3 and 5");
                sumofNumbers += startNumber;
                System.out.println("Sum of Divisiable numbers is "+ sumofNumbers);
                if(amountOfNumbers==5){

                    System.out.println("numbers of digits " + amountOfNumbers);
                    break;

                }
            }

        }


    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }
        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }


}