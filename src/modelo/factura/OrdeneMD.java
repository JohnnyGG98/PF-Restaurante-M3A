package modelo.factura;

import modelo.empleado.EmpleadoMD;
import modelo.restaurante.MesaMD;

/**
 *
 * @author Johnny
 */
public class OrdeneMD {
    private int id; 
    private MesaMD mesa; 
    private EmpleadoMD empleado; 
    private FacturaMD factura; 
    private int numOrden;
}
