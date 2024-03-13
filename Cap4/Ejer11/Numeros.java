package Cap4.Ejer11;

import java.util.Scanner;


public class Numeros {
    // Definir las variables A, B y C como miembros de la clase
    public int A;
    public int B;
    public int C;
    
    // Método para capturar los datos de A, B y C
    public void capturarDatos() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el valor de A:");
        A = entrada.nextInt(); 

        System.out.println("Ingrese el valor de B:");
        B = entrada.nextInt(); 

        System.out.println("Ingrese el valor de C:");
        C = entrada.nextInt(); 

        // Cerrar el Scanner
        entrada.close();

        
    }

    // Método para comparar los números A, B y C
    public void compararNumeros() {
        if (A > B && A > C)  {
            System.out.println("A es el mayor");
        } 
        else if (B > A && B > C) {
            System.out.println("B es el mayor");
        } 
        else {
            System.out.println("C es el mayor");
        }
    }
}
