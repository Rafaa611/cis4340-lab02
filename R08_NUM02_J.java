/*
Rule: NUM02-J
*/

public class R08_NUM02_J {

    public static int divide(int a, int b) {

        if (b == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }

        return a / b;

    }

    public static void main(String[] args) {

        int result = divide(10, 2);

        System.out.println("Result: " + result);

    }
}