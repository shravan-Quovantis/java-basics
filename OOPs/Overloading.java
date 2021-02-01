package OOPs;
//Compile time polymorphism

class Test{
    public int add(final int a,final int b){
        return a+b;
    }

    public int add(final int a,final int b, final int c){
        return a+b+c;
    }
    public double add(final double a, final double b){
        return a+b;
    }

    public String add(final String a, final String b){
        return a.concat(b);
    }
}

public class Overloading {
    public static void  main(String[] args) {
        Test objTest = new Test();
        System.out.println(objTest.add(1,2));
        System.out.println(objTest.add(1, 2, 3));
        System.out.println(objTest.add("Hello", " Guys"));
        System.out.println(objTest.add(10.1, 10.4));
    }
}