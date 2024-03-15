package ejer23;
import java.util.Scanner;

public class Ejer23 {

    public static void main(String[] args) {
        double A,B,C;
        Scanner e= new Scanner(System.in);
        System.out.println("Ingrese el valor de A de la ecuación");
        A=e.nextDouble();
        System.out.println("Ingrese el valor de B de la ecuación");
        B=e.nextDouble();
        System.out.println("Ingrese el valor de C de la ecuación");
        C=e.nextDouble();
        Ecuacion ecuacion=new Ecuacion(A,B,C);
        ecuacion.CalcularSolucion();
    }
    
}
