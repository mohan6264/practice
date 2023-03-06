package practice2;
import java.util.Scanner;
public class IfSum {
      public static void main(String[] args) {
    	  Scanner scanner=new Scanner(System.in);
    	  System.out.println("enter numbers");
    	  int sum=0;
    	  boolean isExit=false;
    	  while(!isExit) {
    		  if(scanner.hasNextInt()) {
    			  int e=scanner.nextInt();
    			 sum=sum+e;
    		  }
    		  else if(scanner.hasNext()){
    			  String line=scanner.next();
    			  if(line.equals("enter"))
    				  																						isExit=true;
    			  
    			  
    			  
    		  }
    	  }
System.out.println(sum);
	}

}
