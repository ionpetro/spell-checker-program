import java.util.Scanner;

public class SCANNERSPLITTEST {

	public static void main ( String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String strippedInput = input.replaceAll("\\W ", " ");
		String array[] = new String[1000];
		int i = 0;
		Scanner fromStr = new Scanner(strippedInput);
		while (fromStr.hasNext()) {
			array[i]=fromStr.next();
			i++;
		}

		for (int j=0;j<i;j++) {
		System.out.println(array[j]);
		}
	}


}
