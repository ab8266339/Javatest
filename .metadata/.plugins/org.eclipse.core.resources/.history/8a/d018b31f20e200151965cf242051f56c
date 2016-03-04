package Ex1;

import javax.swing.JOptionPane;

public class counting {
	public static void main(String[] args){
		read();
	}
	public static void read(){
		String text=JOptionPane.showInputDialog(null,"please input the text");
		char[] textarray =text.toCharArray();
		char[] alphbet ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int[] counting= new int [26];
	
		for(char n: textarray) {
			
			for (int i = 0; i<alphbet.length; i++){
				if (n == alphbet[i]) {
					counting[i]++;
					
				}
			}
		}
		for(int o = 0 ; o<26; o++) {
			System.out.print(alphbet[o] + " " + counting[o] + "  ");
			System.out.print(alphbet[o] + " ");
			for (int k=0; k<counting[o]; k++)
				System.out.print("*");
			System.out.println();
		}
		
				
			
		}
			
	
}
