package ejercicio6;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        System.out.println("aplicacion iniciada");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un nombre usuario");
        String nombreusuario = sc.nextLine();
        if (nombreusuario.equals("admin")) {
            System.out.println("el nombre del usuario admin");
        }else  {
            System.out.println("acceso denegado");
        }
    }
}
