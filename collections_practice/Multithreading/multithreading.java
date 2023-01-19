package Multithreading;
class thread1 extends Thread{
    public void run(){
        System.out.println("thread1 is running...");
    }
}
public class multithreading extends Thread{
    @Override
    public void run() {
        System.out.println("thread is running...");
    }



    public static void main(String[] args) throws InterruptedException {
        multithreading ml= new multithreading();
        multithreading m2= new multithreading();
       thread1 t1= new thread1();

//        m2.start();
        ml.start();
        t1.start();
        ml.sleep(1000);
        System.out.println( ml.isInterrupted());
//        ml.yield();
//        t1.setPriority(1);
//        ml.setPriority(2);
//        t1.setName("thread1");
//        ml.setName("thread");
//        System.out.println(t1.getName());


//        System.out.println(activeCount());


    }
}
