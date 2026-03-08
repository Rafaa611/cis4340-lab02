/*
Rule: XP00-J / EXP00-J
*/

import java.io.File;
import java.io.IOException;

public class R02_XP00_J {

    public static void main(String[] args) throws IOException {
        File tempFile = File.createTempFile("labfile", ".txt");

        // Noncompliant: ignoring the return value
        tempFile.delete();

        System.out.println("Tried to delete file.");
    }
}