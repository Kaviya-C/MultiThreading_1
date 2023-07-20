package string.string_new_methods.and.thread_concept_1;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

class Shared1
{
    synchronized void methodOne(Shared1 s)
    {
        Thread t = Thread.currentThread();
 
        System.out.println(t.getName()+"is executing methodOne...");
 
        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
 
        System.out.println(t.getName()+"is calling methodTwo...");
 
        s.methodTwo(this);
 
        System.out.println(t.getName()+"is finished executing methodOne...");
    }
 
    synchronized void methodTwo(Shared1 s)
    {
        Thread t = Thread.currentThread();
 
        System.out.println(t.getName()+"is executing methodTwo...");
 
        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
 
        System.out.println(t.getName()+"is calling methodOne...");
 
        s.methodOne(this);
 
        System.out.println(t.getName()+"is finished executing methodTwo...");
    }
}
 
public class DetectDeadLock 
{
	public static void main(String...args)
	{
		final Shared1 s1 = new Shared1();
		 
        final Shared1 s2 = new Shared1();
 
        Thread t11 = new Thread()
        {
            public void run()
            {
                s1.methodOne(s2);
            }
        };
 
        Thread t2 = new Thread()
        {
            @Override
            public void run()
            {
                s2.methodTwo(s1);
            }
        };
 
        t11.start();
 
        t2.start();
 
        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
		ThreadMXBean bean=ManagementFactory.getThreadMXBean();
	    long[] ids=bean.findMonitorDeadlockedThreads();
	    if(ids!=null)
	    {
	    	ThreadInfo[] array=bean.getThreadInfo(ids);
	    	for(ThreadInfo t1:array)
	    	{
	    		System.out.println(t1.getThreadId());
//	    		System.out.println(t1.getThreadName());
//	    		System.out.println(t1.getLockName());
//	    		System.out.println(t1.getLockOwnerId());
//	    		System.out.println(t1.getLockOwnerName());
	    	}
	    }
	
	
	}

}
