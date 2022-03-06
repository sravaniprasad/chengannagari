package java8;

interface Area{
	public void square(int a);
	default void show() {
		System.out.println("default method");
	}
}
public class Java8Default implements Area{
             public void square(int a) {
            	 System.out.println(a*a);
             }
	public static void main(String[] args) {
		Java8Default d=new Java8Default();
		d.square(7);
		d.show();

	}

}
