// Creating a thread by extending the Thread class
class MyThread extends Thread {
    public void run() {
        // Code that runs in the new thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread is running: " + i);
            try {
                Thread.sleep(500);  // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class MyThread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();  // Create thread object
        t1.start();  // Start the thread

        // Main thread continues to run
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread: " + i);
            try {
                Thread.sleep(500);  // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted.");
            }
        }
    }
}
