package Threading;

class ThreadingA extends Thread {
    public void run() {                                                     //overriding run method, Job of Thread
        for (int i=0; i<5; i++){
            System.out.println("JobA - " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadingB extends Thread {
    public void run() {
        for (int i=0; i<5; i++){
            System.out.println("JobB - " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadByExtending {
    public static void main(final String[] args) throws InterruptedException                              //main thread created by JVM
    {
        final ThreadingA objThrdA = new ThreadingA();                         //Instantiation of thread or
        final ThreadingB objThrdB = new ThreadingB();                         //main thread is creating the child thread
        //Sequence of Execution can't be predicted
        objThrdA.start();
        objThrdB.start();
        for (int i=0; i<5; i++){
            System.out.println("Main Job - " + i);
            Thread.sleep(2000);
        }
    }
}