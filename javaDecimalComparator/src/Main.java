public class Main {
    public static void main(String[] args) {
        double test1= 5.225;
        double test2= 5.225;
        double test3= 2.225;
        double test4= -5.225;

        System.out.println(areEqualByThreeDecimalPlaces(test1,test2));
        System.out.println(areEqualByThreeDecimalPlaces(test1, test3));
        System.out.println(areEqualByThreeDecimalPlaces(test1, test4));

    }

    public static boolean areEqualByThreeDecimalPlaces(double value1, double value2){

        if ((int) ((value1*1000)-(value2*1000))==0){
            return true;
        }else {
            return false;
        }
    }

}
