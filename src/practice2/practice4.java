package practice2;

class practice4 {
String name;
int age;
int salary;
public practice4(String name,int age,int salary) {

this.name=name;
this.age=age;
this.salary=salary;

	}
public static void main(String []args) {
	practice4 student=new practice4("raj",21,340000);
	System.out.println(student.name);
}
}
