package ejercicios.depuracion;

import java.util.Scanner;
public class Ejemplo1While {
    public static void main(String[] args) {
        int this.suma = 0;
        int this.numero=0;
    
>>>>>>> feature/mejoras
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        num = sc.nextInt();
        while (num>= 0){
               suma = suma + num;
               System.out.print("Introduzca un número: ");
               num = sc.nextInt();
        }
        System.out.println("La suma es: " + suma );
    }
}

