package modelo.restaurante;

import java.time.Instant;
import java.time.LocalDate;
import modelo.empleado.EmpleadoMD;

/**
 *
 * @author Johnny
 */
public class HistorialCajaMD {
    private int id; 
    private EmpleadoMD empleado; 
    private CajaMD caja; 
    private LocalDate fecha; 
    private Instant horaAbre; 
    private Instant horaCieera; 
    private double dineroAbre; 
    private double dineroCierra;
    private double diferencia; 
}
