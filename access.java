public class access {
 public static void main(String[] args) {
    mod m =new mod(12, "k");
    System.out.println(m instanceof Object);
   // System.out.println(m.num);//here we can't access it because its private
   //use getters and setters to acess 
  System.out.println(m.getters());
   m.setters();
 }   
}
class mod{
   private int num ;
    String name;
    public int getters()//we can use any name its conventioanly use understand whats happening here
    {
        return num;
    }
    public int setters(){
        return num;
    }

    
    mod(int num,String name){
        this.num=num;
        this.name=name;
    }
}