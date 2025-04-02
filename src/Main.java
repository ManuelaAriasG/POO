//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
empleado miempleado= new empleado("Clara", "Gerente",10000000);
        miempleado.trabajar();

        cuentaBancaria micuenta= new cuentaBancaria(256984, 800000, "Manuela");
        micuenta.depositar();
        micuenta.retirar();

        Estudiante miEstudiante=new Estudiante("Pedro",18,5);
        miEstudiante.estudiar();

        Libro milibro=new Libro("Matrix","Leonardo",250);
        milibro.leerPagina();

    }
}
