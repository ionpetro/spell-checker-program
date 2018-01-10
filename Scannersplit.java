import java.util.Scanner;
import java.util.ArrayList;

public class Scannersplit {

	public static ArrayList<String> removePunctuation(String input) {
		ArrayList<String> CheckWords = new ArrayList<String>();
		input = input.toLowerCase();
		String holeString = input;
		Scanner theStr = new Scanner(holeString);

		while (theStr.hasNext()) {
			input = theStr.next();
			if (input != null && input.length() > 0 && input.charAt(input.length() - 1) == ','  ||
			input.charAt(input.length() - 1) == '!' ||  input.charAt(input.length() - 1) == '.' ||
			input.charAt(input.length() - 1) == ';' ||  input.charAt(input.length() - 1) == '-' ||
			input.charAt(input.length() - 1) == ')' ||  input.charAt(input.length() - 1) == '?' ||
			input.charAt(input.length() - 1) == ':' ) {
				input = input.substring(0, input.length() - 1);
   			}
   			//In this section we check for punctuation at the beggining of a word
   			
			// We start checking at the end of the word if punctuation exists. We use substrings and charAt methods
			if (input != null && input.length() > 0 && input.charAt(input.length() - 1) == '.' &&
			input.charAt(input.length() - 2) == '.') {
				input = input.substring(0, input.length() - 2);
			}
			if (input != null && input.length() > 0 && input.charAt(input.length() - 1) == '.' &&
			input.charAt(input.length() - 2) == '.' && input.charAt(input.length() - 3) == '.') {
				input = input.substring(0, input.length() - 3);
			}
			if (input != null && input.length() > 0 && input.charAt(input.length() - 1) == '.' &&
			input.charAt(input.length() - 2) == '.' && input.charAt(input.length() - 3) == '.' &&
			input.charAt(input.length() - 4) == '.') {
				input = input.substring(0, input.length() - 4);
			}
			if (input != null && input.length() > 0 && input.charAt(input.length() - 1) == '.' &&
			input.charAt(input.length() - 2) == '.' && input.charAt(input.length() - 3) == '.' &&
			input.charAt(input.length() - 4) == '.' && input.charAt(input.length() - 5) == '.') {
				input = input.substring(0, input.length() - 5);
			}
			if (input != null && input.length() > 0 && input.charAt(input.length() - 1) == ';' &&
			input.charAt(input.length() - 2) == ';') {
				input = input.substring(0, input.length() - 2);
			}
			if (input != null && input.length() > 0 && input.charAt(input.length() - 1) == '.' &&
						input.charAt(input.length() - 2) == ')') {
							input = input.substring(0, input.length() - 2);
			}
			if (input != null && input.length() > 0 && input.charAt(input.length() - 1) == ';' &&
			input.charAt(input.length() - 2) == ';' && input.charAt(input.length() - 3) == ';') {
				input = input.substring(0, input.length() - 3);
			}
			// A little bit extreme, but we need to do it.
			if (input != null && input.length() > 0 && input.charAt(input.length() - 1) == '-' ) {
				input = input.substring(0, input.length() - 1);
			}
			if (input != null && input.length() > 0 && input.charAt(input.length() - 1) == '!' &&
			input.charAt(input.length() - 2) == '!') {
				input = input.substring(0, input.length() - 2);
			}
			if (input != null && input.length() > 0 && input.charAt(input.length() - 1) == '!' &&
			input.charAt(input.length() - 2) == '!' && input.charAt(input.length() - 3) == '!') {
				input = input.substring(0, input.length() - 3);
			}
			if (input != null && input.length() > 0 && input.charAt(input.length() - 1) == '!' &&
			input.charAt(input.length() - 2) == '!' && input.charAt(input.length() - 3) == '!' &&
			input.charAt(input.length() - 4) == '!') {
				input = input.substring(0, input.length() - 4);
			}
			if (input != null && input.length() > 0 && input.charAt(input.length() - 1) == '!' &&
			input.charAt(input.length() - 2) == '!' && input.charAt(input.length() - 3) == '!' &&
			input.charAt(input.length() - 4) == '!' && input.charAt(input.length() - 5) == '!') {
				input = input.substring(0, input.length() - 5);
			}
			if (input != null && input.length() > 0 && input.charAt(input.length() - 1) == '!' &&
			input.charAt(input.length() - 2) == '.') {
				input = input.substring(0, input.length() - 2);
			}

			int theboolean = setWords(input, CheckWords);
			if (theboolean == 0) {
				CheckWords.add(input);
			}
		}
		return CheckWords;
	}

	public static int setWords (String word, ArrayList<String> CheckWords) {
		boolean index = false;
		for (int i = 0; i < CheckWords.size(); i++) {
			if (word.equals(CheckWords.get(i))) {
				index = true;
				break;
			}
		}

		if (index) {
			return 1;
		} else {
			return 0;
		}
	}
}

