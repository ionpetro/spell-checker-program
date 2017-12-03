import java.util.Scanner;
public class GreekChars {
	public static void ourText(){
        Scanner keyboard = new Scanner(System.in, "utf-8");
        System.out.println("Enter your text");
        String myText = keyboard.nextLine();
        System.out.println(myText);
	}
}
