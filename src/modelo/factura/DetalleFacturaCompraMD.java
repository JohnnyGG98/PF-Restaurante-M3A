package modelo.factura;

import modelo.inventario.ProductoMD;

/**
 *
 * @author Johnny
 */
public class DetalleFacturaCompraMD {
    private int id;
    private FacturaCompraMD facturaCompra;
    private ProductoMD producto; 
    private int cantidad; 
    private double precioUnidad; 
    private double precioTotal; 
}
