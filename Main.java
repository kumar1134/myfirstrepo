class Outer {
    // Nested Interface
    interface Message {
        void showMessage();
    }
}

// A class implementing the nested interface
class Hello implements Outer.Message {
    public void showMessage() {
        System.out.println("Hello from nested interface!");
    }
}

public class Main {
    public static void main(String[] args) {
        Outer.Message obj = new Hello();  // Using Outer.Message as reference type
        obj.showMessage();                // Output: Hello from nested interface!
    }
}

