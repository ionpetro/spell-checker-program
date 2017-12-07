import java.util.*;
import java.io.*;


public class hash {

	public static HashSet<String> dictionary = new HashSet<String>();  // the dictionary used

	public static void main (String[]args){
		int tableSIZE=10000000;
  		dictionary = new HashSet<String>(tableSIZE);
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


			ArrayList<String> list = new ArrayList<String>();
			list.add("harvest");
			list.add("chair");
			list.add("locally");


			for(int i=0;i<list.size();i++) {
				if(dictionary.contains(new String(list.get(i)))) {
			System.out.println("true");
			}}


	}
}