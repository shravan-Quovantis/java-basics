package Threading;

class TaskA{

    public void taskA(){
        for (int i=0; i<5; i++) {
            System.out.println("JobA - " + i);
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public void taskB(){
        for (int i=0; i<5; i++) {
            System.out.println("JobB - " + i);
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class Multitasking {
    public static void main(final String[] args) throws InterruptedException {

        final TaskA taskobj = new TaskA();
        taskobj.taskA();
        taskobj.taskB();
        for (int i=0; i<5; i++) {
            System.out.println("Main Job - " + i);
            Thread.sleep(2000);
        }
    }
}
