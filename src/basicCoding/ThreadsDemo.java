package basicCoding;

public class ThreadsDemo extends Thread {
	public void run() {
		for (int i = 0; i <= 50; i++) {
			System.out.println(i + " " + Thread.currentThread().isDaemon());

			/*
			 * try { System.out.println(i+" "+Thread.currentThread().isDaemon());
			 * Thread.sleep(1000); } catch (InterruptedException e) { // TODO Auto-generated
			 * catch block e.printStackTrace(); }
			 */
		}
	}

}
