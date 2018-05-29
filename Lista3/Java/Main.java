import java.util.InputMismatchException;
public class Main {
  public static void main(String[] args) {

      char[] cArray = args[0].toCharArray();
      int argsCount = 1, arrayCount = 0;
      String chars;


      Circle[] circles = new Circle[cArray.length];
      Square[] squares = new Square[cArray.length];
      Rectangle[] rectangles = new Rectangle[cArray.length];
      Lozenge[] lozenges = new Lozenge[cArray.length];
      Pentagon[] pentagons = new Pentagon[cArray.length];
      Hexagon[] hexagons = new Hexagon[cArray.length];

      for(int i = 0; args[0].length() > i; i++){
        chars = Character.toString(cArray[i]);
        try{
        switch (chars) {
            case "c":
              circles[arrayCount] = new Circle(Integer.parseInt(args[argsCount]));
              System.out.println("Perimeter of circle: " + circles[arrayCount].perimeter());
              System.out.println("Perimeter of circle: " + circles[arrayCount].field());
              argsCount++;
              arrayCount++;
              break;
            case "q":
              if(args[argsCount + 4].equals("90")){
                if(args[argsCount].equals(args[argsCount + 1])){
                  squares[arrayCount] = new Square(Integer.parseInt(args[argsCount]));
                  System.out.println("Perimeter of square: " + squares[arrayCount].perimeter());
                  System.out.println("Perimeter of square: " + squares[arrayCount].field());
                  argsCount = argsCount + 5;
                  arrayCount++;
                  break;
                }
                else{
                  rectangles[arrayCount] = new Rectangle(Integer.parseInt(args[argsCount]), Integer.parseInt(args[argsCount + 1]));
                  System.out.println("Perimeter of rectangle: " + rectangles[arrayCount].perimeter());
                  System.out.println("Perimeter of rectangle: " + rectangles[arrayCount].field());
                  argsCount = argsCount + 5;
                  arrayCount++;
                  break;
                }
              }
              else{
                lozenges[arrayCount] = new Lozenge(Integer.parseInt(args[argsCount]),Integer.parseInt(args[argsCount + 4]));
                System.out.println("Perimeter of lozenge: " + lozenges[arrayCount].perimeter());
                System.out.println("Perimeter of lozenge: " + lozenges[arrayCount].field());
                  argsCount = argsCount + 5;
                  arrayCount++;
                  break;
              }
            case "p":
              pentagons[arrayCount] = new Pentagon(Integer.parseInt(args[argsCount]));
              System.out.println("Perimeter of pentagon: " + pentagons[arrayCount].perimeter());
              System.out.println("Perimeter of pentagon: " + pentagons[arrayCount].field());
              argsCount++;
              arrayCount++;
              break;
            case "h":
              hexagons[arrayCount] = new Hexagon(Integer.parseInt(args[argsCount]));
              System.out.println("Perimeter of hexagon: " + hexagons[arrayCount].perimeter());
              System.out.println("Perimeter of hexagon: " + hexagons[arrayCount].field());
              argsCount++;
              arrayCount++;
              break;
        }
      }
    catch(InputMismatchException e){
    System.err.println("Znak nie jest liczba");

    }
      }

    }
}
