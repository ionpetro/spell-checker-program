import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class test_DictionaryRead {

  public static void main(String... aArgs) throws IOException{
    test_DictionaryRead text = new test_DictionaryRead();

    text.readDictionary(DIC);

  }


  	final static String DIC = "el_GR.txt";
  	final static Charset ENCODING = StandardCharsets.UTF_8;

  	void readDictionary(String elGR) throws IOException {
  		Path path = Paths.get(elGR);
  		try (BufferedReader reader = Files.newBufferedReader(path, ENCODING)){
  			String line = null;
  		    while ((line = reader.readLine()) != null) {
  				System.out.print(" "+line);
  			}
  		}
	}



}