package ejercicio7;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        System.out.println("aplicacion iniciada");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nota del 0-10: ");
        double nota = sc.nextDouble();
        if (nota<=4) {
            System.out.println("Suspenso ");
        }else if (nota==5) {
            System.out.println("Aprovado ");
        }else if (nota==6) {
            System.out.println("Bien ");
        }else if (nota>=7 && nota<9) {
            System.out.println("Notable ");
        }else if (nota>=9 && nota<=10) {
            System.out.println("Sobresaliente  ");
        }
    }
}
