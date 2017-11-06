import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Dictionary {

	private static List<String> dictionary;
	final static Charset encoding = StandardCharsets.UTF_8;


	public Dictionary() {
		dictionary = new ArrayList<String>();
	}

	void create(String filePath) throws IOException {
		Path path = Paths.get(filePath);
		try (BufferedReader reader = Files.newBufferedReader(path, encoding)) {
			String line;
			while ((line = reader.readLine()) != null) {
				dictionary.add(line);
			}
		}
	}

	public String getValue(int x) {
		return dictionary.get(x);

	}
}
