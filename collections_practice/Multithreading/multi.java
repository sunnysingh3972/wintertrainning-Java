package Multithreading;

public class multi implements Runnable{
    @Override
    public void run() {
        System.out.println("thread is running....");
    }

    public static void main(String[] args) {
        multi t= new multi();
        Thread t1= new Thread(t);
        t1.start();
    }
}
