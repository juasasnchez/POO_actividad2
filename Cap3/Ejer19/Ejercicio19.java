package Cap3.Ejer19;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args)  {
        double lado;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el lado del triángulo equilátero");
        lado = entrada.nextDouble();

        TrianguloEquilatero triangulo = new TrianguloEquilatero(lado);

        System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());
        System.out.println("Altura del triángulo: " + triangulo.calcularAltura());
        System.out.println("Área del triángulo: " + triangulo.calcularArea());

        entrada.close(); // Cerrar el Scanner al finalizar
    }   
}
