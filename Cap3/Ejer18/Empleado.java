package Cap3.Ejer18;

import java.util.Scanner;

public class Empleado {
    public int cod_empleado;
    public String nombres;
    public double horas_trab;
    public double valor_hora;
    public double porcent_retenc;
    public double sbruto, snet;

    Scanner entrada = new Scanner(System.in);

    public void capturarDatos() {
        System.out.println("Ingrese el código del empleado");
        cod_empleado = entrada.nextInt();

        System.out.println("Ingrese el nombre del empleado");
        nombres = entrada.next();

        System.out.println("Ingrese las horas trabajadas del empleado");
        horas_trab = entrada.nextDouble();

        System.out.println("Ingrese el valor de la hora de trabajo del empleado");
        valor_hora = entrada.nextDouble();

        System.out.println("Ingrese el porcentaje de retención");
        porcent_retenc = entrada.nextDouble();
    }

    public void SalarBrut() {
        sbruto = horas_trab * valor_hora;
        System.out.println("El salario bruto del empleado " + nombres + " es " + sbruto);
    }

    public void SalarNet() {
        SalarBrut(); // Llama al método SalarBrut() para calcular sbruto
        double retencion_valor = (sbruto * porcent_retenc) / 100;
        snet = sbruto - retencion_valor;
        System.out.println("El salario neto del empleado " + nombres + " es " + snet);
    }
}


    





