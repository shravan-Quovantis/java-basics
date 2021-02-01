package OOPs;
//Method Overloading with Object type parameter
//JVM always finds exact match of parameter
// else if child class will be prioritize
// else if both parameters type are at the same level then it will throw error

class ObjectProc{
    public void test(final Object obj){                 //Accept object type
        System.out.println("Object Version");
    }

    public void test(final String str){                 //Accept string type
        System.out.println("String Version");
    }

//    Code commented out: Passing 'null' as argument while method calling and String & StringBuffer have same priority level
//    so to avoid error commented

//    public void test(final StringBuffer str){
//        System.out.println("StringBuffer Version");
//    }

}
class PolymorphismObjectOverloading {
    public static void main(String[] args) {
        ObjectProc objCaller = new ObjectProc();
        objCaller.test("Quovantis");                    //will call String version
        objCaller.test(new Object());                       //will call Object version
        //objCaller.test(new StringBuffer("Quovantis") );   //will call StringBuffer version or String
        objCaller.test(null);                           //will call string version because String is child of Object class
                                                            // in presence of StringBuffer and String JVM will throw error
    }
}
