public class empleado {
    String nombre;
    String puesto;
    double salario;

    public empleado(String nombre, String puesto, double salario){
        this.nombre=nombre;
        this.puesto=puesto;
        this.salario=salario;
    }

    public void trabajar(){
        System.out.println("El empleado se encuentra trabajando en su" + puesto);
    }
}
