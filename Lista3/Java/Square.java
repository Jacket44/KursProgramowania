public class Square extends Quadrangle {
  public Square(int newSide){
    side1 = newSide;
  }

  public double perimeter(){
    return side1 * 4;
  }

  public double field(){
    return Math.pow(side1, 2);
  }
}
