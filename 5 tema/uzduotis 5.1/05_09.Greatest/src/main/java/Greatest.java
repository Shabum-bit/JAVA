
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int max = number1;

        if (number2 > number1) {
            max = number2;
        } else if (number3 > number2) {
            max = number3;
        }
        return max;
    }
    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
