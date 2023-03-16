public class Main {

    public static void main(String[] args) {

        boolean isBarking= false;
        int time= 7;

        System.out.println(shouldWakeUp(isBarking,time));

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){

        if (hourOfDay<0 || hourOfDay>23){
            return false;
        } else if (barking && (hourOfDay<8 || hourOfDay>22)) {
            return true;
        }else
            return false;
    }


}
