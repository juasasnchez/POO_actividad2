package Cap4.Ejer10;

import java.util.Scanner;

public class Estudiante {
    int Numero_de_inscripcion; 
    String Nombre;
    double Patrimonio;
    int Estrato_social;
    double costo_matricula;

    public void datos_estudiante() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el número de inscripción:");
        Numero_de_inscripcion = entrada.nextInt(); 

        System.out.println("Ingrese el nombre:");
        Nombre = entrada.next(); 

        System.out.println("Ingrese el patrimonio:");
        Patrimonio = entrada.nextDouble(); 

        System.out.println("Ingrese el estrato social:");
        Estrato_social = entrada.nextInt();
        
        
        entrada.close();
    }
    
    public void calculo_matricula(){
        costo_matricula = 50000;
        
        if (Patrimonio > 2000000 && Estrato_social > 3) { 
            costo_matricula += 0.03 * Patrimonio;; 
        }
        System.out.println("Número de inscripción: " + Numero_de_inscripcion + ", Nombre: " + Nombre + ", Pago de matrícula: $" + costo_matricula);
    }
}
