package practice;
import java.util.Scanner;
public class sumOfTwoNumbers {
static int sum(int a,int b) {
	int sum= (a+b);
	return sum;
}
	public static void main(String[] args) {
		Scanner student=new Scanner(System.in);
		int s1=student.nextInt();
		int s2=student.nextInt();
		System.out.println(sum(s1,s2));	
		
	}

}
