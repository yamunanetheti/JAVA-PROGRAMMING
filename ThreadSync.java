// Shared resource class
class Counter {
    private int count = 0;

    // Synchronized method to avoid race condition
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

// Thread class
class MyThread extends Thread {
    Counter counter;

    MyThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 1; i <= 1000; i++) {
            counter.increment();
        }
    }
}

// Main class
public class ThreadSync {
    public static void main(String[] args) {
        Counter counter = new Counter(); // Shared object

        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);

        t1.start();
        t2.start();

        try {
            t1.join();  // Wait for t1 to finish
            t2.join();  // Wait for t2 to finish
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        System.out.println("Final Count (should be 2000): " + counter.getCount());
    }
}
