interface Shape{
  abstract double getArea();
}

class Rectangle implements Shape{
  double length;
  double width;
  public Rectangle(double l, double w){
    this.length = l;
    this.width = w;
  }
  public double getArea(){
    return length*width;
  }

  public String toString(){
    return "Rectangle Area：" + Double.toString(getArea());
  }
}

class Triangle implements Shape{
  double base;
  double height;
  public Triangle(double b, double h){
    this.base = b;
    this.height = h;
  }
  public double getArea(){
    return base*height/2;
  }

  public String toString(){
    return "Triangle Area：" + Double.toString(getArea());
  } 
}

public class Main {
  public static void main(String[] args) {
    Rectangle rect = new Rectangle(10,5);
    System.out.println(rect.getArea());
    System.out.println(rect.toString());

    Triangle tri = new Triangle(10,8);
    System.out.println(tri.getArea());
    System.out.println(tri.toString());
  }
}
