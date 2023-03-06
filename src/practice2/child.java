package practice2;

 class practice15 {
	
	int x;
	practice15(int x){
		this.x=x;
		}
	}
public 	class child extends practice15{
	int y;
	child(int x,int y){
		super(x);
		this.y=y;
		
	}
	public static void main(String[] args) {
		practice15 obj=new practice15(23);
		child s=new child(885,22);
		System.out.println(obj.x);
		System.out.println(s.x);
		
	}
}

