package rad.regularexpression.emailOrUsername;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChckeEmailOrUsername {

	private static final String EMAIL_PATTERN = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
	private static final String USERNAME_PATTERN = "^[A-Za-z0-9]+$";
	
	public static boolean isEmail(String input) {
		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		Matcher matcher = pattern.matcher(input);
		return matcher.matches();
	}
	
	public static boolean isUsername(String input) {
        Pattern pattern = Pattern.compile(USERNAME_PATTERN);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
	
	public static void main(String[] args) {
        String input1 = "habibur0199mhr@gmail.com";
        String input2 = "username123";

        if (isEmail(input1)) {
            System.out.println(input1 + " is an email.");
        } else if (isUsername(input1)) {
            System.out.println(input1 + " is a username.");
        } else {
            System.out.println(input1 + " is invalid.");
        }

        if (isEmail(input2)) {
            System.out.println(input2 + " is an email.");
        } else if (isUsername(input2)) {
            System.out.println(input2 + " is a username.");
        } else {
            System.out.println(input2 + " is invalid.");
        }
    }
	
}
