public class poly {
    public static void main(String[] args) {
        Parent p1 = new Parent();//here obj tyope is parent hence parent class void method will be called 
        p1.add();
        Child c1 =new Child();//here the obj type is the child hence child class methos willb be callled 
        c1.add();
        Parent pc =new Child();
        pc.add();
//here obj typeis child but its reference variable type its only reffferencing the parent class but runs obj type class that is child ,it is known as overridind
    }
}//example to overiding
//both parent classs and child classs have the same method name parameter and return type 
class Parent{
void add()
{
System.out.println("addition of two numbers\n");
}
}
class Child extends Parent{
    @Override//it is a annotation its checks wheather methos is overrind or not
    void add()//if we change this meethos name its aalso run but not overide
    //its overide when the its obj type is created
    {
        System.out.println("additon of three numbers");
    }
}
