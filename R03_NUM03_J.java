/*
Rule: NUM03-J
*/

public class R03_NUM03_J {

    public static void main(String[] args) {

        int unsignedByte = 255;

        byte signedByte = (byte) unsignedByte;

        System.out.println("Original value: " + unsignedByte);
        System.out.println("Stored in byte: " + signedByte);
    }
}