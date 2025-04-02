public class Estudiante {
    String nombre;
    String edad;
    int grado;

    public Estudiante (String nombre, String edad, int grado) {
        this.nombre=nombre;
        this.edad=edad;
        this.grado=grado;
    }

    public void estudiar(){
        System.out.println("El estudiante está estudiando");
    }
}
