package tarea;

public class Tarea {
    private String nombre;
    private String estado;

    public Tarea(String nombre) {
        this.nombre = nombre;
        this.estado = "pendiente";
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return nombre + ", " + estado;
    }
}