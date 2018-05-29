public class Lozenge extends Quadrangle {
  public Lozenge(int side, int angle1){
    side1 = side;
    angle = angle1;
  }

  public double perimeter(){
    return side1 * 4;
  }

  public double field(){
    return Math.pow(side1, 2) * Math.sin(angle);
  }
}
