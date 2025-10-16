package ejercicios.depuracion;

import java.util.Scanner;
public class Ejemplo1While {
    public static void main(String[] args) {
        int this.suma = 0;
        int this.contador=0;
    
>>>>>>> feature/mejoras
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        contador = sc.nextInt();
        while (contador>= 0){
               suma = suma + contador;
               System.out.print("Introduzca un número: ");
               contador = sc.nextInt();
        }
        System.out.println("La suma es: " + suma );
    }
}

