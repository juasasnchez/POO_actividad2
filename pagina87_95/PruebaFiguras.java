package pagina87_95;

// se importa Scanner para poder usar la entradad por teclado 
import java.util.Scanner;

public class PruebaFiguras {
    public static void main(String args[]) {
        // definimos un objeto de la clase Scanner
        Scanner entrada = new Scanner(System.in);
        int radio, lado, base_rectangulo, altura_rectangulo,base_triang_rectangulo, altura_triang_rectangulo;

        
        System.out.println("Ingrese el valor del radio del circulo");
        radio = entrada.nextInt();
        Círculo figura1 = new Círculo(radio);

        System.out.println("Ingrese el valor del lado del cuadrado ");
        lado  = entrada.nextInt();
        Cuadrado figura3 = new Cuadrado(lado);

        System.out.println("Ingrese el valor de la base del rectangulo ");
        base_rectangulo  = entrada.nextInt();

        System.out.println("Ingrese el valor de la altura del rectangulo ");
        altura_rectangulo  = entrada.nextInt();
        Rectángulo figura2 = new Rectángulo(base_rectangulo,altura_rectangulo);
        
        System.out.println("Ingrese el valor de la base del triangulo rectangulo ");
        base_triang_rectangulo  = entrada.nextInt();
        System.out.println("Ingrese el valor de la altura del triangulo rectangulo ");
        altura_triang_rectangulo  = entrada.nextInt();
        TriánguloRectángulo figura4 = new TriánguloRectángulo(base_triang_rectangulo,altura_triang_rectangulo);
        
        System.out.println("El área del círculo es = " + figura1.calcularArea());
        System.out.println("El perímetro del círculo es = " + figura1.calcularPerímetro());
        System.out.println();
        
        System.out.println("El área del rectángulo es = " + figura2.calcularArea());
        System.out.println("El perímetro del rectángulo es = " + figura2.calcularPerímetro());
        System.out.println();
        
        System.out.println("El área del cuadrado es = " + figura3.calcularArea());
        System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerímetro());
        System.out.println();
        
        System.out.println("El área del triángulo es = " + figura4.calcularArea());
        System.out.println("El perímetro del triángulo es = " + figura4.calcularPerímetro());
        figura4.determinarTipoTriángulo();
    }
}
