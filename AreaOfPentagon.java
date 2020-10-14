import java.util.Scanner;

public class AreaOfPentagon {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the length from the center to a vertex: ");
    double r = input.nextDouble();

    double lengthOfside = 2 * r * Math.sin(Math.PI / 5);
    double area = (5 * Math.pow(lengthOfside, 2)) / (4 * Math.tan(Math.PI / 5)) ;
    area = Math.floor(area * 100) / 100;

    System.out.println("The area of pentagon is " + area);

  }
}
