package ejer13;

import java.util.Scanner;

public class Ejer13 {

    public static void main(String[] args) {
        double descuento, valor_a_pagar;
        Scanner e= new Scanner(System.in);
        System.out.println("Ingrese el valor total de la compra:");
        Compra compra= new Compra(e.nextDouble());
        System.out.println("Ingrese el color de la bola");
        Bola bola= new Bola(e.next().toUpperCase());
        compra.CalcularDescuento(bola.color);
        compra.CalcularValorAPagar(compra.descuento);
        System.out.println("Descuento:"+compra.descuento*100+"%");
        System.out.println("Valor total a pagar:"+compra.valor_a_pagar);
        
    } 
}
