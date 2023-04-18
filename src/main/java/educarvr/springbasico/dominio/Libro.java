package educarvr.springbasico.dominio;

public class Libro extends Producto{
    String titulo;
    public Libro(String titulo){
        this.titulo=titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
