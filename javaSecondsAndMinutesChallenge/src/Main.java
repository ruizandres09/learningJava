public class Main {

    public static void main(String[] args) {

        int test1= 3945;
        int test2= 60;
        int test3= 65;
        int test4= -12;
        int test5= 3600;
        int test6= 4500;



        System.out.println(getDurationString(test1));
        System.out.println(getDurationString(test2));
        System.out.println(getDurationString(test3));
        System.out.println(getDurationString(test4));
        System.out.println(getDurationString(test5));
        System.out.println(getDurationString(-3945));

        System.out.println("---------------------------------");

        System.out.println(getDurationString(-65,45));
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(65,145));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int seconds) {

        int numberofHours = 0;
        int numberofMinutes = 0;
        int numberofSeconds = 0;

        if (seconds >= 0) {
            if (seconds < 3600) {
                numberofMinutes = seconds / 60;
                numberofSeconds = seconds % 60;
                return ("0h " + numberofMinutes + "m " + numberofSeconds + "s");
            } else if (seconds >= 3600) {
                numberofHours = seconds / 3600;
                numberofMinutes = ((seconds-numberofHours*3600)/60);
                numberofSeconds = seconds % 60;
                return (numberofHours + "h " + numberofMinutes + "m " + numberofSeconds + "s");
            } else {
                return ("00h 00m " + seconds + "s");
            }
        } else {
            return "Invalid Value Entered";
        }
    }

    public static String getDurationString(int minutes,int seconds){

        int numberOfSeconds = 0;
        if(minutes>0 && seconds>0 && seconds<=59){
            numberOfSeconds= (minutes*60) + seconds;
            return getDurationString(numberOfSeconds);
        }else {
            return "Invalid Value Entered";
        }
    }


}
