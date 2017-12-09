import java.util.*;
import java.io.*;
import java.nio.*;
import java.nio.charset.*;



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

			checkWords=Scannersplit.removePunctuation();
			WordFinder.findWords(checkWords);
	}
}
