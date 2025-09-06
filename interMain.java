
interface Vehicle {
    // Abstract method
    void start();

    default void stop() {
        System.out.println("Stopping...");
    }
}

class Car implements Vehicle {
    int a=3000;
    @Override
    public void start() {
        System.out.println("Car starting...");
    }
}

public class interMain {
    public static void main(String[] args) {
        Car c = new Car();
      // System.out.println (c.a);
        c.start(); // Output: Car starting...
        c.stop();  // Output: Stopping...
    }
}
