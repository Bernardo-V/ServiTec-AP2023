package modelo;

import java.util.Date;

public class Contrato {
    private int id_contrato;
   // private int id_cliente;
    private Cliente cliente; // Un único servicio asociado con el contrato
    private Servicio servicio; // Un único servicio asociado con el contrato
    private Date fecha_inicio;
    private Date fecha_fin;
    private String estado;

    // Constructor vacío
    public Contrato() {
    }

    // Constructor con todos los atributos
    public Contrato(int id_contrato, Cliente cliente, Servicio servicio, Date fecha_inicio, Date fecha_fin, String estado) {
        this.id_contrato = id_contrato;
        this.cliente = cliente;
        this.servicio = servicio;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.estado = estado;
    }

    public int getId_contrato() {
        return id_contrato;
    }



    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    // Getters y Setters
    public String getEstado() {
        return estado;
    }

    public void setId_contrato(int id_contrato) {
        this.id_contrato = id_contrato;
    }


    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

   
    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    // Método que recibe un objeto Contrato y devuelve el Servicio asociado
    public Servicio obtenerServicioDelContrato(Contrato contrato) {
        if (contrato != null) {
            return contrato.getServicio();
        } else {
            return null; // O manejar la situación de un contrato nulo según sea necesario
        }
    }
    
}
