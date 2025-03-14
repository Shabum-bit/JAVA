

public class Division {

    public static void main(String[] args) {

        // Once you have implemented the division method, you can
        // try it out here. For example division(3,5);
        // should print "0.6"

        division(3, 5);
    }

    // implement the method here
    public static void division(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Cannot divide by zero");
        } else {
            double result = (double) numerator / denominator;
            System.out.println(result);
        }
    }
}
