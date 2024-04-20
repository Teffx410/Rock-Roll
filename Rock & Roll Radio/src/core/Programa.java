
package core;

import java.util.ArrayList;

public class Programa {
    private String nombre;
    private int serial;
    private ArrayList<Emision> emisiones;
    private ArrayList<Locutor> locutores;

    public Programa(String nombre, Locutor locutor) {
        this.nombre = nombre;
        locutores = new ArrayList<>();
        emisiones = new ArrayList<>();
        this.locutores.add(locutor);
            
    }
    
    public void addEmision(Emision emision){
        this.emisiones.add(emision);
    }
    public Emision getLastEmision(){
        return this.emisiones.get(this.emisiones.size()-1);
    } 
    
    public ArrayList<Emision> getEmisiones(){
        return this.emisiones;
    } 
    
    public String getNombre(){
        return this.nombre;
    }
    
    
}
