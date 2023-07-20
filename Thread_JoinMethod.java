package string.string_new_methods.and.thread_concept_1;

/*
 *  join() method in java.lang.Thread class
 *  
 *  three forms in join()
 *  
 *  public final void join() throws InterruptedException
 *  public final void join(long millisecond) throws InterruptedException
 *  public final void join(long millisecond,int nano) throws InterruptedException
 *  
 *  sleep()-- 2 forms both final void
 *  Thread.sleep(1000)-- proper way
 *  currently executing thread should wait for specified time
 *  
 *  
 *  join()--- 3 forms all are final void
 *  t3.join()   t2.join()  t1.join()
 *  currently executing thread waits for a thread to 
 *  finish its task on which it is called
 *  
 *  
 *  
 */

public class Thread_JoinMethod {
	public static void main(String... args) throws InterruptedException {
		System.out.println("Main thread starts its execution from 0 to 3000");
		
		final Thread t1 = new Thread() {
			
			@Override
			public void run() {
				System.out.println("__________");
				System.out.println("---------------");
				for (int index = 0; index <= 10; index++) {
					System.out.println(index);
				}
				System.out.println("Number from 0 to 10");
			}

		};
		final Thread t2 = new Thread() {
			@Override
			public void run() {
				try {
					t1.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				for (int index = 11; index <= 20; index++) {
					System.out.println(index);
				}
				System.out.println("Number from 11 to 20");
			}

		};
		final Thread t3 = new Thread() {
			@Override
			public void run() {
//				try {
//					t2.join();
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
				for (int index = 21; index <= 30; index++) {
					System.out.println(index);
				}
				System.out.println("Number from 21 to 30");
			}

		};

		t1.start();
		System.out.println("*******");
        //t1.join();
		t2.start();
        t2.join();
		//t3.start();
		//t3.join();

		System.out.println(" My main method task is completed now...!");

	}

}
