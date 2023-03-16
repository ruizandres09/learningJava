public class Main {

    public static void main(String[] arg) {

        System.out.println(getDaysInMonth(1, 2020));


        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }

        for (double rate = 2.0; rate <= 5.0; rate++) {
            double interestAmount = calculateInterest(10000.0, rate);
            System.out.println("10,000 at" + rate + "%interest = " + interestAmount);
        }

        for (double newRate = 7.5; newRate <= 10; newRate +=0.25){
            double interestAmount = calculateInterest(100, newRate);
            System.out.println("$100 at " + newRate + "% interest = $" + interestAmount);
        }


    }

    public static boolean isLeapYear(int year) {
        if (year <= 1 || year >= 9999) {
            return false;
        } else if (year % 4 == 0) {
            if (year % 100 != 0) {
                return true;
            } else if (year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        int numberOfDays = 0;
        if (month < 1 || month > 12 || year < 1 || year >= 9999) {
            return -1;
        } else
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    numberOfDays = 31;
                    break;
                case 2:
                    numberOfDays = isLeapYear(year) ? 29 : 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    numberOfDays = 30;
                    break;
            }
        return numberOfDays;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

}