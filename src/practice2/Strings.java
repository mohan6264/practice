package practice2;
import java.util.Scanner;
public class Strings{
public static void main(String[] args) {
	Scanner console=new Scanner(System.in);
	System.out.println("enter String");
	String a=console.next();
	for(int i=0;i<a.length();i++) {
		if(i%2==1) {
			System.out.println(a.charAt(i));
		}
	}

	}

}
