import java.io.IOException;
import java.util.ArrayList;

public class SearchDictionary {

  public static void main(String args[]) throws IOException{

	  final String dictname = "el_GR.txt";
	  Dictionary dic = new Dictionary();
	  dic.create(dictname);



	ArrayList<String> list = new ArrayList<String>();
	list.add("asda");
	list.add("chair");
	list.add("πείνα");


	int j=0;
	boolean flag=false;
	int position;


	if(list.get(0) == dic.getValue(4))
		{System.out.println(list.size());}

	for(int i=0;i<list.size();i++) {
		while(flag == false && j<dic.getSize()) {
			if (list.get(i) == dic.getValue(j) ) {
				System.out.println("Yparxei sto le3iko");
				position = j;
				flag = true;
			}
		j++;
		}

	}
  }
}