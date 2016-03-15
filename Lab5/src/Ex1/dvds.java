package Ex1;

public class dvds {
	public String name;
	public double price;
	public char cat;
	public static int count =0;
	public char namec;
	
	public dvds(String n, int priceofsale, char cata){
		name =n;
		price = priceofsale;
		cat=cata;
		count++;
		
	}
	public dvds (String n, double a, char m){
		name = n;
		price = a;
		cat = m;
		count++;
	}
	public String getName(){
		return name;
	}
	public char getNamec(){
		return namec;
	}
	public String toString(){
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
	
}