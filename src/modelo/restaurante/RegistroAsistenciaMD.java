
package modelo.restaurante;

import java.time.Instant;
import java.time.LocalDate;
import modelo.empleado.EmpleadoMD;

/**
 *
 * @author Johnny
 */
public class RegistroAsistenciaMD {
    private int id; 
    private EmpleadoMD empleado; 
    private Instant horaEntada; 
    private Instant horaSalida; 
    private int numDia; 
    private LocalDate fecha; 
    private int horasTrabajo; 
}
