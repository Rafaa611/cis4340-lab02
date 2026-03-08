/*
Rule: STR03-J
*/

public class R04_STR03_J {

    public static void main(String[] args) {

        byte[] rawData = {65, 66, 67, 0, 127, -1};

        System.out.print("Raw byte data: ");

        for (byte b : rawData) {
            System.out.print(b + " ");
        }

        System.out.println();
    }
}