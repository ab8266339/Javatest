package Ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class DVD {
	private String name;
	private double price;
	private char cat;
	private static int count =0;
	
	public DVD(String n, int priceofsale, char cata){
		name =n;
		price = priceofsale;
		cat=cata;
		count++;
		
	}
	public DVD (String n, double a, char m){
		name = n;
		price = a;
		cat = m;
		count++;
	}
	public String getName(){
		return name;
	}
	public double getPrice(){
		return price;
	}
	public char getCata(){
		return cat;
	}
	public void setNameTo(String newName){
		name = newName;
	}
	
	public static void main(String[] args) throws IOException{
		Path file = Paths.get("src/dvds.txt");
		BufferedReader reader = Files.newBufferedReader(file);
		String line = reader.readLine();
		int a = 0;
		double [] prices = new double [16];
		while (line!=null){
			
			//System.out.println(line);
			String [] lineSplit = line.split("\t");
			String name = lineSplit[0];
	//		System.out.println(lineSplit[2]);
			double price = Double.valueOf(lineSplit[1]);
			char cat = lineSplit[2].charAt(0);
			//System.out.println(lineSplit[0]);
			DVD myDvd = new DVD(name,price,cat);
			System.out.println(myDvd.getName());
			line = reader.readLine();
			prices[a]=myDvd.getPrice();
			a=a+1;
			
		}
		//double sum = DoubleStream.of(prices).sum();
		OptionalDouble average = DoubleStream.of(prices).average();
		System.out.println("There are "+a+" lines!");
		System.out.println("The average of prices is "+ average);
		
		reader.close();
		//this is the end of ex2
	}
	
}
