package practice2;

class practice8 {
public int a=10;
protected int b=7;
int c=18;
private int d=45;
void display() {
	System.out.println(a+" "+b+" "+c+" "+d);
}


}
public class practice7 extends practice8{
	public static void main(String[] args) {
		
	practice8 e=new practice8();
	System.out.println(e.a);
	System.out.println(e.b);
	System.out.println(e.c);
	
}

}