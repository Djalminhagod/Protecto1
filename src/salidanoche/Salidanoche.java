package salidanoche;

import java.util.Scanner;

public class Salidanoche {
    public static void main(String[] args) {
        System.out.println("Vamos a tomar el aire. Bienvenido");
        double nivelalcol = 0.0;
        double preciochupito = 3.0;
        double preciocana = 1.8;
        double preciocombinado = 8.0;
        double nivelchupito = 0.25;
        double nivelcana = 0.1;
        double nivelcombinado = 0.4;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre cliente: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce edad cliente: ");
        int edad = sc.nextInt();
        System.out.println("Introduce cuanto dinero tienes: ");
        int dinero = sc.nextInt();
        System.out.println("El cliente de nombre " +nombre+ " con edad "+edad+" tiene "+dinero+" euros");

        if(edad<18){
            System.out.println("Acceso denegado enor de edad");
        }else if(nivelalcol>=1.2){
            System.out.println("Acceso denegado esceso de alcolemia");
        }else if(dinero>0){
            System.out.println("Introduce cuanto chupitos vas a beber:");
            int cantidadchupitos = sc.nextInt();
            double gastochupitos = dinero-preciochupito*cantidadchupitos;
            if(gastochupitos<=0){
                System.out.println("te quedaste sin dinero");
            }else if(gastochupitos>0){
                System.out.println("cuantas cañas quieres tomar");
                int cantidadcana = sc.nextInt();
                double gastocanas = gastochupitos-preciocana*cantidadcana;
                if(gastocanas<=0){
                    System.out.println("te quedaste sin dinero");
                }else if(gastocanas>0){
                    System.out.println("Introduce cuanto combinado vas a beber:");
                    int cantidadcombinado = sc.nextInt();
                    double gastoscombinados = gastocanas-preciocombinado*cantidadcombinado;
                    if(gastoscombinados<=0){
                        System.out.println("te quedaste sin dinero");
                    }else if(gastoscombinados>0){
                        System.out.println("me queda "+gastoscombinados);
                    }
                }
            }


        }
    }
}
