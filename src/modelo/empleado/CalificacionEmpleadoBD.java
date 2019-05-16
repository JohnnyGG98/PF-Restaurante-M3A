package modelo.empleado;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ConectarDB;
import modelo.persona.ClienteMD;

/**
 *
 * @author Johnny
 */
public class CalificacionEmpleadoBD extends CalificacionEmpleadoMD {

    ConectarDB conecta = new ConectarDB("Califiacion Empleado");

    public void ingresarCalificacionEmpleado() {
        String nsql = "INSERT INTO public.calificaciones_empleado(\n"
                + "	id_persona, id_empleado, calificacion)\n"
                + "	VALUES (" + getCliente().getId() + " , "
                + getMesero().getIdEmpleado() + ", "
                + getCalificacion() + ");";
        if (conecta.nosql(nsql) == null) {
            System.out.println("Se guardo correctamente calificacion de mesero " + getMesero().getNombre());
        }
    }

    public void editarCalificacionEmpleado(int idCalificacion) {
        String nsql = "UPDATE public.calificaciones_empleado\n"
                + "SET id_persona=" + getCliente().getId() + ", "
                + "id_empleado=" + getMesero().getIdEmpleado() + ", "
                + "calificacion=" + getCalificacion() + "\n"
                + "WHERE id_calificacion_empleado = " + idCalificacion + ";";
        if (conecta.nosql(nsql) == null) {
            System.out.println("Se edito correctamente calificacion de mesero " + getMesero().getNombre());
        }
    }

    public void eliminarCalificacionEmpleado(int idCalificacion) {
        String nsql = "DELETE FROM public.calificaciones_empleado\n"
                + "WHERE id_calificacion_empleado = " + idCalificacion + ";";
        if (conecta.nosql(nsql) == null) {
            System.out.println("Se elimino correctamente calificacion de mesero " + getMesero().getNombre());
        }
    }
    
    public ArrayList<CalificacionEmpleadoMD> cargarCalificacionesEmpleados() {
        String sql = "SELECT id_calificacion_empleado, id_persona, id_empleado, calificacion\n"
                + "	FROM public.calificaciones_empleado;";
        return cargarCalificaciones(sql); 
    }
    
    public ArrayList<CalificacionEmpleadoMD> cargarCalificacionesPorEmpleado(int idEmpleado) {
        String sql = "SELECT id_calificacion_empleado, id_persona, id_empleado, calificacion\n"
                + "	FROM public.calificaciones_empleado WHERE id_empleado = " + idEmpleado + ";";
        return cargarCalificaciones(sql); 
    }
    
    public ArrayList<CalificacionEmpleadoMD> cargarCalificacionesPorPersona(int idPersona) {
        String sql = "SELECT id_calificacion_empleado, id_persona, id_empleado, calificacion\n"
                + "	FROM public.calificaciones_empleado WHERE id_persona = " + idPersona + ";";
        return cargarCalificaciones(sql); 
    }

    private ArrayList<CalificacionEmpleadoMD> cargarCalificaciones(String sql) {
        ArrayList<CalificacionEmpleadoMD> calificaciones = new ArrayList();
        ResultSet rs = conecta.sql(sql);
        try {
            if (rs != null) {
                while (rs.next()) {
                    calificaciones.add(obtenerCalificacionEmpleado(rs));
                }
                return calificaciones;
            } else {
                return null;
            }
        } catch (SQLException e) {
            return null;
        }
    }

    public CalificacionEmpleadoMD obtenerCalificacionEmpleado(ResultSet rs) {
        CalificacionEmpleadoMD c = new CalificacionEmpleadoMD();
        try {
            c.setCalificacion(rs.getInt("calificacion"));
            //Aqui deberiamos buscarlo en la base de datos
            ClienteMD cliente = new ClienteMD();
            cliente.setId(rs.getInt("id_persona"));
            c.setCliente(cliente);
            c.setId(rs.getInt("id_calificacion_empleado"));
            //Aqui deberiamos buscalo en base de datos
            MeseroMD m = new MeseroMD();
            m.setId(rs.getInt("id_empleado"));
            c.setMesero(m);
            return c;
        } catch (SQLException e) {
            return null;
        }
    }

}
