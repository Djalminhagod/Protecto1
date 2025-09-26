package ejercicio3;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Iniciando al detector de menores");
        Scanner Teclado = new Scanner(System.in);
        System.out.println("introduzca su edad");
        int edad = Teclado.nextInt();
        if (edad < 18) {
            System.out.println("El edad es menor");
        }else {
            System.out.println("El edad es mayor de edad");
        }
    }
}
