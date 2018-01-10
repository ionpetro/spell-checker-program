import java.util.*;


public class WordFinder extends SpellChecker {


	public static void findWords(ArrayList<String> findwords) {
		
		
  		
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
        		
        		
        		if(suggestedWords.size() != 0) {
        			
            		System.out.println("Η λέξη " + findwords.get(j) + " είναι λανθασμένη . Μήπως εννοείται:");
            		
            		for(String a : suggestedWords) {
    					System.out.println(a);
            		}
    					
    			} else {
    				System.out.println("Η λέξη " + findwords.get(j) + " είναι λανθασμένη . Δεν βρέθηκε προτεινόμενη λέξη! ");
    				
    			
            	
        	}
        			
    
			
				System.out.println("\n");
			}
		}
}
}
