/*
Rule: STR03-J
*/

public class R04_STR03_J {

    public static void main(String[] args) {

        byte[] rawData = {65, 66, 67, 0, 127, -1};

        // Noncompliant: treating raw noncharacter data as text
        String data = new String(rawData);

        System.out.println("Encoded data as String: " + data);
    }
}