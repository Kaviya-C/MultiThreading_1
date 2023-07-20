package string.string_new_methods.and.thread_concept_1;

// thread have its own pros and cons...
/*
 * more than one thread executing simultaneously access same piece of data
 * more than one thread have access to same data
 * there may be a chance that data may get corrupted
 * desired output we may not get
 * 
 * -----To avoid thread interference by:-----
 * declaring method as synchronized
 * declaring variable as final,declaring variable as volatile ,creating immutable objects
 * restrict access to the same object for multiple threads
 * 
 */
class Shared {
	int num;

	void sharedMethod() {
		num = 10;
		System.out.println(num);
		num = 20;
		System.out.println(num);
		num = 30;
		System.out.println(num);
	}
}

public class ThreadInterference {
	public static void main(String... args) {
		final Shared s = new Shared();
		Thread t1 = new Thread() {
			@Override
			public  void run() {
				System.out.println("this is t1");
				s.sharedMethod();
			}

		};

		Thread t2 = new Thread() {
			@Override
			public  void run() {
				System.out.println("this is t2");
				s.sharedMethod();
			}

		};

		t1.start();
		t2.start();

	}

}
