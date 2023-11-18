package modelo;
import java.util.ArrayList;
import java.util.List;

public class Especialidad {
    private int id_especialidad;
    private String nombre;
    private String descripcion;
    private List<Detalle_servicio> detallesServicio; // Lista de detalles de servicio que la especialidad puede atender
    private List<Tecnico> tecnicos; // Lista de técnicos que tienen esta especialidad

    // Constructor vacío
    public Especialidad() {
        tecnicos = new ArrayList<>();
    }

    // Constructor con todos los atributos
    public Especialidad(int id_especialidad, String nombre, String descripcion, List<Detalle_servicio> detallesServicio) {
        this.id_especialidad = id_especialidad;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.detallesServicio = detallesServicio;
        tecnicos = new ArrayList<>();
    }

    // Getters y Setters
    public int getId_especialidad() {
        return id_especialidad;
    }

    public void setId_especialidad(int id_especialidad) {
        this.id_especialidad = id_especialidad;
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

    public List<Tecnico> getTecnicos() {
        return tecnicos;
    }

    public void setTecnicos(List<Tecnico> tecnicos) {
        this.tecnicos = tecnicos;
    }

    // Método que agrega un técnico a la lista de técnicos asociados a esta especialidad
    public void agregarTecnico(Tecnico tecnico) {
        tecnicos.add(tecnico);
    }

    // Método que elimina un técnico de la lista de técnicos asociados a esta especialidad
    public void eliminarTecnico(Tecnico tecnico) {
        tecnicos.remove(tecnico);
    }
 // Método que devuelve todos los técnicos que están dentro de una lista de especialidades seleccionadas
    public static List<Tecnico> obtenerTecnicosPorEspecialidades(List<Especialidad> especialidadesSeleccionadas, List<Tecnico> listaDeTecnicos) {
        List<Tecnico> tecnicosPorEspecialidades = new ArrayList<>();

        for (Tecnico tecnico : listaDeTecnicos) {
            // Obtener las especialidades asociadas al técnico
            List<Especialidad> especialidadesDelTecnico = tecnico.getEspecialidades();

            // Verificar si el técnico tiene al menos una de las especialidades seleccionadas
            for (Especialidad especialidad : especialidadesSeleccionadas) {
                if (especialidadesDelTecnico.contains(especialidad)) {
                    tecnicosPorEspecialidades.add(tecnico);
                    break; // Salir del bucle si se encuentra una especialidad coincidente
                }
            }
        }

        return tecnicosPorEspecialidades;
    }    
    
}


