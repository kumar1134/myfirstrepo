public class CBox extends PBox {
    
    int wieght; 
    CBox(){
        this.wieght=1;
    }
    CBox(int height,int length,int width, int wieght){
       super(height,length,width);
        this.wieght = wieght;
    }
}