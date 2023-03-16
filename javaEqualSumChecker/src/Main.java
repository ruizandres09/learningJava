public class Main {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,2,3));
        System.out.println(hasEqualSum(1,1,3));
        System.out.println(hasEqualSum(1,1,2));

        System.out.println("----------------------------------------");

        System.out.println(hasTeen(1,15,58));
        System.out.println(hasTeen(1,2,3));
        System.out.println(hasTeen(18,15,58));
        System.out.println(hasTeen(100,150,58));


        System.out.println("----------------------------------------");
        System.out.println(isTeen(9));
        System.out.println(isTeen(15));
        System.out.println(isTeen(90));


    }

    public static boolean hasEqualSum(int value1,int value2, int value3){
       if ((value1 + value2) == value3){
           return true;
       } else{
           return false;
       }
    }

    public static boolean hasTeen(int value1,int value2, int value3){
        if ((13<=value1 && value1<=19) || (13<=value2 && value2<=19) || (13<=value3 && value3<=19)){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isTeen(int value){
        return (13<=value && value<=19) ? true:false;
    }

}
