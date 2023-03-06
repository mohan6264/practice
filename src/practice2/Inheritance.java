package practice2;

class animal{
	void eat() {
		System.out.println("eating...");
	}
}

public class Inheritance extends animal{
void bark() {
	System.out.println("barking....");
}
public static void main(String[] args) {
	Inheritance dog=new Inheritance();
	dog.eat();
	dog.bark();
	
}
}
