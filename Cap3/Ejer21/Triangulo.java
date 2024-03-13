package Cap3.Ejer21;


public class Triangulo{
    public double ladoa, ladob, ladoc, s;
    

    public Triangulo(double ladoa, double ladob, double ladoc) {
        this.ladoa = ladoa;
        this.ladob = ladob;
        this.ladoc = ladoc;
        
    }

    public double calcularPerimetro() {
        return ladoa + ladob + ladoc; 
    }

    public double calcularSemiperimetro() {
        s = (ladoa + ladob + ladoc)/2;
        return s;
    }

    public double calcularArea() {
        return Math.sqrt(s*(s-ladoa)*(s-ladob)*(s-ladoc));
        
    }
}