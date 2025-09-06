public class inheritance {
    public static void main(String[] args) {
        box b1 =new box(2, 03, 04);
        box2 b2 = new box2(2, 3, 4);
        System.out.println(b1.l);//when  we make private we camnnot acess it outside the class
    }
}
class box{
    int l;
    int h;
    int w;
    box(int l,int h,int w){
        this.l=l;
        this.h=h;
        this.w=w;
    }
}
//class box2 extends box {
class box2 extends box {
    int vol;
    box2(int l, int h, int w) {
        super(l, h, w);//this is calling constructor of parent class
        this.vol = vol;
    }
}
