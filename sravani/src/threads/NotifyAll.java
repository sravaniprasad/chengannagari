package threads;

	class a11 extends Thread {
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
	                + "...notified");
	        }
	    }
	}
	class a22 extends Thread {
	    a11 read;
	    
	    a22(a11 demo){ 
	      this.read = read; 
	    }
	    
	    public void run()
	    {
	        synchronized (this.read)
	        {
	            System.out.println(
	                Thread.currentThread().getName()
	                + "...starts");
	  
	            try {
	                this.read.wait();
	            }
	            catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	            System.out.println(
	                Thread.currentThread().getName()
	                + "...notified");
	        }
	    }
	}
	class a33 extends Thread {
	    a11 write;
	    a33(a11 demo) { this.write = demo; }
	    public void run()
	    {
	        synchronized (this.write)
	        {
	            System.out.println(
	                Thread.currentThread().getName()
	                + "...starts");
	  
	            this.write.notifyAll();
	            System.out.println(
	                Thread.currentThread().getName()
	                + "...notified");
	        }
	    }
	}
	class NotifyAll {
	    public static void main(String[] args)
	        throws InterruptedException
	    {
	  
	        a11 demo = new a11();
	        a22 demo1 = new a22(demo);
	        a33 demo2 = new a33(demo);
	        Thread t1 = new Thread(demo, "Thread-1");
	        Thread t2 = new Thread(demo1, "Thread-2");
	        Thread t3 = new Thread(demo2, "Thread-3");
	        t1.start();
	        t2.start();
	        Thread.sleep(100);
	        t3.start();
	    }
	}

