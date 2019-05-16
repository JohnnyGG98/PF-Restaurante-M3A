package modelo.restaurante;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ConectarDB;
import modelo.persona.ClienteMD;

/**
 *
 * @author Johnny
 */
public class CalificacionPlatoBD extends CalificacionPlatoMD {

    ConectarDB conecta = new ConectarDB("Calificacion plato");

    public void guardarCalificacionPlato() {
        String nsql = "INSERT INTO public.calificaciones_plato(\n"
                + "	id_persona, id_plato, numero_estrellas)\n"
                + "	VALUES ( " + getCliente().getId() + ", "
                + getPlato().getId() + ", " + getNumEstrellas() + ");";
        if (conecta.nosql(nsql) == null) {
            System.out.println("Se guardo correctamente la calificacion del"
                    + "plato " + getPlato().getNombre());
        }
    }

    public void editarCalificacionPlato(int idCalificacionPlato) {
        String nsql = "UPDATE public.calificaciones_plato\n"
                + "SET id_persona=" + getCliente().getId() + ", "
                + "id_plato=" + getPlato().getId() + ", "
                + "numero_estrellas=" + getNumEstrellas() + "\n"
                + "WHERE id_calificacion_plato = " + idCalificacionPlato + ";";
        if (conecta.nosql(nsql) == null) {
            System.out.println("Se edito correctamente la calificacion del"
                    + "plato " + getPlato().getNombre());
        }
    }

    public void eliminarCalificacionPlato(int idCalificacionPlato) {
        String nsql = "DELETE FROM public.calificaciones_plato "
                + "WHERE id_calificacion_plato = " + idCalificacionPlato + ";";
        if (conecta.nosql(nsql) == null) {
            System.out.println("Se elimino correctamente la calificacion del"
                    + "plato " + getPlato().getNombre());
        }
    }

    public ArrayList<CalificacionPlatoMD> cargarCalificacionesPlatos() {
        String sql = "SELECT id_calificacion_plato, id_persona, id_plato, numero_estrellas\n"
                + "	FROM public.calificaciones_plato;";
        return cargarCalificaciones(sql);
    }

    public ArrayList<CalificacionPlatoMD> cargarCalificacionesPorPersona(int idPersona) {
        String sql = "SELECT id_calificacion_plato, id_persona, id_plato, numero_estrellas\n"
                + "	FROM public.calificaciones_plato WHERE id_persona =" + idPersona + ";";
        return cargarCalificaciones(sql);
    }

    public ArrayList<CalificacionPlatoMD> cargarCalificacionesPorPlato(int idPlato) {
        String sql = "SELECT id_calificacion_plato, id_persona, id_plato, numero_estrellas\n"
                + "	FROM public.calificaciones_plato WHERE id_plato =" + idPlato + ";";
        return cargarCalificaciones(sql);
    }

    //Este meotod nos cargara los datos dependiendo de la sentencia que se envie  
    //Solo se puede usar desde esta clase
    private ArrayList<CalificacionPlatoMD> cargarCalificaciones(String sql) {
        ArrayList<CalificacionPlatoMD> c = new ArrayList();
        ResultSet rs = conecta.sql(sql);
        try {
            if (rs != null) {
                while (rs.next()) {
                    c.add(obtenerCalificacionPlato(rs));
                }
                rs.close();
                return c;
            } else {
                System.out.println("No pudimos cagar calificaciones de platos");
                return null;
            }
        } catch (SQLException e) {
            System.out.println("No pudimos cargar calificaciones de platos");
            System.out.println(e.getMessage());
            return null;
        }
    }

    private CalificacionPlatoMD obtenerCalificacionPlato(ResultSet rs) {
        CalificacionPlatoMD c = new CalificacionPlatoMD();
        try {
            ClienteMD cliente = new ClienteMD();
            cliente.setId(rs.getInt("id_persona"));
            c.setCliente(cliente);

            c.setId(rs.getInt("id_calificacion_plato"));
            c.setNumEstrellas(rs.getInt("numero_estrellas"));

            PlatoMD plato = new PlatoMD();
            plato.setId(rs.getInt("id_plato"));
            c.setPlato(plato);

            return c;
        } catch (SQLException e) {
            System.out.println("No pudimos obtener calificacion de plato");
            System.out.println(e.getMessage());
            return null;
        }
    }
}
