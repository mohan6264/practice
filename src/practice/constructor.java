package practice;

public class constructor {
	int age;
	String name;

	static String college="gudlavalleru";
	public constructor(String name,int age) {
		this.name=name;
		this.age=age;
	}
		void display()
		{
			System.out.println(name+" "+age+" "+college);
		}
	public static void main(String[] args) {
		constructor student1=new constructor("rock",20);
		constructor student2=new constructor("avatar",21);
		constructor student3=new constructor("valtheru veerayya",22);
		student1.display();
		student2.display();
		student3.display();
		
}
}
