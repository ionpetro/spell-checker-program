import java.io.IOException;

public class test_Dictionary {

  public static void main(String args[]) throws IOException{

	  final String dictname = "el_GR.txt";
	  Dictionary dic = new Dictionary();
	  dic.create(dictname);

	  //example
	  System.out.println(""+dic.getValue(1234));
  }
}
