package threads;
class Value{
	static int total_value=10;
	synchronized public void find(int value) {
		if(total_value>=value) {
			//total_value-=value;
			System.out.println(total_value+"is greater than" +value);
		}
		else 
			{
			if(total_value<=10) {
			
			System.out.println(total_value+"is less than"+value);
			
		}
		else {
			System.out.println(total_value+ "value is not equal to"+value);
		}
	}
}
}
public class Synchronisation extends Thread 
{
	static  Value value;
     int  values;
public Synchronisation(Value value) {
	this.value=value;
}

public void run() 
{
	value.find(values);
}
	public static void main(String[] args) {
		value=new Value();
		Synchronisation val=new Synchronisation(value);
		//val.values=2;
		val.values=16;
       val.start();
       
       Synchronisation obj1=new Synchronisation(value);
       obj1.values=4;
       obj1.start();
	}

}
