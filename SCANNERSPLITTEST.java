import java.util.Scanner;

public class SCANNERSPLITTEST {

	public static void main ( String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String array[] = new String[1000];
		int i = 0;
		Scanner fromStr = new Scanner(str);
		while (fromStr.hasNext()) {
			array[i]=fromStr.next();
			i++;
		}

		for (int j=0;j<i;j++) {
		System.out.println(array[j]);
		}
	}


}
