/*
Rule: ERR00-J
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class R07_ERR00_J {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
            System.out.println(reader.readLine());
            reader.close();
        } catch (IOException e) {
            // Noncompliant: exception is ignored
        }
    }
}