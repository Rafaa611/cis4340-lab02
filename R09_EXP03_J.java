/*
Rule: EXP03-J
*/

public class R09_EXP03_J {

    public static void main(String[] args) {

        Integer a = 128;
        Integer b = 128;

        // Noncompliant: compares object references, not values
        if (a == b) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }

    }
}