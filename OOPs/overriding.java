package OOPs;

class Father {

    public void talk(){
        System.out.println("soft - Inside Father Class");
    }
    public void punchline() {
        System.out.println("We are family! - Father");
    }
}

class Son extends Father {
    public void punchline() {
        System.out.println("We are a family and a team! - Son");
    }
}

public class overriding {
    public static void main(String[] args) {
        Father s = new Son();                        //Run time Polymorphism
        Father f = new Father();
        f.punchline();
        f.talk();
        s.punchline();
        s.talk();
    }
}
