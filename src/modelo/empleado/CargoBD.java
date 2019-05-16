package modelo.empleado;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ConectarDB;

/**
 *
 * @author Johnny
 */
public class CargoBD extends CargoMD {

    ConectarDB conecta = new ConectarDB("Cargo");

    public void guardarCargo() {
        String nsql = "INSERT INTO public.cargos(\n"
                + "cargo)\n"
                + "VALUES ('" + getCargo() + "');";
        if (conecta.nosql(nsql) == null) {
            System.out.println("Se guardo correctamente cargo " + getCargo());
        }
    }

    public void editarCargo(int idCargo) {
        String nsql = "UPDATE public.cargos\n"
                + "SET cargo='" + getCargo() + "'\n"
                + "WHERE id_cargo = " + idCargo + ";";
        if (conecta.nosql(nsql) == null) {
            System.out.println("Se guardo correctamente cargo " + getCargo());
        }
    }

    public void eliminarCargo(int idCargo) {
        String nsql = "UPDATE public.cargos\n"
                + "SET cargo_elim='true'\n"
                + "WHERE id_cargo = " + idCargo + ";";
        if (conecta.nosql(nsql) == null) {
            System.out.println("Se guardo correctamente cargo " + getCargo());
        }
    }

    public ArrayList<CargoMD> cargarCargos() {
        ArrayList<CargoMD> c = new ArrayList();
        String sql = "SELECT id_cargo, cargo\n"
                + "FROM public.cargos WHERE cargo_elim = false;";
        ResultSet rs = conecta.sql(sql);
        try {
            if (rs != null) {
                while (rs.next()) {
                    c.add(obtenerCargo(rs));
                }
                return c;
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println("No se pudo cargar cargos");
            System.out.println(e.getMessage());
            return null;
        }
    }

    public CargoMD buscarCargo(int idCargo) {
        CargoMD c = new CargoMD();
        String sql = "SELECT id_cargo, cargo\n"
                + "FROM public.cargos WHERE cargo_elim = false "
                + "AND id_cargo=" + idCargo + ";";
        ResultSet rs = conecta.sql(sql);
        try {
            if (rs != null) {
                while (rs.next()) {
                    c = obtenerCargo(rs);
                }
                return c;
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println("No se pudo cargar cargos");
            System.out.println(e.getMessage());
            return null;
        }
    }

    public CargoMD obtenerCargo(ResultSet rs) {
        CargoMD c = new CargoMD();
        try {
            c.setCargo(rs.getString("cargo"));
            c.setId(rs.getInt("id_cargo"));
            return c;
        } catch (SQLException e) {
            return null;
        }
    }
}
