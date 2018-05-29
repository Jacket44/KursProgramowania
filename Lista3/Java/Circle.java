public class Circle extends Figure {
  int r;
  
  public Circle(int radius){
    r = radius;
  }

  public double perimeter(){
    return (2 * Math.PI * r);
  }

  public double field(){
    return (Math.PI * Math.pow(r,2));
  }
}
