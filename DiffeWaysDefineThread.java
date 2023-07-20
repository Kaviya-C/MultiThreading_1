package string.string_new_methods.and.thread_concept_1;

class Parent extends Thread
{
	@Override
	public void run()
	{
		System.out.println("This is seperate concrete class thread");
	}
	
}

public class DiffeWaysDefineThread 
{
	static class MyParent extends Thread
	{
		@Override
		public void run() {
			System.out.println("Static inner class or nested class thread");
		}
	}
	static class MyParRunnable implements Runnable
	{
		@Override
		public void run() {
			System.out.println("Static inner implements runnable thread");
		}
	}
	
	class NonStatic implements Runnable
	{
		@Override
		public void run() {
			System.out.println("Non static inner implements runnable thread");
		}
	}
	class MemberInner extends Thread
	{
		@Override
		public void run() {
			System.out.println("Member inner extends thread");
		}
	}
	public static void main(String...ar)
	{
		//seperate concrete class
		Parent p=new Parent();
		p.start();
		
		//static inner class or nested class
        new MyParent().start();
        Thread t=new Thread(new MyParRunnable());
        t.start();
		
		//non static or member class
        new Thread(new DiffeWaysDefineThread().new NonStatic()).start();
   		new DiffeWaysDefineThread().new MemberInner().start();
        
		
		
		//local inner class
   		class LocalInner extends Thread{
   			@Override
   			public void run()
   			{
   				System.out.println("Local inner thread inside main method");
   			}
   		}
   		new LocalInner().start();
		
		
		
		//anonymous inner class
   		new Thread()
   		{
   			@Override
   			public void run()
   			{
   				System.out.println("Anonymous inner thread");
   			}
   		}.start();;
	}

}
