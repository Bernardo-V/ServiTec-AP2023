package modelo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Detalle_servicio {
    private int id_detalle_servicio;
    private int id_servicio;
    private int id_tipo_de_problema;
    private Duration duracion_estandar; // Duración estándar como un objeto Duration
    private List<Especialidad> especialidades; // Lista de especialidades asociadas a este detalle de servicio

    // Constructor
    public Detalle_servicio(int id_detalle_servicio, int id_servicio, int id_tipo_de_problema, Duration duracion_estandar, List<Especialidad> especialidades) {
        this.id_detalle_servicio = id_detalle_servicio;
        this.id_servicio = id_servicio;
        this.id_tipo_de_problema = id_tipo_de_problema;
        this.duracion_estandar = duracion_estandar;
        this.especialidades = especialidades;
    }

    // Getters y setters
    public void setId_detalle_servicio(int id_detalle_servicio) {
        this.id_detalle_servicio = id_detalle_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public void setId_tipo_de_problema(int id_tipo_de_problema) {
        this.id_tipo_de_problema = id_tipo_de_problema;
    }

    public int getId_detalle_servicio() {
        return id_detalle_servicio;
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public int getId_tipo_de_problema() {
        return id_tipo_de_problema;
    }

    public Duration getDuracion_estandar() {
        return duracion_estandar;
    }

    public void setDuracion_estandar(Duration duracion_estandar) {
        this.duracion_estandar = duracion_estandar;
    }

    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }
    


}
