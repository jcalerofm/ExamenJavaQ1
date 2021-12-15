import java.util.Scanner;

public class grados {
  public static void main(String[] args) {
    double cent = 0, fah = 0;
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca temperatura (en grados centígrados): ");
    cent = sc.nextDouble();
    fah = 32 + (9 * (cent / 5));
    System.out.println("Su temperatura en Grados Fahrenheit es: " + fah);
    sc.close();

  }

}
