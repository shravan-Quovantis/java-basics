package OOPs;

class Encapsulate {
    private int x;

    public void setAge(final int a) {
        //validation
        x = a;
    }
    public int getAge() {
        //validation
        return x;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        obj.setAge(10);
        System.out.println("Age: " + obj.getAge());
    }
}
