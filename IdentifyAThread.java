package string.string_new_methods.and.thread_concept_1;

class My_Thread extends Thread
{
	public long getId()
	{
		return super.getId()+1;
	}
}
//we can identify thread by using getId()
// from java 19 this getId() method is deprecated
public class IdentifyAThread 
{
	public static void main(String...args)
	{
		My_Thread m=new My_Thread();
		System.out.println(m.getId());
		m.setName("My Own Thread");
		System.out.println(m.getId());
		m.start();
		Thread t=Thread.currentThread();
		long result=t.getId();
		System.out.println(result);
				
	}

}
