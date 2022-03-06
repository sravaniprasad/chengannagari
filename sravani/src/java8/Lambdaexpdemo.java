package java8;

interface exp{
	public abstract void main (int a,int b);
}

public class Lambdaexpdemo {

	public static void main(String[] args) {
		exp obj=(x,y)-> System.out.println(x+y);
		obj.main(10,17);
		
		exp obj1=(x,y)-> System.out.println(x*y);
		obj1.main(10,15);
		
	
	}

}
