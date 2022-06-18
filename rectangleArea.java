
import java.util.Scanner;

public class rectangleArea {
  public static void main(String[] args) {
 	System.out.println("Type in the system the sides of the rectangle system will print the area: ");
		Scanner leitor = new Scanner(System.in);
		long N = leitor.nextLong();
		long L = leitor.nextLong();
		long P = N * L;
		System.out.println("The area is: ");
    System.out.println(P);
  }
}
