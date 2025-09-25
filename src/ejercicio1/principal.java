package ejercicio1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
    Scanner Teclado = new Scanner(System.in);
    System.out.println("Ingrese el Primer numero: ");
    int numero = Teclado.nextInt();
    System.out.println("Ingrese el Segundo numero: ");
    int numero2 = Teclado.nextInt();
    int resulsuma = numero + numero2;
    System.out.println("El resultado es suma: " + resulsuma);
    int resulresta = numero - numero2;
    System.out.println("El resultado es resta: " + resulresta);
    int resulmulti = numero * numero2;
    System.out.println("El resultado es multi: " + resulmulti);
    double resuldiv = (double) numero / numero2;
    System.out.println("El resultado es div: " + resuldiv);
    }

}
