package java;

class MyThread extends Thread {
    
    public MyThread(String name) {
        super(name);
        start();
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Child thread running: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(getName() + " was interrupted");
            }
        }
        System.out.println(getName() + " - Child thread completed");
    }
}

public class labprog12 {
    public static void main(String[] args) {
        MyThread childThread = new MyThread("ChildThread");

        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Main thread running: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Main thread was interrupted");
            }
        }
        System.out.println("Main thread completed");
    }
}
