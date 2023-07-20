package string.string_new_methods.and.thread_concept_1;

/*
 * Deadlock is a condition where two or more threads get blocked waiting  for 
 * each other for an infinite period of time to 
 */

class ProblemOccur {

	synchronized void method1(ProblemOccur p) {
		System.out.println("method-------------2");
		Thread t = Thread.currentThread();
		System.out.println(t.getName() + " is execute by method-1");
		System.out.println(t.getName() + " now am calling method-2");
		p.method2(this);
		System.out.println(t.getName() + " is finished now");
	}

	synchronized void method2(ProblemOccur p) {

		Thread t = Thread.currentThread();
		System.out.println("method-------------2-------");
		System.out.println(t.getName() + " is execute by method-1");
		System.out.println(t.getName() + " now am calling method-2");
		p.method1(this);
		System.out.println(t.getName() + " is finished now");
	}

}

public class DeadLock {
	public static void main(String... args) throws InterruptedException {
		ProblemOccur p1 = new ProblemOccur();
		ProblemOccur p2 = new ProblemOccur();
		Thread t1 = new Thread() {
			public void run() {
				System.out.println("*****");
				p1.method1(p2);
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				System.out.println("#######");
				p2.method1(p1);
			}
		};

		t1.start();

		t2.start();

	}

}
