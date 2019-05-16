package modelo.empleado;

import java.time.Instant;
import java.time.LocalDate;

/**
 *
 * @author Johnny
 */
public class ContratoMD {
    private int id; 
    private EmpleadoMD empleado; 
    private double salario; 
    private Instant horaEntrada; 
    private Instant horaSalida; 
    private LocalDate fechaContrato; 
    private LocalDate fechaModificacion; 
    private String dias;
    private String tipoJornada; 
}
