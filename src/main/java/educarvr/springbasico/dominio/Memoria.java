package educarvr.springbasico.dominio;

public class Memoria extends Producto{
    double capacidad;

    public Memoria(double capacidad) {
        this.capacidad = capacidad;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }
}
