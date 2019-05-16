package modelo.factura;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import modelo.persona.PersonaMD;
import modelo.restaurante.HistorialCajaMD;

/**
 *
 * @author Johnny
 */
public class FacturaMD {
    private int id;  
    private HistorialCajaMD historialCaja; 
    private PersonaMD persona; 
    private String numFactura; 
    private String formaPago; 
    private double total; 
    private LocalDate fechaFactura; 
    private Instant horaFactura; 
    private double subTotal; 
    private double subtotalSinIva; 
    private double subtotalIva;
    private double iva; 
    private String nombreCompleto; 
    private String direccion; 
    private String correo; 
    private String telefono; 
    private double propina; 
    private ArrayList<DetalleFacturaMD> detalleFactura; 
    
}
