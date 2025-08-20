package Multi_Threading;

class PrintNum implements Runnable{
    private int lastNum;
    
    public PrintNum(int n){
        lastNum =n;
    }

    public void run(){
        for (int i = 0; i < lastNum; i++) {
            System.out.println(" " + i);
        }
    }
}
