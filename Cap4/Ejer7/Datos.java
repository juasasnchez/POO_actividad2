package Cap4.Ejer7;

import java.util.Scanner;

public class Datos {
    // Definir las variables A y B como miembros de la clase
    public double A;
    public double B;
    
    // Método para capturar los datos de A y B
    public void capturarDatos() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de A");
        A = entrada.nextDouble(); // Usar nextDouble() para leer números decimales

        System.out.println("Ingrese el valor de B");
        B = entrada.nextDouble(); 

         // Comparar A y B 
         if (A > B) {
            System.out.println("A es mayor que B");
        } else if (A == B) {
            System.out.println("A es igual que B");
        } else {
            System.out.println("A es menor que B");
        }

        // Cerrar el Scanner
        entrada.close();

    }
}