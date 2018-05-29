public class Pentagon extends Figure {
  int side;

  public Pentagon(int newSide){
    side = newSide;
  }

  public double perimeter(){
    return side * 5;
  }

  public double field(){
    double inner1 = 2 * Math.sqrt(5);
    double inner2 = 5 + inner1;
    double sqrt = Math.sqrt(5 * inner2);
    return (1.0/4.0) * sqrt * Math.pow(side, 2);
  }
}
