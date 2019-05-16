package modelo.restaurante;

import java.time.LocalDate;
import modelo.persona.UsuarioMD;

/**
 *
 * @author Johnny
 */
public class ReportesMensualesMD {
    private int id;
    private UsuarioMD usuario; 
    private LocalDate fechaReporte; 
    private double ingresos; 
    private double egresos; 
    private double diferencia; 
}
