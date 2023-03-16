public class Main{

    public static void main(String[] arg){

    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        int lowTemp=25;
        int highTemp=35;
        int higherTemp=45;

        if (!summer){
           return (temperature>=lowTemp && temperature<=highTemp) ? true:false;
        } else {
            return (temperature>= lowTemp && temperature<= higherTemp) ? true:false;
        }
    }
}