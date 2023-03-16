    public class Main{

        public static void main(String[] args) {

            printYearsAndDays(561600);
        }
        public static void printYearsAndDays(long minutes){

            long numberOfYears= 0;
            long numberOfDays=0;
            long oneDay= 60*24;
            long oneYear=60*24*365;


            if(minutes<0){
                System.out.println("Invalid Value");
            }else if(minutes <oneDay) {
                System.out.println(minutes + " min = " + numberOfYears + " y and " +  numberOfDays + " d" );
            }else if(minutes >= oneDay && minutes<oneYear) {
                numberOfDays=minutes/oneDay;
                System.out.println(minutes + " min = " + numberOfYears + " y and " +  numberOfDays + " d" );
            }else if( minutes>=oneYear) {
                numberOfYears=minutes/oneYear ;
                numberOfDays=(minutes-(numberOfYears*oneYear))/oneDay;
                System.out.println(minutes + " min = " + numberOfYears + " y and " +  numberOfDays + " d" );
            }
        }

    }