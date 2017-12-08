import java.util.Scanner;
import java.util.ArrayList;

public class scannersplit {

	public static void main ( String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		input = input + " ";
		String strippedInput = input.replaceAll("\\W ", " ");
		strippedInput = strippedInput.toLowerCase();
		ArrayList<String> Lekseis = new ArrayList<String>();
		Scanner fromStr = new Scanner(strippedInput);
		int i = 0;
		while (fromStr.hasNext()) {
			String helper = fromStr.next();
			int theboolean = setLekseis(helper, Lekseis);
			if (theboolean == 0) {
			Lekseis.add(helper);
			i++;
			}
		}
	for (int counter = 0; counter < i; counter++) {
	System.out.println(Lekseis.get(counter));
	}
	}

	public static int setLekseis (String word, ArrayList<String> Lekseis) {
			int index = -1;
			for (int i = 0; i < Lekseis.size(); i++) {
				if (word.equals(Lekseis.get(i))) {
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
