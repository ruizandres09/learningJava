public class Main {

    public static void main(String[] arg){
        int testValue = 2500;
        printMegaBytesAndKiloBytes(testValue);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int mbToKB = 1024;
        int roundedKilobytes = kiloBytes/mbToKB;
        int remainder = kiloBytes%mbToKB;

        if (kiloBytes<0){
            System.out.println("Invalid Value");
        }
        else
            System.out.print(kiloBytes + " KB = " + roundedKilobytes +  " MB and "+ remainder + " KB");
    }



}
