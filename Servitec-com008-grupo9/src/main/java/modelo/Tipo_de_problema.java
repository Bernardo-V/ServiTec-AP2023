package modelo;

public class Tipo_de_problema {
    private int id_tipo_de_problema;
    private String nombre;
    private String descripcion;

    // Constructor vacío
    public Tipo_de_problema() {
    }

    // Constructor con todos los atributos
    public Tipo_de_problema(int id_tipo_de_problema, String nombre, String descripcion) {
        this.id_tipo_de_problema = id_tipo_de_problema;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public int getId_tipo_de_problema() {
        return id_tipo_de_problema;
    }

    public void setId_tipo_de_problema(int id_tipo_de_problema) {
        this.id_tipo_de_problema = id_tipo_de_problema;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
}
