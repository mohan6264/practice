package practice;
class vehicle {
     void display() {
    	 System.out.println("vehicle is running");
	}
}
 class bike2 extends vehicle {
	void display() {
		System.out.println("bike running safely");
	}
	public static void main(String[] args) {
bike2 bike1=new bike2();
bike1.display();
}
}