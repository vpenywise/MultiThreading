
public class MultiThreadingTesting implements Runnable {
	
	private int threadNumber;
	public MultiThreadingTesting(int threadNumber) {
		this.threadNumber = threadNumber;
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " from thread " + threadNumber);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public MultiThreadingTesting() {
		
	}

}
