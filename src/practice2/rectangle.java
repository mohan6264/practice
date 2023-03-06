package practice2;

interface shape {
	double getArea();
	double getPerimeter();
}
public class rectangle implements shape{
	double length;
	double breadth;
	rectangle(double length,double breadth){
	this.breadth=breadth;
	this.length=length;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length * breadth;
	}
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(length+breadth);
	}
	public static void main(String[] args) {
		rectangle r=new rectangle(9,10);
		System.out.println(r.getArea());
		System.out.println(r.getPerimeter());
	}

}
