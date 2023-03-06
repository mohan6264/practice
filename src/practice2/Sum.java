package practice2;
import java.util.Scanner;
public class Sum {
public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	int sum=0;
	boolean isExit=false;
	while(isExit) {
		if(a.hasNextInt()) {
			int b=a.nextInt();
			sum=sum+b;
		}
		else if(a.hasNext()) {
			String line=a.next();
			if(line.equals("enter"));
		}
	}
	
System.out.println(sum);
}
}