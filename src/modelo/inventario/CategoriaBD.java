package modelo.inventario;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ConectarDB;

/**
 *
 * @author Johnny
 */
public class CategoriaBD extends CategoriaMD {

    ConectarDB conecta = new ConectarDB("Categoria");

    public void guardarCategoria() {
        String nsql = "";
        if (conecta.nosql(nsql) == null) {
            System.out.println("Se guardo correctamente " + getNombre());
        }
    }

    public void editarCategoria(int idCategoria) {
        String nsql = "UPDATE public.categoria\n"
                + "SET nombre='" + getNombre() + "'\n"
                + "WHERE id_categoria=" + idCategoria + ";";
        if (conecta.nosql(nsql) == null) {
            System.out.println("Se edito correctamente " + getNombre());
        }
    }

    public void eliminarCategoria(int idCategoria) {
        String nsql = "UPDATE public.categoria\n"
                + "SET categoria_elim='true'\n"
                + "WHERE id_categoria=" + idCategoria + ";";
        if (conecta.nosql(nsql) == null) {
            System.out.println("Se elimino correctamente " + getNombre());
        }
    }

    public ArrayList<CategoriaMD> cargarCategoria() {
        ArrayList<CategoriaMD> c = new ArrayList();
        String sql = "SELECT id_categoria, nombre\n"
                + "FROM public.categoria WHERE categoria_elim = 'false';";
        ResultSet rs = conecta.sql(sql);
        try {
            if (rs != null) {
                while (rs.next()) {
                    c.add(obtenerCategoria(rs));
                }
                return c;
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println("No se pudieron cargar categorias");
            System.out.println(e.getMessage());
            return null;
        }
    }

    public CategoriaMD buscarCategoria(int idCategoria) {
        CategoriaMD c = new CategoriaMD();
        String sql = "SELECT id_categoria, nombre, categoria_elim\n"
                + "FROM public.categoria WHERE categoria_elim = 'false' "
                + "AND id_categoria =" + idCategoria + ";";
        ResultSet rs = conecta.sql(sql);
        try {
            if (rs != null) {
                while (rs.next()) {
                    c = obtenerCategoria(rs);
                }
                return c;
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println("No se pudo busca una categoria " + idCategoria);
            System.out.println(e.getMessage());
            return null;
        }
    }

    public CategoriaMD obtenerCategoria(ResultSet rs) {
        CategoriaMD c = new CategoriaMD();
        try {
            c.setId(rs.getInt("id_categoria"));
            c.setNombre(rs.getString("nombre"));
            return c;
        } catch (SQLException e) {
            System.out.println("No se pudo obtener una categoria");
            return null;
        }
    }
}
