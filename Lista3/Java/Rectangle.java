public class Rectangle extends Quadrangle {
  public Rectangle(int newSide1, int NewSide2){
    side1 = newSide1;
    side2 = NewSide2;
  }

  public double perimeter(){
    return side1 * 2 + side2 * 2;
  }

  public double field(){
    return side1 * side2;
  }
}
