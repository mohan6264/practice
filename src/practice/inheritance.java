package practice;

class animals {
	void eat() {
		System.out.println("eating...");
	}
}
	class dog extends animals{
		void bark() {
			System.out.println("barking....");
			
	}
	}
 class inheritance {
public static void main(String[] args) {
	dog d=new dog();
	d.bark();
	d.eat();
}
 }	