package practice2;
class draw{
	void draw() {
		System.out.println("drawing");
	}
}
class circle extends draw{
	void draw() {
		System.out.println("drawing circle");
	}
		void create() {
			System.out.println("creating circle");
		
	}
}
class traingle extends draw{
	void draw() {
		System.out.println("drawing traingle");
	}
}
public class Polymorphism {
	public static void main(String[] agrs) {
		draw r;
		r=new circle();
		r.draw();
		((circle)(r)).create();

		r=new traingle();
		r.draw();
	}

}
