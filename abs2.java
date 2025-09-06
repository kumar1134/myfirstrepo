public class abs2 {
}
interface Animal {
    void sound();  // abstract method
    default void eat() {
        System.out.println("Animals eat food");  // default method (has implementation)
    }
    void water(); // abstract method
}

abstract class Dog implements Animal {
    // implementing the method from interface
    public void sound() {
        System.out.println("Dog barks");
    }}


    // abstract class can leave some things to child class (not shown here)
