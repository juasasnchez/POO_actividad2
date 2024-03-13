package Cap3.Ejer21;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args)  {
        double ladoa, ladob, ladoc;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el lado a del triángulo ");
        ladoa = entrada.nextDouble();

        System.out.println("Ingrese el lado b del triángulo ");
        ladob = entrada.nextDouble();

        System.out.println("Ingrese el lado c del triángulo ");
        ladoc = entrada.nextDouble();

        Triangulo triangulo = new Triangulo(ladoa,ladob,ladoc);

        System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());
        System.out.println("Semiperimetro del triángulo: " + triangulo.calcularSemiperimetro());
        System.out.println("Área del triángulo: " + triangulo.calcularArea());

        entrada.close(); // Cerrar el Scanner al finalizar
    }

}
