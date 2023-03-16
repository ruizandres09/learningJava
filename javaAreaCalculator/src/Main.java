public class Main {

    public static void main(String[] args) {

        double test1= 5.0;
        double test2= -1;
        double test3= 4.0;
        double test4= -1.0;


        System.out.println(area(test1));
        System.out.println(area(test2));
        System.out.println(area(test1,test3));
        System.out.println(area(test4,test3));
    }

    public static double area(double radius) {

        if (radius < 0) {
            return -1.0;
        } else {
            return Math.PI * Math.pow(radius, 2);
        }
    }

    public static double area(double x, double y){
        if(x<0 || y<0){
        return -1.0;
        }else{
        return x*y;
        }
    }

}
