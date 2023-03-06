package practice2;

public class IfElse {

	static String getGrade(int marks) {
		if(marks>=90 && marks<=100) {
			return "A";
		} 
		else if(marks>=80 && marks<=89) {
			return "B";
		}
		else  {
			return "c";
		}

	}
	
	public static void main(String[] args) {
		
	  int s=98;
		System.out.println(getGrade(s));
	}
	

}
