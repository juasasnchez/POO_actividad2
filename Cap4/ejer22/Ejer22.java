package ejer22;
import java.util.Scanner;

public class Ejer22 {

    public static void main(String[] args) {
        String nombre;
        int horas_trabajadas;
        double salario_hora;
        Scanner e= new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado:");
        nombre=e.next();
        System.out.println("Ingrese el salario básico por hora del empleado:");
        salario_hora=e.nextDouble();
        System.out.println("Ingrese el número de horas trabajadas en el mes:");
        horas_trabajadas=e.nextInt();
        Empleado empleado=new Empleado(nombre,horas_trabajadas,salario_hora);
        empleado.CalcularSalarioMensual();
        if (empleado.salario_mensual>450000){
            System.out.println("Nombre del empleado:"+empleado.nombre);
            System.out.println("Salario mensual:"+empleado.salario_mensual);
        }
        else{
            System.out.println("Nombre del empleado:"+empleado.nombre);
        }
            
    }
    
}
