package practice2;
import java.util.Scanner;
public class String2 {
public static void main(String []args) {
	Scanner console=new Scanner(System.in);
	System.out.println("enter string:");
	String a=console.next();
	
	/*for(int i=a.length()-1;i>=0;i--) {
		System.out.print(a.charAt(i));
	}*/
/*int i=a.length()-1;
	/*while(i>=0) {
		/*System.out.print(a.charAt(i));
		/*i--;
		 * 
		 */
	int i=a.length()-1;
	do {

	System.out.print(a.charAt(i));
	i--;

	}while(i>=0);

}
	}


