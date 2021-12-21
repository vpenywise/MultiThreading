
public class Main {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			MultiThreadingTesting multiThreadingTesting = new MultiThreadingTesting(i);
			Thread myThread = new Thread(multiThreadingTesting);
			myThread.start();
		}
		
	} 

}
