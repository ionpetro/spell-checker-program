import java.util.*;


public class SpellChecker {


	//list of suggested words//
	public static ArrayList<String> suggestedWords = new ArrayList<String>();

	//list of words to check //
	public static ArrayList<String> checkWords = new ArrayList<String>();

	//list of wrong words//
	public static ArrayList<String> wrongWords = new ArrayList<String>();

	// the dictionary used//
	public static HashSet<String> dictionary = new HashSet<String>();


	public static void main(String[]args) {
		loadDictionary();
	}
		
		
	
	
	public static void loadDictionary() {
       
		System.out.println("Σε ποια γλώσσα θελετε να εισάγετε το κείμενο;");
		System.out.println("1.Ελληνικά 2.Αγγλικά 3.Έξοδος");
		
        
        Scanner sc = new Scanner(System.in);
        int language = sc.nextInt(); 
        
        if(language == 1) {
        	
        	Dictionaries.grDictionary();
        	System.out.println("Παρακαλώ πληκτρολογήστε το κείμενο :");
        	startInput();
        	
		} else if (language == 2) {
			
			Dictionaries.enDictionary();
        	System.out.println("Παρακαλώ πληκτρολογήστε το κείμενο :");
        	startInput();
        	
		} else if (language == 3){
			
			System.exit(0);
		
		} else {
			
			System.out.println("Λάθος είσοδος!");
			
		}
    }
	
	public static void startInput() {
		
		
		Scanner scan=new Scanner(System.in, "utf-8");
		String st= scan.nextLine();
		
		final long startTime = System.currentTimeMillis();
		checkWords=Scannersplit.removePunctuation(st);
		WordFinder.findWords(checkWords); 
		final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime) );
	}
	
}
