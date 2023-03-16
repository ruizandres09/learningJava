public class Main {
    public static void main(String[] args) {

        char charValue = 'a';
        switch (charValue){
            case 'A':
                System.out.println("A is able");
                break;
            case 'B':
                System.out.println("B is Baker");
                break;
            case 'C':
                System.out.println("C is Charlie");
                break;
            case 'D':
                System.out.println("D is Dog");
                break;
            case 'E':
                System.out.println("E is Easy");
                break;
            default:System.out.println("I don't know");



            int dayNumber=1;
            printDayOfWeek(dayNumber);


        }

    }


    public static void printDayOfWeek(int day){
       String dayOfWeek= switch (day){
            case 0 -> "Monday";
            case 1-> "Tuesday";
           default -> "not a day";
        };

       System.out.println(dayOfWeek);
    }

}
