public class encpasu {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Kumar");
        s.setAge(20);

        System.out.println("Name: " + s.getName());  // Output: Name: Kumar
        System.out.println("Age: " + s.getAge());    // Output: Age: 20
    }
}
class Student {
    // private variables - data hiding
    private String name;
    private int age;

    // getter for name
    public String getName() {
        return name;
    }

    // setter for name
    public void setName(String newName) {
        name = newName;
    }

    // getter for age
    public int getAge() {
        return age;
    }

    // setter for age
    public void setAge(int newAge) {
        if (newAge > 0) {
            age = newAge;
        }
    }
}

