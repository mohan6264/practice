package practice2;
import java.util.Scanner;
public class Switch {
public static void main(String[] args) {
	Scanner console=new Scanner(System.in);
	System.out.println("Enter day=");
	String day=console.next();
	switch(day) {
	case "monday":{
	System.out.println("monday");
	break;
	}
	case "tuesday":
		System.out.println("tuesday");
	break;
      
	}

}
}