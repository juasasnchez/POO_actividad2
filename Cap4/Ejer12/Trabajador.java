package Cap4.Ejer12;

import java.util.Scanner;


public class Trabajador {
    String Nombre;
    int horas_trabajadas, horas_doble, horas_triple;
    double valor_hora, pago;

    public void capturarDatos() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el nombre del trabajador:");
        Nombre = entrada.next(); 

        System.out.println("Ingrese el número de horas trabajadas:");
        horas_trabajadas = entrada.nextInt(); 

        System.out.println("Ingrese el valor de la hora de trabajo: ");
        valor_hora = entrada.nextDouble(); 
        // Cerrar el Scanner
        entrada.close();
    }
    
    
    public void dinero_recibido() {
        if (horas_trabajadas > 40 ){
           horas_doble = horas_trabajadas-40;

            if ( horas_doble > 8){
                horas_triple = horas_doble-8;
                horas_doble = 8;
                pago = horas_doble*2*valor_hora +horas_triple*3*valor_hora + 40*valor_hora;
            }
            else{
                pago = horas_doble*2*valor_hora + 40*valor_hora ;

                }
            
            }
    

        else {

            pago = horas_trabajadas*valor_hora;
        }
        System.out.println("el pago del trabajador "+ Nombre+ " es "+ pago);

    }

    


}
