public class empleado {
    String nombre;
    String puesto;
    int salario;

    public empleado(String nombre, String puesto, int salario){
        this.nombre=nombre;
        this.puesto=puesto;
        this.salario=salario;
    }

    public void trabajar(){
        System.out.println("El empleada/o " + nombre + " se encuentra trabajando en su puesto de " + puesto);
    }
}
