public class Libro {
    String titulo;
    String autor;
    int paginas;

    public Libro (String titulo, String autor, int paginas) {
        this.titulo=titulo;
        this.autor=autor;
        this.paginas=paginas;
    }

    public void leerPagina() {
        System.out.println("Se está leyendo un libro de " +paginas + " páginas");
    }

}
