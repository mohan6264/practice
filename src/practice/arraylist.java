package practice;
import java.util.*;
public class arraylist {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("yashwath");
		al.add("rajesh");
		al.add("mahesh");
		al.add("suresh");
	Iterator itr=al.iterator();
	while(itr.hasNext()) {

	
	System.out.println(itr.next());
	}

}
}

