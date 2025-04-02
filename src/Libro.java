public class Libro {
    String titulo;
    String autor;
    String paginas;

    public Libro (String titulo, String autor, String paginas) {
        this.titulo=titulo;
        this.autor=autor;
        this.paginas=paginas;
    }

    public void leerPagina() {
        System.out.println("Se está leyendo una página del libro");
    }

}
