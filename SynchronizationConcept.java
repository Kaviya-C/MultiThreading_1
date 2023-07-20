package string.string_new_methods.and.thread_concept_1;

/*
 *	synchronization is a keyword applicable for methods 
 *	and blocks not for varibles.
 *	if we mention the method as synchronized then only one thread can access that method
 *	other thread should wait until the synchronized method thread completes its execution.
 *
 *  synchronized keyword only for methods blocks
 *  we could not use synchronized keyword in constructor static ,non static initializer
 *  but inside constructor static non static initializer we can write synchronized blocks
 *
*/

public class SynchronizationConcept {
	public static void main(String... args) throws InterruptedException {
		class Shared {
			int num;

			synchronized void sharedMethod() {
				num = 10;
				System.out.println(num);
				num = 20;
				System.out.println(num);
				num = 30;
				System.out.println(num);
			}
		}

		final Shared s = new Shared();
		Thread t1 = new Thread() {
			@Override
			public void run() {
				System.out.println("this is t1");
				s.sharedMethod();
			}

		};

		Thread t2 = new Thread() {
			@Override
			public void run() {
				System.out.println("this is t2");
				s.sharedMethod();
			}

		};

		t1.start();
		t1.join();
		t2.start();

	}

}
