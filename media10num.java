import java.util.Scanner;

public class media10num {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca diez numeros para calcular su media: ");
    int[] numeros = new int[10];
    double media = 0;

    for (int i = 0; i < 10; i++) {
      numeros[i] = sc.nextInt();
    }

    for (int i = 0; i < 10; i++) {
      media = media + numeros[i];
    }

    media = media / 10;
    System.out.println("La media de los numeros introducidos es: " + media);
    sc.close();
  }

}
