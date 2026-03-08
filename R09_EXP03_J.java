/*
Rule: EXP03-J
*/

public class R09_EXP03_J {

    public static void main(String[] args) {

        Integer a = 128;
        Integer b = 128;

        if (a.equals(b)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }

    }
}