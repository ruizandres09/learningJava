public class Main {

    public static void main (String[] arg){

        double kmph= 75.114;
        System.out.println(toMilesPerHour(kmph));
        printConversion(kmph);

    }
    public static long toMilesPerHour(double kilometersPerHour){

        if(kilometersPerHour<0){
            return -1;
        }
        long roundedValue = Math.round(kilometersPerHour) ;
        double conversionRatio = 1.609;
        long result = Math.round(roundedValue/conversionRatio);
        return result;
    }

    public static void printConversion( double kilometersPerHour){

        if(kilometersPerHour<0){
            System.out.println("Invalid Value");
        }else{
            long mph= toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " +mph + " mi/h");}
    }
}
