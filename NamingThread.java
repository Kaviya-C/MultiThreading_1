package string.string_new_methods.and.thread_concept_1;

class MyOwnThread extends Thread
{
	
	@Override
	public void run()
	{
		System.out.println("Inside run methof of my own thread...");
	}
}
class OwnThread extends Thread{
	
	OwnThread(String name)
	{
		super(name);
	}
	@Override
	public void run()
	{
		
	}
}
public class NamingThread
{
	public static void main(String...args)
	{
		//we can change the thread name by using setName()
		//we can get the thread name by using getName()
	    //public final void setName(String name){}
		//public final String getName(){}
//	
//	Thread t=Thread.currentThread();
//	System.out.println(t.getName());
//	t.setName("this is main thread");
//	System.out.println(t.getName());
//	MyOwnThread my=new MyOwnThread();
//	my.setName("MY Own Thread");
//	System.out.println(my.getName());
//	my.start();
//	
//	MyOwnThread m=new MyOwnThread();
//	m.start();
//	m.setName("another thread");
//	System.out.println(m.getName());
//	
//	
//	MyOwnThread m1=new MyOwnThread();
//	m1.start();
//	System.out.println(m1.getName());
//	
//	t.setName("Main-thread-modify by me");
//	System.out.println(t.getName());
	
	OwnThread o=new OwnThread("kaviya");
	o.start();
	System.out.println(o.getName());
	/*
	 * we can change the thread name at any state
	 * Thread.start()---after this also we can change the thread state
	 * Thread.sleep(3000)--after this also we can able to change the thread state
	 * 
	 * DEFAULT NAME OF THE THREAD
	 * Thread followed by - hyphen  then starts from 0 as follows
	 * 
	 */
	}

}
