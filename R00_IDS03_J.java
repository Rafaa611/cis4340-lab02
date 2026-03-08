/*
Rule: IDS03-J
Noncompliant version
Logging unsanitized user input
*/

import java.util.logging.Logger;

public class R00_IDS03_J {

    private static final Logger logger =
            Logger.getLogger(R00_IDS03_J.class.getName());

    public static void logUser(boolean loginSuccessful, String username) {

        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + username);
        } else {
            logger.severe("User login failed for: " + username);
        }

    }

    public static void main(String[] args) {

        String username = "attacker\nINJECTED LOG ENTRY";

        logUser(false, username);

    }
}