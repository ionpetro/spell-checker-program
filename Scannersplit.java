import java.util.Scanner;
import java.util.ArrayList;

public class Scannersplit {

	public static ArrayList<String> removePunctuation() {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		input = input + " ";
		String strippedInput = input.replaceAll("\\W ", " ");
		strippedInput = strippedInput.toLowerCase();
		
		ArrayList<String> CheckWords = new ArrayList<String>();
		Scanner fromStr = new Scanner(strippedInput);
		
		int i = 0;
		while (fromStr.hasNext()) {
			String helper = fromStr.next();
			int theboolean = setWords(helper, CheckWords);

			if (theboolean == 0) {
				CheckWords.add(helper);
				i++;
			}
		}
		return (CheckWords);
	}

	public static int setWords (String word, ArrayList<String> CheckWords) {
			
			int index = -1;
			
			for (int i = 0; i < CheckWords.size(); i++) {
				if (word.equals(CheckWords.get(i))) {
					index = i;
					break;
				}
			}
				if (index != -1 ) {
					return 1;
				} else {
					return 0;
				}
	}
}
