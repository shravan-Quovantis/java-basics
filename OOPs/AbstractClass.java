package OOPs;

abstract class vehicle{
    public abstract int getNoOfWheels();                                                //Abstract method, it has no body
    public abstract String getColor();

    void method(){
        System.out.println("This is a concrete method from class A");        //Concrete methods are allowed in abstract class
    }
}

class Bus extends vehicle{
    private final int noOfWheels;
    private final String color;

    public Bus(int noOfWheels, String color) {
        this.noOfWheels = noOfWheels;
        this.color = color;
    }

    public int getNoOfWheels(){
        return noOfWheels;
    }
    public String getColor(){
        return color;
    }
}

class Auto extends vehicle{

    public int getNoOfWheels(){
        return 3;
    }

    public String getColor(){
        return "Green";
    }
}
public class AbstractClass {
    public static void main(String[] args){
        Bus objBus = new Bus(6, "Red");
        Auto objAuto = new Auto();

        System.out.println("Bus wheel: " + objAuto.getNoOfWheels());
        System.out.println("Auto Color: " + objAuto.getColor());
    }
}