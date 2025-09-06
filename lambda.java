public class lambda {
    public static void main(String[] args) {
        //this is anonymous class implementation of functional interface
//        eg e = new eg(){
//            @Override
//            public void show(String s) {
//                System.out.println("Showing: " + s);
//            }
//        };
//        e.show("Hello, Lambda!");
        //lambda expression just simplifies the code of anonymous class by makes it more readable
        eg e = (s) -> System.out.println("Showing: " + s);//it works withput any type declaration because it is functional interface
        e.show("Hello, Lambda!");

        // lambda expression for functional interface with return type
//        eg2 e2 = (a, b) -> (a + b); // This is a lambda expression that implements the eg2 interface
//        e2.add(5, 10); // This will call the add method of the eg2 interface and return the sum
             //OR
        eg2 e2 = (a, b) -> {
            System.out.println("Adding: " + a + " and " + b);
            return a + b; // This will call the add method of the eg2 interface and return the sum
        };
        int result = e2.add(5, 10); // This will call the add method of the eg2 interface and return the sum
        System.out.println("Result: " + result); // Output: Result: 15
    }
}
interface eg {
    void show(String s);  // abstract method and this is functional interface

    default void display() {
        // default method with implementation and functional interface only has one abstract method and have other default methods
        System.out.println("Default display method");
    }
}

interface eg2{
    int add(int a, int b); // abstract method with return type
}
