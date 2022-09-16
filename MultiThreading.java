package ThursDayLab;

import java.util.*;

public class MultiThreading {


	class A extends Thread
	{
		public void run()
		{
			System.out.println("\nGenerating Five random numbers...");
			Random m=new Random();
			for(int i=0;i<6;i++)
			{
				int num=m.nextInt(9);
				System.out.println(num);
				try
				{
					Thread.sleep(1000);  // To delay One Second , 1000ms = 1 second
				}
				catch(InterruptedException e)
				{
					
				}
			}
		}
	}

	class B extends Thread
	{
		int n;
		B(int num)
		{
			n=num;
		}
		public void run()
		{
			System.out.println("Square of "+n+" is :"+(n*n));
		}
	}

	class C extends Thread
	{
		int n;
		C(int num)
		{
			n=num;
		}
		public void run()
		{
			System.out.println("Cube of "+n+" is :"+(n*n*n));
		}
	}
	class Prgrm3BMultiThread {

		public static void main(String[] args) {
			A t1 = new A();
			B t2 = new B(4);
			C t3 = new C(12);
			t1.start();
			try
			{
				t1.join();  // to complete the random nos
			}
			catch(InterruptedException e)
			{
				
			}
			t2.start();
			t3.start();
			
		}

	}

}