/*
Rule: MET01-J
*/

public class R06_MET01_J {

    public static int divide(int a, int b) {

        // Noncompliant: using assert to validate argument
        assert b != 0 : "Denominator must not be zero";

        return a / b;
    }

    public static void main(String[] args) {
        System.out.println(divide(10, 2));
    }
}