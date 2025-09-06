abstract  class Shape{
  abstract   double area();

}

class Circle extends  Shape{
    double r;
    Circle(double r){
        this.r = r;
    }
    double area(){
        return Math.PI * r * r;
    }
}


interface  Drawable{
    void draw();
}

class Square implements Drawable{
    int side;

    Square(int side) {this.side=side; }

    public void draw(){
        System.out.println("drawing  Square of  side"+side); 
    }

    
}


public class AbstractionVsInterFace {
    public static void main(String[] args) {

        Shape c = new Circle(5);
        System.out.println("circle Area = "+c.area());
         
        Drawable s = new Square(4);
        s.draw();


        
    }
    
}
