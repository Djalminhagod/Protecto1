package pruebaoperandos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class pruebaoperandos {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Ingrese el Primer numero: ");
        int numero = Teclado.nextInt();
        System.out.println("Ingrese el Segundo numero: ");
        int numero2 = Teclado.nextInt();
        System.out.println("Ingrese Operacion: ");
        String operacion = Teclado.next();
        if (operacion.equals("+")) {
            int resultado = numero + numero2;
            System.out.println("el resultado es: "+ resultado);
        }
        else if (operacion.equals("-")) {
            int resultado = numero - numero2;
            System.out.println("el resultado es: " + resultado);
        }
        else if (operacion.equals("*")) {
            int resultado = numero * numero2;
            System.out.println("el resultado es: " + resultado);
        }
        else if (operacion.equals("/")) {
            int resultado = numero / numero2;
            System.out.println("el resultado es: " + resultado);
        }
    }

}