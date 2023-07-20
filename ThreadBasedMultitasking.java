package string.string_new_methods.and.thread_concept_1;

    //we can create thread by 2 ways

	// extending java.lang.Thread class
	
	//implementing java.lang.Runnable interface


//implementing Runnable interface
class ParentThread implements Runnable
{
	@Override
	public void run()
	{
		for(int index=0;index<5;index++)
		{
			System.out.println("  runnable thread ");
		}
	}
}






//below extending thread class
class Thread1 extends Thread
{
	@Override
	public void run()
	{
		for(int index=1;index<10;index++)
		{
		System.out.println(2+"*"+index+"= "+index*2);
		}
	}
}
class Thread2 extends Thread
{
	@Override
	public void run()
	{
		for(int index=0;index<5;index++)
		{
		System.out.println("Thread-2");
		}
	}
}
public class ThreadBasedMultitasking
{
	public static void main(String...args)
	{
		Thread1 t1= new Thread1();
		t1.start();
		new Thread()
				{
		@Override
		public void run()
		{
			System.out.println("anonymous inner thread");
		}
				}.start();
		
		Thread t2=new Thread2();
		t2.start();
		
		for(int index=0;index<10;index++)
		{
			System.out.println("Main thread");
		}
		
		// if we implement runnable interface mean
		// we can't create object directly to call start method
		// we have to  create object then pass that reference 
		//into Thread class that thread class reference used 
		//to call the start method
		
		ParentThread p=new ParentThread();
		Thread t=new Thread(p);
		t.start();
	}
	
}
