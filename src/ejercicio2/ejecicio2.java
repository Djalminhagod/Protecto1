package ejercicio2;

import java.util.Scanner;

public class ejecicio2 {
    public static void main(String[] args) {
        System.out.println("Bienvenido a calculadora");
        Scanner teclado = new Scanner(System.in);
        int base;
        System.out.println("Ingrese el numero base(entero): ");
        base = teclado.nextInt();
        int altura;
        System.out.println("Ingrese el numero altura(entero)4: ");
        altura = teclado.nextInt();
        double area = (double) (base * altura) / 2;
        System.out.println("El area del triangulo es: " + area);
        double perimetro = (double) 2 *(base * altura);
        System.out.println("El perimetro es: " + perimetro);
    }
}
