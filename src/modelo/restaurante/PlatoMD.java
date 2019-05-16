package modelo.restaurante;

import java.util.ArrayList;

/**
 *
 * @author Johnny
 */
public class PlatoMD {
    private int id; 
    private TemporadaAnioMD temporada; 
    private String nombre; 
    private double precio; 
    private double costo; 
    private int calificacion; 
    private String descripcion; 
    private ArrayList<IngredienteMD> ingredientes; 

    public PlatoMD() {
    }

    public PlatoMD(int id, TemporadaAnioMD temporada, String nombre, double precio, double costo, int calificacion, String descripcion, ArrayList<IngredienteMD> ingredientes) {
        this.id = id;
        this.temporada = temporada;
        this.nombre = nombre;
        this.precio = precio;
        this.costo = costo;
        this.calificacion = calificacion;
        this.descripcion = descripcion;
        this.ingredientes = ingredientes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TemporadaAnioMD getTemporada() {
        return temporada;
    }

    public void setTemporada(TemporadaAnioMD temporada) {
        this.temporada = temporada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<IngredienteMD> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<IngredienteMD> ingredientes) {
        this.ingredientes = ingredientes;
    }
    
}
