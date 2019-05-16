package modelo.factura;

import java.time.Instant;
import java.time.LocalDate;
import modelo.empleado.EmpleadoMD;

/**
 *
 * @author Johnny
 */
public class EntregaMD {
    private int id; 
    private EmpleadoMD empleado; 
    private PedidoMD pedido; 
    private LocalDate fechaEntrega; 
    private Instant horaEntrega; 
}
