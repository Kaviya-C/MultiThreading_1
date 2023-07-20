package string.string_new_methods.and.thread_concept_1;

// two methods there for priority ..
// we have to set the priority from  0 to 10
// if it exceeds the number we will get IllegalArgumentException
// setPriority()   getPriority both are public and final
// MIN_PRIORITY---1
// NORM_PRIORITY--5
// MAX_PRIORITY--10


class OwnThreads extends Thread
{
	public OwnThreads(String name) {
		super(name);
	}
	@Override
	public void run()
	{
		for(int index=1;index<=10;index++)
		{
			System.out.println("From "+getName()+getPriority());
		}
	}
}
public class PriorityOfThread 
{
	public static void main(String...args)
	{
		Thread t=Thread.currentThread();
		System.out.println("Main thread PRIORITY: "+t.getPriority());
		OwnThreads o=new OwnThreads("My Own Thread ");
		o.setPriority(2);
		o.start();
		
		OwnThreads o1=new OwnThreads("My Own Thread ");
		o1.setPriority(4);
		o1.start();
		
		OwnThreads o11=new OwnThreads("My Own Thread ");
		o11.start();
		o11.setPriority(8);
		
		
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		
		o.setPriority(11);//-- IllegalArgumentException--value exceeds
		o1.setDaemon(true);//--IllegalThreadStateException--after starting the thread we set property daemon thread
	}

}
