public  class sta2{
    //main function is static because it runs withput creating obj
    public static void main(String[] args) {
        //static variable access by without creating objectrs because its onject indenpentexd
        hu h1 = new hu("a", 020);
        //here the static variable increment the pop by one and this is same for all objects present now
        hu h2 =new hu("b", 20);
        //now pop becomes 2 and and it is same for all objects value 
        //static variable belongs to only class not object
        
       
        sta2 obj = new sta2();
        obj.greet();//call non-static method using object
    }
    //when ever we create a non static method we cannot acess its data in static method without ceating objects 
    void greet(){
        //when ever we crate object and intialise the methos with object then we can accesss it

        System.out.println("well come!");
    }
}

