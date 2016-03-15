package Ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;


public class DVD{
	

public static void main(String[] args) throws IOException{
	Path file = Paths.get("src/dvds.txt");
	BufferedReader reader = Files.newBufferedReader(file);
	String line = reader.readLine();
	int a = 0;
	double [] prices = new double [16];
	String [] [] cata = new String [2][16];
	while (line!=null){
			
			//System.out.println(line);
		String [] lineSplit = line.split("\t");
		String name = lineSplit[0].toString();
	//		System.out.println(lineSplit[2]);
		double price = Double.valueOf(lineSplit[1]);
		char cat = lineSplit[2].charAt(0);
			//System.out.println(lineSplit[0]);
		dvds myDvd = new dvds(name,price,cat);
		System.out.println(myDvd.getName());
		line = reader.readLine();
		prices[a]=myDvd.getPrice();
		cata[0][a]=myDvd.getName();
		cata[1][a]=lineSplit[2];
		a=a+1;
		String gene = lineSplit[2];
		switch (gene){
		case "A": System.out.println(Films.Action);break; 
		case "C": System.out.println(Films.Comedy);;break;
		case "D": System.out.println(Films.Drama);;break;
		case "S": System.out.println(Films.ScienceFiction);break;
		}
		}
		
		//double sum = DoubleStream.of(prices).sum();
		OptionalDouble average = DoubleStream.of(prices).average();
		System.out.println("There are "+a+" lines!");
		System.out.println("The average of prices is "+ average);
		//System.out.println(cata);
		reader.close();
		//this is the end of ex2
		//String gene=null;
		
		
			
		
		//System.out.println(gene);
	}
		
}
