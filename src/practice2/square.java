package practice2;

abstract class practice14 {
abstract int getArea();
abstract int getPerimeter();
}
public class square extends practice14{
	int length;
	square(int length){
		this.length=length;
	}
	public int getArea() {
		
	return length*length;
	}
 public int getPerimeter() {
 return 4*length;
 
	
}
public static void main(String[] args) {
	square s=new square(3);
	System.out.println(s.getArea());
	System.out.println(s.getPerimeter());
}
}