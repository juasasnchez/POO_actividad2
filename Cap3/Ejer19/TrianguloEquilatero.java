package Cap3.Ejer19;

public class TrianguloEquilatero{
    public double lado;
    

    public TrianguloEquilatero(double lado) {
        this.lado = lado;
    }

    public double calcularPerimetro() {
        return 3 * lado; // Para un triángulo equilátero, el perímetro es simplemente 3 veces el valor de un lado
    }

    public double calcularAltura() {
        return Math.sqrt(3) / 2 * lado; // Para un triángulo equilátero, la altura es (√3 / 2) * lado
    }

    public double calcularArea() {
        return (Math.sqrt(3) / 4) *Math.pow(lado, 2); // Para un triángulo equilátero, el área es (√3 / 4) * lado^2
    }
}