package practice2;
import java.util.Scanner;
public class Vowels {
public static void main(String[] args) {
	System.out.println("enter word");
	Scanner console=new Scanner(System.in);
	String word=console.nextLine();
	for(int i=0;i<word.length();i++) {
	    char c=word.charAt(i);
		if(c=='a' || c=='e' ||c=='i'||c=='o'||c=='u'){
			System.out.println(c);
		}
			
		}
	}
}