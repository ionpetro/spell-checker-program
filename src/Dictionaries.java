import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Dictionaries extends SpellChecker {
	
	public static void grDictionary(){


	//read dictionary
	try {
		BufferedReader bufferedReader = new BufferedReader(new FileReader("./grDictionary.txt"));
        String line = null; // notes one line at a time
        while((line = bufferedReader.readLine()) != null) {
        	dictionary.add(line);//add dictionary word in
        }
        
        bufferedReader.close();
    }

    catch(IOException ex) {
    	ex.printStackTrace();
	}
	}
	
	
	public static void enDictionary(){


		//read dictionary
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("./enDictionary.txt"));
	        String line = null; // notes one line at a time
	        while((line = bufferedReader.readLine()) != null) {
	        	dictionary.add(line);//add dictionary word in
	        }
	       
	        bufferedReader.close();
	    }

	    catch(IOException ex) {
	    	ex.printStackTrace();
		}
	}
}
