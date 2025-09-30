package ejercicio7;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        System.out.println("aplicacion iniciada");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nota del 0-10: ");
        double nota = sc.nextDouble();
        if (!(nota>=0 && nota<=10)) {
            System.out.println("La nota debe ser entre 0 e 10 ");
        }else  {
            if(nota<=4){
                System.out.println("suspenso");
            } else if (nota>=4 && nota<6) {
                System.out.println("aprobado");
            }else if (nota<7) {
                System.out.println("bien");
            }else if (nota<9) {
                System.out.println("notable");
            }else if (nota<=10) {
                System.out.println("Sobresaliente");
            }
        }
    }
}
