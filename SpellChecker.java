import java.util.*;
import java.io.*;


public class SpellChecker {


	//list of suggested words//
	public static ArrayList<String> suggestedWords = new ArrayList<String>();

	//list of words to check //
	public static ArrayList<String> checkWords = new ArrayList<String>();

	//list of wrong words//
	public static ArrayList<String> wrongWords = new ArrayList<String>();

	// the dictionary used//
	public static HashSet<String> dictionary = new HashSet<String>();


	public static void main(String[]args){

			checkWords=scannersplit.removePunctuation();
			WordFinder.findWords(checkWords);

	}


	public static void findWords(ArrayList<String> findwords){
		int tableSIZE=10000000;
  		dictionary = new HashSet<String>(tableSIZE);



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

		/*print whole dictionary//
		for (String temp : dictionary) {
			System.out.println(temp);
    	}
    	*/

		//a list that is filled with some text to spell check

		/*ArrayList<String> list = new ArrayList<String>();
			list.add("computera");
			list.add("dog");
			list.add("librart");
			list.add("papet");*/





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
        	System.out.println(findwords.get(j) + " is incorrect . Maybe you meant:");

        	for(String a : suggestedWords) {
				System.out.println(a);
			}
			System.out.println("\n");
			}
		}



	}
}