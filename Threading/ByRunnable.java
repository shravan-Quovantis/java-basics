package Threading;

class myRunnable implements Runnable{
    public void run(){
        for (int i=0; i<5; i++){
            System.out.println("Job myRunnable - " + i);
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadingByRunnable {
    public static void main(String[] args) throws InterruptedException {
        myRunnable objRunbl = new myRunnable();
        Thread t1 = new Thread(objRunbl);                           //passing reference variable as constructor argument
        t1.start();
        for (int i=0; i<5; i++){
            System.out.println("Main Job - " + i);
            Thread.sleep(4000);
        }
    }
}
