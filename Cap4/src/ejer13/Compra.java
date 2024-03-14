package ejer13;


public class Compra {
    double valor_total;
    
    public Compra(double valor_total){
        this.valor_total= valor_total;
    }
    
    public double CalcularDescuento(String color){
        double descuento;
        descuento=0;
        
        if (color.equals("BLANCA")){
            descuento=0;
        }
        else if (color.equals("VERDE")){
            descuento=0.1;
        }
        else if (color.equals("AMARILLA")){
            descuento=0.25;
        }
        else if (color.equals("AZUL")){
            descuento=0.5;
        }
        else if (color.equals("ROJA")){

            descuento=1;
        }    
        else{
            descuento=0;
        }
        return descuento;
    }
    
    public double CalcularValorAPagar(double descuento){
        double valor_a_pagar=0;
        valor_a_pagar=valor_total-valor_total*descuento;
        return valor_a_pagar;
    }
    
    
}
