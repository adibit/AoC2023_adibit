import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ServiceFileReaderToArrayList {
String filePath = "/One_input.txt";
List<String> lines = new ArrayList<>();

public List<String> makeList() {
	
	try {
		lines = Files.readAllLines(Paths.get(filePath));
	} catch (IOException e) {
		System.out.println("An error occurred while reading the file.");
		e.printStackTrace();
	}
	return lines;
}
}
