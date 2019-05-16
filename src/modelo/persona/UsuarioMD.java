package modelo.persona;

import java.util.ArrayList;

/**
 *
 * @author Johnny
 */
public class UsuarioMD extends PersonaMD{
    private int id; 
    private String username; 
    private String clave; 
    private ArrayList<HistorialIngresoMD> historial;

    public UsuarioMD() {
    }

    public UsuarioMD(int id, String username, String clave, ArrayList<HistorialIngresoMD> historial) {
        this.id = id;
        this.username = username;
        this.clave = clave;
        this.historial = historial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public ArrayList<HistorialIngresoMD> getHistorial() {
        return historial;
    }

    public void setHistorial(ArrayList<HistorialIngresoMD> historial) {
        this.historial = historial;
    }
    
    
}
