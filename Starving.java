class Resource {
    public synchronized void useResource(String threadName){
        System.out.println(threadName + " is using resource.");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class HPT extends Thread{
    private Resource resource;

    public HPT(Resource resource){
        this.resource = resource;
        this.setPriority(Thread.MAX_PRIORITY);
    }
    public void run(){
        while (true) {
            resource.useResource("HighPT");
        }
    }
}

class LPT extends Thread{
    private Resource resource;

    public LPT(Resource resource){
        this.resource = resource;
        this.setPriority(Thread.MIN_PRIORITY);
    }
    public void run(){
        while (true) {
            resource.useResource("LowPT");
        }
    }
}

public class Starving {
    public static void main(String[] args) {
        Resource resource = new Resource();
        HPT hpt = new HPT(resource);
        LPT lpt = new LPT(resource);

        hpt.start();
        lpt.start();
    }    
}
