import java.util.Scanner;

public class positnegatparimpar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int valor = 0;
    System.out.println("Introduzca un numero: ");
    valor = sc.nextInt();

    while (valor != 0) {

      if (valor > 0) {
        System.out.println("Tu numero es positivo!");
      } else  {
        System.out.println("Tu numero es negativo!");
      }

      if (valor % 2 == 0) {
        System.out.println("Tu numero es par!");
      } else {
        System.out.println("Tu numero es impar!");
      }

      System.out.println("Introduzca un numero a evaluar (0 para salir): ");
      valor = sc.nextInt();
    }
    sc.close();

  }

}
