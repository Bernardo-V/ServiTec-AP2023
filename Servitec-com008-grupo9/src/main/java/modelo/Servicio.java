package modelo;

import java.util.List;

public class Servicio {
    private int id_servicio;
    private String nombre;
    private String descripcion;
    private List<Detalle_servicio> detallesServicio; // Lista de detalles de servicio

    // Constructor vacío
    public Servicio() {
    }

    // Constructor con todos los atributos
    public Servicio(int id_servicio, String nombre, String descripcion, List<Detalle_servicio> detallesServicio) {
        this.id_servicio = id_servicio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.detallesServicio = detallesServicio;
    }

    // Getters y Setters
    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
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

    public List<Detalle_servicio> getDetallesServicio() {
        return detallesServicio;
    }

    public void setDetallesServicio(List<Detalle_servicio> detallesServicio) {
        this.detallesServicio = detallesServicio;
    }
// Método que recibe un objeto Servicio y devuelve su lista de Detalle_servicio
    public List<Detalle_servicio> obtenerDetallesServicio(Servicio servicio) {
        if (servicio != null) {
            return servicio.getDetallesServicio();
        } else {
            return null; // O manejar la situación de un servicio nulo según sea necesario
        }
    }
    // Método para seleccionar un detalle de servicio específico por ID
    public Detalle_servicio seleccionarDetalleServicioPorId(int idDetalleServicio) {
        for (Detalle_servicio detalle : detallesServicio) {
            if (detalle.getId_detalle_servicio() == idDetalleServicio) {
                return detalle;
            }
        }
        return null; // o podrías lanzar una excepción si prefieres que se maneje la ausencia de un detalle como un error.
    }
    // Otros métodos como toString, equals, hashCode...
}
