package ejercicio1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        String nombre="willy";
        System.out.println( "el cerdo se llama "+ nombre);
        System.out.println("inserta nombre" );
        Scanner teclado = new Scanner(System.in);
        nombre = teclado.nextLine();
        System.out.println("el cerdo se llama "+ nombre);


    }

}
