package OOPs;

abstract class Shape{
    abstract void draw();
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

abstract class Circle extends Shape {    //An abstract class only inherit other abstract class without implementation of
    abstract boolean drawn();           //the abstract methods
}

class Circle1 extends Circle {           //This class has to implement the method of both abstract class
    boolean drawn() {
        return true;
    }

    void draw() {
        System.out.println("Drawing Circle");
    }

    public int area(int r) {
        return 5;
    }

    public int vol(int param) {
        return 6;
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Shape s = new Circle1();
        Circle s1 = new Circle1();
        Shape s2 = new Rectangle();
        s.draw();
        System.out.println(s1.drawn());
        s2.draw();


    }
}
