package modelo.restaurante;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ConectarDB;

/**
 *
 * @author Johnny
 */
public class CajaBD extends CajaMD {

    ConectarDB conecta = new ConectarDB("CajaBD");

    public void ingresarCaja() {
        String nsql = "INSERT INTO public.cajas(\n"
                + "	numero_caja)\n"
                + "	VALUES (" + getNumCaja() + ");";
        if (conecta.nosql(nsql) == null) {
            System.out.println("Se guardo correctamente caja " + getNumCaja());
        }
    }

    public void editarCaja(int idCaja) {
        String nsql = "UPDATE public.cajas\n"
                + "	SET numero_caja=" + getNumCaja() + ", caja_elim=?\n"
                + "	WHERE id_caja = " + idCaja + ";";
        if (conecta.nosql(nsql) == null) {
            System.out.println("Se edito correctamente caja " + getNumCaja());
        }
    }

    public void eliminarCaja(int idCaja) {
        String nsql = "UPDATE public.cajas\n"
                + "	SET caja_elim='true' \n"
                + "	WHERE id_caja = " + idCaja + ";";
        if (conecta.nosql(nsql) == null) {
            System.out.println("Se elimino correctamente caja " + getNumCaja());
        }
    }

    public ArrayList<CajaMD> cargarCajas() {
        ArrayList<CajaMD> cajas = new ArrayList();

        String sql = "SELECT id_caja, numero_caja\n"
                + "	FROM public.cajas WHERE caja_elim = false;";
        ResultSet rs = conecta.sql(sql);

        try {
            if (rs != null) {
                while (rs.next()) {
                    cajas.add(obtenerCaja(rs));
                }
                return cajas;
            } else {
                System.out.println("No se pudieron consultar cajas");
                return null;
            }
        } catch (SQLException e) {
            System.out.println("No se pudieron consultar cajas");
            System.out.println(e.getMessage());
            return null;
        }
    }

    public CajaMD buscarCaja(int idCaja) {
        CajaMD caja = new CajaMD();
        String sql = "SELECT id_caja, numero_caja\n"
                + "	FROM public.cajas WHERE caja_elim = false\n"
                + "	AND id_caja = " + idCaja + " ;";
        ResultSet rs = conecta.sql(sql);

        try {
            if (rs != null) {
                while (rs.next()) {
                    caja = obtenerCaja(rs);
                }
                return caja;
            } else {
                System.out.println("No se pudieron consultar cajas");
                return null;
            }
        } catch (SQLException e) {
            System.out.println("No se pudieron consultar cajas");
            System.out.println(e.getMessage());
            return null;
        }
    }

    public CajaMD obtenerCaja(ResultSet rs) {
        CajaMD c = new CajaMD();
        try {
            c.setId(rs.getInt("id_caja"));
            c.setNumCaja(rs.getInt("numero_caja"));
            return c;
        } catch (SQLException e) {
            System.out.println("No se pudo obtener una caja.");
            System.out.println(e.getMessage());
            return null;
        }
    }

}
