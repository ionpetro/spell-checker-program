import java.util.*;
import java.io.*;


public class hash {


	//list of suggested words//
	public static List<String> suggested = new ArrayList<String>();

	// the dictionary used//
	public static HashSet<String> dictionary = new HashSet<String>();


	public static void main (String[]args){
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
		ArrayList<String> list = new ArrayList<String>();
			list.add("computer");





		int i=0;

		//checking words that are similar to each element of the list and putting them into a suggested list to be displayed
		for(int j=0;j<list.size();j++) {
			for(String s : dictionary){
		     	i = Levenshtein.distance(s, list.get(j));
		     	if(i == 0) {
					System.out.println("as");
		     	}else if(i<2){
		          suggested.add(s);
		     	}
        	}
		}

		for(String a : suggested) {
		            System.out.println(a);
		}

	}
}
