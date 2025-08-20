package Multi_Threading;
public class MultiThreading {
    public static void main(String[] args) {
         
        //Create tasks
        Runnable printA = new PrintChar('R', 150);
        Runnable printB = new PrintChar('Z', 100);
        Runnable print100 = new PrintNum(100);

        //Create threads
        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(print100);

        try {
                thread1.start();
                thread1.sleep(6700);
                thread2.start();
                thread3.start();
        } catch (Exception e) {
                System.out.println("Thread " + " interrupted.");       
        }
    }
}

/* Sleep function halts the execution of the thread for a small period of time and puts it into waiting state
   Two ways to create threads in java:
   1) You can extend the thread class
   2) Implement the Runnable Interface (Choice 2 is better in most of the cases)
        Functions for implementing 2) a) Start() b) Sleep() c) Stop() 
*/