public class Hexagon extends Figure {
  int side;

  public Hexagon(int newSide){
    side = newSide;
  }

  public double perimeter(){
    return side * 6;
  }

  public double field(){
    double inner1 = 2 * Math.sqrt(5);
    double inner2 = 5 + inner1;
    double sqrt = Math.sqrt(5 * inner2);
    return (3 * Math.sqrt(3) * Math.pow(side, 2)/2);
  }
}
