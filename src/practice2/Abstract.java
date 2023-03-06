package practice2;
abstract class praactice114 {
 abstract int getArea();
}
	 
 	public class Abstract extends praactice114{
	 int length;
	 int breadth;
	Abstract(int length,int breadth){
   	 this.length=length;
	 this.breadth=breadth;
	}
	public int getArea() {
	return length*breadth;		
		}
	public static void main(String[] args) {
	rectangle r=new rectangle(23,3);
    System.out.println(r.getArea());
}
}

