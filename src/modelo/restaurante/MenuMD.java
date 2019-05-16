package modelo.restaurante;

import java.awt.Image;
import modelo.inventario.ProductoMD;

/**
 *
 * @author Johnny
 */
public class MenuMD {
    private int id; 
    private ProductoMD producto;  
    private PlatoMD plato; 
    private String categoria; 
    private double precioVenta; 
    private boolean tieneIva; 
    private Image foto; 
}
