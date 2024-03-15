package ejer23;

public class Ecuacion {
    double A,B,C;
    
    Ecuacion(double A, double B, double C){
        this.A=A;
        this.B=B;
        this.C=C;
    }
    
    public void CalcularSolucion(){
        double x1,x2,den;
        den=2*A;
        x1=(-B+Math.sqrt(Math.pow(B, 2)-4*A*C))/den;
        x2=(-B-Math.sqrt(Math.pow(B, 2)-4*A*C))/den;
        if (Double.isNaN(x1)){
            System.out.println("La solución tiene números complejos");
        }
        else{
            if (x1==x2){
                System.out.println("La solución de la ecuación es x="+x1);
            }
            else{
                System.out.println("La primera solución de la ecuación es x1="+x1);
                System.out.println("La segunda solución de la ecuación es x2="+x2);
            }
            
        }
        
    }
    
    
}
