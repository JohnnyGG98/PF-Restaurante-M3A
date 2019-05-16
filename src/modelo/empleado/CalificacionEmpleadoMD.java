package modelo.empleado;

import modelo.persona.PersonaMD;

/**
 *
 * @author Johnny
 */
public class CalificacionEmpleadoMD {
    private int id; 
    private PersonaMD cliente; 
    private EmpleadoMD mesero; 
    private int calificacion;

    public CalificacionEmpleadoMD() {
    }

    public CalificacionEmpleadoMD(int id, PersonaMD cliente, EmpleadoMD mesero, int calificacion) {
        this.id = id;
        this.cliente = cliente;
        this.mesero = mesero;
        this.calificacion = calificacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PersonaMD getCliente() {
        return cliente;
    }

    public void setCliente(PersonaMD cliente) {
        this.cliente = cliente;
    }

    public EmpleadoMD getMesero() {
        return mesero;
    }

    public void setMesero(EmpleadoMD mesero) {
        this.mesero = mesero;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}
