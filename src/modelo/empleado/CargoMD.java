package modelo.empleado;

/**
 *
 * @author Johnny
 */
public class CargoMD {
    private int id; 
    private String cargo; 

    public CargoMD() {
    }

    public CargoMD(int id, String cargo) {
        this.id = id;
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
}
