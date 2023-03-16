public class Hello {
    public static void main(String[] arg) {
        System.out.println("Hello Andres!");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";

        System.out.println(s);

        double myNewDouble = 20.00;
        double mySecondDouble = 80.00;
        double NumberResult = (myNewDouble + mySecondDouble);
        NumberResult *= 100.00d;
        System.out.println("The Total is "+ NumberResult);
        double myRemainder= NumberResult%40.00d;
        System.out.println("The Remainder is "+myRemainder);
        boolean myBooleanValue = (myRemainder == 0.0) ;
        System.out.println("There is no Remainder? : " + myBooleanValue);

        if (myBooleanValue == true)
        {
            System.out.println("No remainder here");
        }
        else
        {
            System.out.println("we have a remainder");
        }
        ;

    }
}
