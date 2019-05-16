package modelo.factura;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import modelo.empleado.EmpleadoMD;

/**
 *
 * @author Johnny
 */
public class FacturaCompraMD {
    private int id;  
    private ProveedorMD proveedor; 
    private EmpleadoMD empleado; 
    private LocalDate fecha; 
    private Instant hora; 
    private double total; 
    private String numFactura; 
    private String rucProveedor; 
    private String direccionProveedor; 
    private String telefonoProveedor; 
    private ArrayList<DetalleFacturaCompraMD> detalleFacturaCompra; 
    
}
