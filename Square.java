
public class Square extends GeometricObject implements Colorable {
  private double side;
  
  public Square() {
    side = 0.0;
  }
  
  public Square(double side) {
    this.side = side;
  }
  
  public void setSide(double side) {
    this.side = side;
  }
  
  public double getSide() {
    return side;
  }
  
  @Override
  public void howToColor() {
    System.out.println("Color all four sides.");
    
  }
  
}
