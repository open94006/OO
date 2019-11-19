abstract class CShape {
  protected String color;

  public void setColor(String str) {
    color = str;
  }

  public abstract void show();
}

class CTriangle extends CShape {
  protected double a, b, c;

  public CTriangle(double h, double w, double y) {
    a = h;
    b = w;
    c = y;
  }

  public void show() {
    System.out.print("Color:" + color + ", ");
    System.out.print("area:" + 0.5 * a * b);
  }
}

public class Main {
  public static void main(String[] args) {
    CTriangle tri = new CTriangle(3, 4, 5);
    tri.setColor("Red");
    tri.show();
  }
}
