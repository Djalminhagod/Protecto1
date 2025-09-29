package ejercicio4;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Aplicacion Iniciada");
        System.out.println("Introduce numero entero");
        Scanner sc = new Scanner(System.in);
        int numero   = sc.nextInt();
        if (numero%2==0) {
            System.out.println("numero par");
        }else  {
            System.out.println("numero impar");
        }
    }
}
