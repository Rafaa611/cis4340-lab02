/*
Rule: IDS03-J
Compliant version
*/

import java.util.logging.Logger;
import java.util.regex.Pattern;

public class R00_IDS03_J {

    private static final Logger logger =
            Logger.getLogger(R00_IDS03_J.class.getName());

    public static String sanitizeUser(String username) {

        if (Pattern.matches("[A-Za-z0-9]+", username)) {
            return username;
        }

        return "unauthorized user";
    }

    public static void logUser(boolean loginSuccessful, String username) {

        String sanitized = sanitizeUser(username);

        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + sanitized);
        } else {
            logger.severe("User login failed for: " + sanitized);
        }

    }

    public static void main(String[] args) {

        String username = "attacker\nINJECTED LOG ENTRY";

        logUser(false, username);

    }
}