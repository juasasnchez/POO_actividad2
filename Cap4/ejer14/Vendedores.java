package ejer14;
public class Vendedores {
    double salario_base,salario_1,salario_2,salario_3;
    
    Vendedores(double salario_base){
        this.salario_base=salario_base;
        this.salario_1=salario_base;
        this.salario_2=salario_base;
        this.salario_3=salario_base;
    }
    
    public void AsignarSalarios(double salario1, double salario2, double salario3){
        salario_1=salario1;
        salario_2=salario2;
        salario_3=salario3;
    }

}
