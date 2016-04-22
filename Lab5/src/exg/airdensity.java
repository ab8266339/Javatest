package exg;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class airdensity {
	public static void main(String[] args) throws IOException{
		Path file = Paths.get("src/airdensities.txt");
		BufferedReader reader = Files.newBufferedReader(file);
		String line = reader.readLine();
		int a = 0;
		int b=0;
		int c=0;
		double [] velos = new double [1000];
		
		while (line!=null){
			String [] lineSplitTable = line.split("/t");
			//System.out.println(lineSplit);
			for(int i=0; i<lineSplitTable.length;i++){
				String [] lineSplitComma = lineSplitTable[i].split(",");
				double num = Double.valueOf(lineSplitComma[i]);
		
			
				Numbers numbers = new Numbers(num);
				velos [a] =Double.valueOf(lineSplitComma[i]);
				a =a+1;
				System.out.println(numbers.toString());
				for (int j = 0; j < velos.length; j++) {
					b += velos[j];
					
					
				}
			}
			
			line = reader.readLine();
			
			
		}
		reader.close();
		
		c=b/1000;
		//OptionalDouble average = DoubleStream.of(velos).average();
		System.out.println("The average of velocities is "+ c);
	}

}
