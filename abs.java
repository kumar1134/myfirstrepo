public class abs {
    public static void main(String args[]){
        a1 er = new a2();// we can't create the obj for abstract class but we can use thios as reference
        a1.any();
        er.any();
    }
}
//parent class and its abstract
 abstract class a1 //to use public here we need to create another seperate file its classs 
 {
    int salary;
    abstract void name();
   abstract void age();//we cant create this as static because can't override it
  static void any()//we can create a static method  with body 
  {
    System.out.println("heloo");
   }
    //we can't create the obj or constructor for abstract cllasses beecause they don't contain the body 
}
//child class 
class a2 extends a1{
    @Override
    void name() {
        salary=3200;
        // implementation for name
        System.out.println("Name method implemented in a2");
    }

    @Override
    void age() {
        // implementation for age
        System.out.println("Age method implemented in a2");
    }
    
}
