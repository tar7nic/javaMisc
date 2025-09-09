class Resource {
    public synchronized void useResource(String threadName) {
        System.out.println(threadName + " is using the resource.");
        try {
            Thread.sleep(100); // Simulate time taken to use the resource
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class HighPriorityThread extends Thread {
    private Resource resource;

    public HighPriorityThread(Resource resource) {
        this.resource = resource;
        this.setPriority(Thread.MAX_PRIORITY); // Set to maximum priority
    }

    public void run() {
        while (true) {
            resource.useResource("HighPriorityThread");
        }
    }
}

class LowPriorityThread extends Thread {
    private Resource resource;

    public LowPriorityThread(Resource resource) {
        this.resource = resource;
        this.setPriority(Thread.MIN_PRIORITY); // Set to minimum priority
    }

    public void run() {
        while (true) {
            resource.useResource("LowPriorityThread");
        }
    }
}

public class StarvationExample {
    public static void main(String[] args) {
        Resource resource = new Resource();

        HighPriorityThread highPriorityThread = new HighPriorityThread(resource);
        LowPriorityThread lowPriorityThread1 = new LowPriorityThread(resource);
        LowPriorityThread lowPriorityThread2 = new LowPriorityThread(resource);
        LowPriorityThread lowPriorityThread3 = new LowPriorityThread(resource);

        highPriorityThread.start();
        lowPriorityThread1.start();
        lowPriorityThread2.start();
        lowPriorityThread3.start();
    }
}