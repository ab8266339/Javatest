package exg;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class velocity {
	public static void main(String[] args) throws IOException{
		Path file = Paths.get("src/velocities.txt");
		BufferedReader reader = Files.newBufferedReader(file);
		String line = reader.readLine();
		int a = 0;
		double [] velos = new double [1000];
		
		while (line!=null){
			String [] lineSplit = line.split("\t");
			//System.out.println(lineSplit);
			for(int i=0; i<lineSplit.length;i++){
				double num = Double.valueOf(lineSplit[i]);
				
		
			
				Numbers numbers = new Numbers(num);
				velos [a] = Double.valueOf(numbers.toString());
				a =a+1;
				System.out.println(numbers.toString());
			}
			
			line = reader.readLine();
			
		}
		reader.close();
		OptionalDouble average = DoubleStream.of(velos).average();
		System.out.println("The average of velocities is "+ average);
	}
	
}
