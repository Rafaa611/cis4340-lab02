/*
Rule: NUM03-J
*/

public class R03_NUM03_J {

    public static void main(String[] args) {

        int unsignedByte = 255;

        int safeValue = unsignedByte;

        System.out.println("Original value: " + unsignedByte);
        System.out.println("Stored safely in int: " + safeValue);
    }
}