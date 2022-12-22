package practice;

import java.util.Scanner;
public class sumofintegers {
public static void main(String[] args) {
	Scanner Scanner=new Scanner(System.in);
	int sum=0;
	boolean isExit=false;
	while(!isExit) {
		if (Scanner.hasNextInt()) {
			int number=Scanner.nextInt();
			sum=sum+number;
		}
		else if(Scanner.hasNext()) {
			String line=Scanner.nextLine();
			if(line.equals("ENTER")) {
				isExit=true;
				
			}
		}
	}
	System.out.println(sum);
}
}
