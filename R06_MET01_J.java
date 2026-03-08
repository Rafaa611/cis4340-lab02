/*
Rule: MET01-J
*/

public class R06_MET01_J {

    public static int divide(int a, int b) {

        if (b == 0) {
            throw new IllegalArgumentException("Denominator must not be zero");
        }

        return a / b;
    }

    public static void main(String[] args) {
        System.out.println(divide(10, 2));
    }
}