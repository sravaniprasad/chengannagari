package threads;

public class Threaddemo {

	public static void main(String[] args) {
		
		Thread t=new Thread();
		Thread t2=new Thread();
		Thread t3=new Thread();
		System.out.println("My Current Thread is: "+t.currentThread());
		//System.out.println("My Current Thread is: "+t2.currentThread());
		 
      
     
        System.out.println("My Current Thread is  "+t.getName());
        System.out.println("My Current Thread is: "+t2.getName());
        t.setName("Thread1");
        System.out.println("My Current Thread is: "+t.getName());
        for(int i=0;i<10;i++) {
        	System.out.println("value of i"+i);
        
        	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
        }
	}

}
