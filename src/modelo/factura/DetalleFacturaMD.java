package modelo.factura;

import modelo.restaurante.MenuMD;

/**
 *
 * @author Johnny
 */
public class DetalleFacturaMD {
    private int id; 
    private FacturaMD factura; 
    private MenuMD menu; 
    private int cantida; 
    private double precioUnidad; 
    private double precioTotal; 
    private String nombrePlato; 
    private String descripcionPlato; 
}
