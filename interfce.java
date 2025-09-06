public class interfce {
    public static void main(String[] args) {
        Report r = new Report();
        r.print("kumar");  // Output: Printing report...
        r.show();// Output: Showing report...
      Printable p =(s) -> System.out.println("Lambda printing: " + s); // Lambda expression for Printable interface
        Showable s = () -> System.out.println("Lambda showing report...");//only for functional interface
        p.print("kumar");
        s.show();
    }
}

interface Printable {
    void print(String s);
}

interface Showable {
    void show();
}

class Report implements Printable, Showable {
    public void print(String s)
    {
        System.out.println("Printing report...");
    }

    public void show() {
        System.out.println("Showing report...");
    }
}

