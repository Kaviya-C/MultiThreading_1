package string.string_new_methods.and.thread_concept_1;



/*
 *  sleep method is public static void 
 *	public static void sleep(long MilliSeconds) throws InterruptedException
 *	public static void sleep (long miliseconds,int nanos) throws InterruptedExceptio
 *	currently executing thread to sleep for specified number of milliseconds
 *
 *
 *
 * if the value of sleep method millisecond and nanos is negative mean we get IllegalArgumentException
 * InterruptedException 
 * 
 * we have to use Thread.sleep()---this is correct way
 * 
 * don't use sleep() 
 * 
 * if u want to sleep particular thread mean then 
 * u have to mention that sleep method inside that 
 * particular thread of run() method 
 * 
 * MOST IMPORTANT:--- current thread only go to sleep not other thread
 * 
 * EG:if u write Thread.sleep() inside the main method then 
 * main thread only going to sleep not other threads
 * 
 */

class MyOwnThreads extends Thread
{
	public MyOwnThreads(String name)
	{
		super(name);
	}
	@Override
	public void run()
	{
		for(int index=0;index<5;index++)
		{
			try
			{
			sleep(1000,100000);
			System.out.println("my own: "+index+" name: "+getName());
			}
			catch(InterruptedException e)
			{
				e.getCause();
			}
			
			
		}
	}
}
public class ThreadSleepMethod
{
	public static void main(String...args) 
	{
		System.out.println("Before sleep....");
		MyOwnThreads me=new MyOwnThreads("kaviya thread");
		me.start();
		try {
			for(int index=1;index<4;index++)
			{
		       me.sleep(3000);
		       System.out.println(index);
			}
		}
		catch(InterruptedException e)
		{
		System.out.println(e.getCause());
		}
		System.out.println("After 3 milli seconds");
		
	}

}
