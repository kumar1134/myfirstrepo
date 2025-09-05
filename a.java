public class a {
    public static void main(String[] args) {
        car s1 = new car();
       // car s2 = new car();
        //System.out.println(s2.engine_name);
//s2.speed();
car s2 = new car("bugati", 1990, "b12");
//System.out.println(s2.engine_name+" "+s2.name);
//s2.speed();
//System.out.println(s1.name);//
car s4 = new car("benz",1991,"deisel");
System.out.println(s4.engine_name+s4.model+s4.name);
car c7 = new car();
System.out.println(c7.name);
    }
    
}
 class car{
String name;
int model;
String engine_name;
//public car(){
//this.name= "maruthi";
//this.engine_name="v12";
//this.model=1990;
//}
public car(){
    this("ak",1997,"c12");
}
void speed(){
    System.out.println("its speed is normal"+" "+this.engine_name);
}
 public car(String naam,int model,String engine_name)
{
name=naam;
this.model=model;
this.engine_name=engine_name;
}
 }

