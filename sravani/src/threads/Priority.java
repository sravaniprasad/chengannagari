package threads;

class A1 implements Runnable{
	public void run() {
		System.out.println("Thread A:");
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
				
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("value of i in thread A:"+i);
		}
		System.out.println("thread A:exit");
	}
}


class B1 implements Runnable{
	public void run() {
		System.out.println("Thread B:");
		for(int j=0;j<10;j++) {
			System.out.println("value of j in thread B:"+j);
		}
		System.out.println("thread B:exit");
	}
}

class C1 implements Runnable{
	public void run() {
		System.out.println("Thread B:");
		for(int k=0;k<10;k++) {
			System.out.println("value of k in thread C:"+k);
		}
		System.out.println("thread C:exit");
	}
}

public class Priority {

	public static void main(String[] args) {
		A obj=new A();
		B obj1=new B();
		C obj2=new C();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj1);
		Thread t3=new Thread(obj2);
		
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(1);
		
		
		t1.start();
		t2.start();
		t3.start();
//		 A1 a=new A1();
//		 B1 b=new B1();
//         C1 c=new C1();
//         Thread t1=new Thread(a);
//         Thread t2=new Thread(b);
//         Thread t3=new Thread(c);
//         t1.start();
//         t2.start();
//         t3.start();

	}

}
