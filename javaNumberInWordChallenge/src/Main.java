public class Main{
    public static void main(String[] args) {

        printNumberInWord(-2);
        printNumberInWord(0);
        printNumberInWord(5);
        printNumberInWord(1);
        printNumberInWord(2);
        printNumberInWord(22);
        printNumberInWord(10);
        printNumberInWord(2);

    }

    public static void printNumberInWord(int number){
        String numberWord= "word";
        switch(number){
            case 0:
                numberWord="ZERO";
                break;
            case 1:
                numberWord="ONE";
                break;
            case 2:
                numberWord="TWO";
                break;
            case 3:
                numberWord="THREE";
                break;
            case 4:
                numberWord="FOUR";
                break;
            case 5 :
                numberWord="FIVE";
                break;
            case 6 :
                numberWord="SIX";
                break;
            case 7 :
                numberWord="SEVEN";
                break;
            case 8:
                numberWord="EIGHT";
                break;
            case 9 :
                numberWord="NINE";
                break;
            default:
                numberWord="OTHER";
                break;
        };
        System.out.println(numberWord);
    }

}