package threads;


		class a1 extends Thread {
		    public void run()
		    {
		        synchronized (this)
		        {
		            System.out.println(
		                Thread.currentThread().getName()
		                + "...starts");
		            try {
		                this.wait();
		            }
		            catch (InterruptedException e) {
		                e.printStackTrace();
		            }
		            System.out.println(
		                Thread.currentThread().getName()
		                +   "a1 notified");
		        }
		    }
		}
		class a2 extends Thread {
		    a1 geeks1;
		    
		    a2(a1 geeks1){ 
		      this.geeks1 = geeks1; 
		    }
		    
		    public void run()
		    {
		        synchronized (this.geeks1)
		        {
		            System.out.println(
		                Thread.currentThread().getName()
		                + "...starts");
		  
		            try {
		                this.geeks1.wait();
		            }
		            catch (InterruptedException e) {
		                e.printStackTrace();
		            }
		            System.out.println(
		                Thread.currentThread().getName()
		                +   "a2 notified");
		        }
		    }
		}
		class a3 extends Thread {
		    a1 geeks1;
		    a3(a1 geeks1) { 
		    	this.geeks1 = geeks1; 
		    	}
		    public void run()
		    {
		        synchronized (this.geeks1)
		        {
		            System.out.println(
		                Thread.currentThread().getName()
		                + "...starts");
		            this.geeks1.notify();
		            System.out.println(
		                Thread.currentThread().getName()
		                + "a3 notified");
		        }
		    }
		}
		class Notify {
		    public static void main(String[] args)
		        throws InterruptedException
		    {
		  
		        a1 geeks1 = new a1();
		        a2 geeks2 = new a2(geeks1);
		        a3 geeks3 = new a3(geeks1);
		        Thread t1 = new Thread(geeks1, "Thread-1");
		        Thread t2 = new Thread(geeks2, "Thread-2");
		        Thread t3 = new Thread(geeks3, "Thread-3");
		        t1.start();
		        t2.start();
		        Thread.sleep(100);
		        t3.start();
		    }
		}