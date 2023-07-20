package string.string_new_methods.and.thread_concept_1;

//we can convert user thread into daemon thread by calling setDaemon() method of the thread

class UserThread extends Thread {
	@Override
	public void run() {
		for (int index = 0; index < 5; index++) {
			System.out.println("User thread..");
		}
	}
}
class Thread11 extends Thread
{
	@Override
	public void run()
	{
		Thread t=new Thread();
		System.out.println(t.isDaemon());
	}
}

class UserThread1 extends Thread{
	@Override
	public void run()
	{
			System.out.println("User thread..");
		
	}
}

class DaemonThread extends Thread{
	
	public DaemonThread()
	{
		setDaemon(true);
	}
	@Override
	public void run()
	{
		for(int index=0;index<1000;index++)
		{
			System.out.println("This is daemon thread"+index);
		}
	}
}
public class TypesOfThreads {
	public static void main(String... args) {
		/*
		 * user thread thread which is created by the application or user these are high
		 * priority threads jvm will not exit until the user thread finish their
		 * executions jvm wait until user thread to finish their execution
		 * 
		 * 
		 * Daemon thread it is a thread created by jvm always runs in background jvm
		 * will not wait for daemon thread to finish their execution jvm immediately
		 * exit after the user thread finish their execution used for garbage
		 * collections
		 *
		 */
		
		UserThread user=new UserThread();
		user.setDaemon(true);
		user.start();
		//System.out.println(user.isDaemon());
		
		Thread11 t11=new Thread11();
		t11.start();
		
		Thread11 t12=new Thread11();
		t12.setDaemon(true);
		t12.start();
		
		DaemonThread d=new DaemonThread();
		d.start();
		
		UserThread1 u=new UserThread1();
		u.start();
		
		
	}

}
