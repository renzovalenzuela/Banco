package M15E4;

public class ThreadTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HelloRunner r = new HelloRunner();
		Thread t = new Thread(r);
		t.start();
	}

}
