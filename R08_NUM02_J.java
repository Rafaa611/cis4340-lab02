/*
Rule: NUM02-J
*/

public class R08_NUM02_J {

    public static int divide(int a, int b) {

        return a / b;

    }

    public static void main(String[] args) {

        int result = divide(10, 0);

        System.out.println("Result: " + result);

    }
}