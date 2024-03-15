package ejer24;
import java.util.Scanner;

public class Ejer24 {

    public static void main(String[] args) {
        Scanner e= new Scanner(System.in);
        System.out.println("Ingrese el peso de la esfera A:");
        Esfera esferaA=new Esfera(e.nextDouble());
        System.out.println("Ingrese el peso de la esfera B:");
        Esfera esferaB=new Esfera(e.nextDouble());
        System.out.println("Ingrese el peso de la esfera C:");
        Esfera esferaC=new Esfera(e.nextDouble());
        if (esferaA.peso==esferaB.peso && esferaA.peso==esferaC.peso){
            System.out.println("Todas las esferas pesan lo mismo");
        }
        else if (esferaA.peso>esferaB.peso && esferaA.peso>esferaC.peso){
            System.out.println("La esfera A es la más pesada");
        }
        else if (esferaB.peso>esferaA.peso && esferaB.peso>esferaC.peso){
            System.out.println("La esfera B es la más pesada");
        }
        else{
            System.out.println("La esfera C es la más pesada");
        }

    }
    
}
