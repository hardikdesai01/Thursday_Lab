package ThursDayLab;


	class Thread1 extends Thread {

	    public void run() {
	        System.out.println("Thread1: Java");
	        System.out.println("Thread1: is ");
	        System.out.println("Thread1: exciting ");
	        System.out.println("Thread1: new ");
	        System.out.println("Thread1: language ");
	        System.out.println("Thread1: for ");
	        System.out.println("Thread1: concurrent ");
	        System.out.println("Thread1: programming ");

	    }
	}

	class Thread2 extends Thread {

	    public void run() {
	        System.out.println("Thread2 Java");
	        System.out.println("Thread2: an ");
	        System.out.println("Thread2: is ");
	        System.out.println("Thread2: an ");
	        System.out.println("Thread2: exciting");
	        System.out.println("Thread2: new");
	        System.out.println("Thread2: language");
	        System.out.println("Thread2: for");
	        System.out.println("Thread2: concurrent");
	        System.out.println("Thread2: programming");
	        suspend();
	    }
	}
	class Thread3 extends Thread
	{
	public void run()
	{
	System.out.print("Thread3");
	try
	        {
	sleep(1000);
	}
	catch(Exception e) {
		
	}

	System.out.print(" Running");
	}
	}

	class ThreadDemo3
	{
	public static void main(String args[]) throws InterruptedException
	{
	Thread1 obj1 = new Thread1();
	obj1.start();
	Thread2 obj2 = new Thread2();
	obj2.start();

	}
	}