package practice2;
import java.util.Scanner;
public class If {
public static void main(String[] args) {
	Scanner console=new Scanner(System.in);
	System.out.println("enter number:");
	int a=console.nextInt();
	if(a%2==0) {
		System.out.println("number is even");
	}
	else
	{
		System.out.println("number is odd");
	}
	System.out.println(args[0]);

	}

}
