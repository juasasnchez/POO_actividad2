
package ejer15;
import java.util.Scanner;

public class Ejer15 {

    public static void main(String[] args) {
        Scanner e= new Scanner(System.in);
        System.out.println("Ingrese el peso de la esfera A");
        Esfera esferaA= new Esfera(e.nextDouble());
        System.out.println("Ingrese el peso de la esfera B");
        Esfera esferaB= new Esfera(e.nextDouble());
        System.out.println("Ingrese el peso de la esfera C");
        Esfera esferaC= new Esfera(e.nextDouble());
        System.out.println("Ingrese el peso de la esfera D");
        Esfera esferaD= new Esfera(e.nextDouble());
        if (esferaA.peso==esferaB.peso && esferaA.peso==esferaC.peso){
            System.out.println("La esfera D es la esfera diferente");
            if (esferaA.peso<esferaD.peso){
                System.out.println("La esfera D tiene mayor peso que las demás");
            }
            else{
                System.out.println("La esfera D tiene menor peso que las demás");
            }
        }
        else if (esferaA.peso==esferaB.peso && esferaA.peso==esferaD.peso){
            System.out.println("La esfera C es la esfera diferente");
            if (esferaA.peso<esferaC.peso){
                System.out.println("La esfera C tiene mayor peso que las demás");
            }
            else{
                System.out.println("La esfera C tiene menor peso que las demás");
            }
        }
        else if (esferaA.peso==esferaC.peso && esferaA.peso==esferaD.peso){
            System.out.println("La esfera B es la esfera diferente");
            if (esferaA.peso<esferaB.peso){
                System.out.println("La esfera B tiene mayor peso que las demás");
            }
            else{
                System.out.println("La esfera B tiene menor peso que las demás");
            }
        }
        else{
            System.out.println("La esfera A es la esfera diferente");
            if (esferaB.peso<esferaA.peso){
                System.out.println("La esfera A tiene mayor peso que las demás");
            }
            else{
                System.out.println("La esfera A tiene menor peso que las demás");
            }
            
        }
            
    }
    
}
