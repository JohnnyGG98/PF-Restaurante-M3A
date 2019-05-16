package modelo.restaurante;

import modelo.persona.ClienteMD;

/**
 *
 * @author Johnny
 */
public class CalificacionPlatoMD {
    private int id; 
    private ClienteMD cliente; 
    private PlatoMD plato; 
    private int numEstrellas; 

    public CalificacionPlatoMD() {
    }

    public CalificacionPlatoMD(int id, ClienteMD cliente, PlatoMD plato, int numEstrellas) {
        this.id = id;
        this.cliente = cliente;
        this.plato = plato;
        this.numEstrellas = numEstrellas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ClienteMD getCliente() {
        return cliente;
    }

    public void setCliente(ClienteMD cliente) {
        this.cliente = cliente;
    }

    public PlatoMD getPlato() {
        return plato;
    }

    public void setPlato(PlatoMD plato) {
        this.plato = plato;
    }

    public int getNumEstrellas() {
        return numEstrellas;
    }

    public void setNumEstrellas(int numEstrellas) {
        this.numEstrellas = numEstrellas;
    }

}
