import java.util.*;
import java.io.*;


public class WordFinder extends SpellChecker {


	public static void findWords(ArrayList<String> findwords) {
		
		
  		dictionary = new HashSet<String>();
  		



		//read dictionary
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("./dictionary.txt"));
	        String line = null; // notes one line at a time
	        while((line = bufferedReader.readLine()) != null) {
	        	dictionary.add(line);//add dictinary word in
	        }
	    }

        catch(IOException ex) {
		}


		int i = 0;
		boolean flag = false;

		//checking words that are similar to each element of the list and putting them into a suggested list to be displayed

		for(int j = 0; j < findwords.size(); j++) {
			
			suggestedWords.clear();
			flag = false;
			
			for(String s : dictionary){

		     	i = Levenshtein.distance(s.toLowerCase(), findwords.get(j).toLowerCase());

		     	if(dictionary.contains(findwords.get(j))) {
					flag = true;
					break;
				}

				if(i < 2 && i > 0) {
					wrongWords.add(findwords.get(j));
					suggestedWords.add(s);
		     	}
        	}

        	if (flag == false) {
        		
        		System.out.println("Η λέξη " + findwords.get(j) + " είναι λανθασμένη . Μήπως εννοείται:");
        		
        		for(String a : suggestedWords) {
					System.out.println(a);
				}
			
				System.out.println("\n");
			}
		}
	}
}
