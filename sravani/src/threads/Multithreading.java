package threads;
//class A extends Thread{
class A implements Runnable{
	public void run() {
		System.out.println("Thread A:");
		for(int i=0;i<10;i++) {
//			try {
//				Thread.sleep(1000);
//				
//			}
//			catch(InterruptedException e) {
//				e.printStackTrace();
//			}
			System.out.println("value of i in thread A:"+i);
			
		}
		System.out.println(Thread.currentThread()+"value of ThreadA");
		System.out.println(Thread.currentThread().getName());
		System.out.println("thread A:exit");
	}
}
//class B extends Thread{
class B implements Runnable{
	public void run() {
		System.out.println("Thread B:");
		for(int j=0;j<10;j++) {
			System.out.println("value of j in thread B:"+j);
		}
		System.out.println(Thread.currentThread()+"value of ThreadB");
		System.out.println(Thread.currentThread().getName());
		System.out.println("thread B:exit");
	}
}
//class C extends Thread{
class C implements Runnable{
	public void run() {
		System.out.println("Thread B:");
		for(int k=0;k<10;k++) {
			System.out.println("value of k in thread C:"+k);
		}
		System.out.println(Thread.currentThread()+"value of ThreadC");
		System.out.println(Thread.currentThread().getName());
		System.out.println("thread C:exit");
	}
}

public class Multithreading {

	public static void main(String[] args) {
		 A a=new A();
		 B b=new B();
         C c=new C();
         Thread t1=new Thread(a);
         Thread t2=new Thread(b);
         Thread t3=new Thread(c);
         t1.start();
         try {
			t1.join();
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
         t2.start();
         t3.start();
        
      //   t2.suspend();
         t3.suspend();
//         a.start();
//         b.start();
//         c.start();


	}

}
