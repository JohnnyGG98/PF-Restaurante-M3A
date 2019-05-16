package modelo.empleado;

import modelo.restaurante.RegistroAsistenciaMD;
import modelo.restaurante.PagoMD;
import java.awt.Image;
import java.util.ArrayList;
import modelo.persona.UsuarioMD;

/**
 *
 * @author Johnny
 */
public class EmpleadoMD extends UsuarioMD{
    private int idEmpleado; 
    private CargoMD cargo; 
    private Image foto; 
    private ArrayList<PagoMD> pagos;
    private ContratoMD contrato;
    private ArrayList<RegistroAsistenciaMD> asistencias; 

    public EmpleadoMD() {
    }

    public EmpleadoMD(int idEmpleado, CargoMD cargo, Image foto, ArrayList<PagoMD> pagos, ContratoMD contrato, ArrayList<RegistroAsistenciaMD> asistencias) {
        this.idEmpleado = idEmpleado;
        this.cargo = cargo;
        this.foto = foto;
        this.pagos = pagos;
        this.contrato = contrato;
        this.asistencias = asistencias;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public CargoMD getCargo() {
        return cargo;
    }

    public void setCargo(CargoMD cargo) {
        this.cargo = cargo;
    }

    public Image getFoto() {
        return foto;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }

    public ArrayList<PagoMD> getPagos() {
        return pagos;
    }

    public void setPagos(ArrayList<PagoMD> pagos) {
        this.pagos = pagos;
    }

    public ContratoMD getContrato() {
        return contrato;
    }

    public void setContrato(ContratoMD contrato) {
        this.contrato = contrato;
    }

    public ArrayList<RegistroAsistenciaMD> getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(ArrayList<RegistroAsistenciaMD> asistencias) {
        this.asistencias = asistencias;
    }
    
}
