package ejer14;
import java.util.Scanner;

public class Ejer14 {

    public static void main(String[] args) {
        double v1,v2,v3,salario,salario_1,salario_2,salario_3;
        Scanner e= new Scanner(System.in);
        System.out.println("Ingrese las ventas del departamento 1");
        v1=e.nextDouble();
        System.out.println("Ingrese las ventas del departamento 2");
        v2=e.nextDouble();
        System.out.println("Ingrese las ventas del departamento 3");
        v3=e.nextDouble();
        Ventas venta=new Ventas(v1,v2,v3);
        System.out.println("Ingrese el salario de los vemdedores");
        salario=e.nextDouble();
        Vendedores vendedor= new Vendedores(salario);
        if (venta.ventas_dept1>venta.ventas_totales*0.33){
            salario_1=salario+salario*0.2;
        }
        else{
            salario_1=salario;
        }
        if (venta.ventas_dept2>venta.ventas_totales*0.33){
            salario_2=salario+salario*0.2;
        }
        else{
            salario_2=salario;
        }
        if (venta.ventas_dept3>venta.ventas_totales*0.33){
            salario_3=salario+salario*0.2;
        }
        else{
            salario_3=salario;
        }
        vendedor.AsignarSalarios(salario_1, salario_2, salario_3);
        System.out.println("Las ventas totales fueron de:"+venta.ventas_totales);
        System.out.println("El 33% de las ventas totales es:"+venta.ventas_totales*0.33);
        System.out.println("Las ventas del departamento 1 fueron de:"+venta.ventas_dept1);
        System.out.println("Las ventas del departamento 2 fueron de:"+venta.ventas_dept2);
        System.out.println("Las ventas del departamento 3 fueron de:"+venta.ventas_dept3);
        System.out.println("El salario base de los vendedores es de:"+vendedor.salario_base);
        System.out.println("El salario para los vendedores del departamento 1 será de:"+vendedor.salario_1);
        System.out.println("El salario para los vendedores del departamento 2 será de:"+vendedor.salario_2);
        System.out.println("El salario para los vendedores del departamento 3 será de:"+vendedor.salario_3);
    }
    
}
