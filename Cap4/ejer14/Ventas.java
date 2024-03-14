package ejer14;

public class Ventas {
    double ventas_dept1,ventas_dept2,ventas_dept3,ventas_totales;
    
    Ventas(double ventas_dept1, double ventas_dept2, double ventas_dept3){
        this.ventas_dept1=ventas_dept1;
        this.ventas_dept2=ventas_dept2;
        this.ventas_dept3=ventas_dept3;
        this.ventas_totales=ventas_dept1+ventas_dept2+ventas_dept3;
    }
    
}
