package threads;
class Aa extends Thread
{
	int sum=0;
	public void run() 
	{
		synchronized(this)
		{
		for(int i=1;i<=10;i++) 
		{
			sum+=100;
		}
		  
		this.notify();
		}
	}
}

public class Wait 
{

	public static void main(String[] args)
	{
		Aa obj=new Aa();
		obj.start();
		

		synchronized(obj)
		{
			try 
			{
				obj.wait();
			} 
			catch (InterruptedException e) 
			{
				
				e.printStackTrace();
			}
				System.out.println("val of a :"+obj.sum);
			
		}
		
	}

}
