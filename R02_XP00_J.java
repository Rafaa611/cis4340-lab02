/*
Rule: XP00-J / EXP00-J
*/

import java.io.File;
import java.io.IOException;

public class R02_XP00_J {

    public static void main(String[] args) throws IOException {
        File tempFile = File.createTempFile("labfile", ".txt");

        boolean deleted = tempFile.delete();

        if (deleted) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("File could not be deleted.");
        }
    }
}