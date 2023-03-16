public class Main {

    public static void main(String[] args) {

        int test1= 8;
        int test2= 6;
        int test3= 2;
        int test4= 0;

        System.out.println(test2 + " feet is equall to "+ convertToCentimeters(test2)+ " centimeters");
        System.out.println(test2 + " feet and " + test4 + "inches is equal to "+ convertToCentimeters(test2, test4)+ " centimeters");
    }

    public static double convertToCentimeters(int inches){
     return inches*2.54;
    }

    public static double convertToCentimeters(int feet,int inches){
        return (convertToCentimeters((feet*12)+inches));
    }

}
