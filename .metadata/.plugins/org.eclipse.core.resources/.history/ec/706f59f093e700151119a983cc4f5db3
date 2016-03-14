package Ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Read {
	public static void main(String[] args) throws IOException {
		Path file = Paths.get("dvds.txt");
		
		BufferedReader reader = Files.newBufferedReader(file);
		String line =reader.readLine();
		while (line != null){
			System.out.println();
			line = reader.readLine();
		}
		reader.close();
	}

}
