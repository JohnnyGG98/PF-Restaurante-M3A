package modelo.persona;

import java.time.LocalDate;

/**
 *
 * @author Johnny
 */
public class PersonaMD {
    private int id; 
    private String cedula; 
    private TipoPersonaMD tipoPersona;
    private String nombre; 
    private String apellido; 
    private LocalDate fechaNacimiento; 
    private String direccion; 
    private String correo; 
    private String telefono; 
    private char sexo; 

    public PersonaMD() {
    }

    public PersonaMD(int id, String cedula, TipoPersonaMD tipoPersona, String nombre, String apellido, LocalDate fechaNacimiento, String direccion, String correo, String telefono, char sexo) {
        this.id = id;
        this.cedula = cedula;
        this.tipoPersona = tipoPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        this.sexo = sexo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public TipoPersonaMD getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(TipoPersonaMD tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
