package ejercicio5;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Aplicacion iniciada");
        System.out.println("Precio del producto");
        Scanner sc = new Scanner(System.in);
        double precio = sc.nextInt();
        if (precio>=100) {
            double precioresul = precio -precio*0.15; //el double y precioresul seria la declaracion de la variable
            System.out.println("El precio final es " + precioresul);
        }else {
            System.out.println("El precio final es " + precio);
        }
    }
}
