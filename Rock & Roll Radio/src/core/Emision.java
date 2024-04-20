
package core;

import java.util.ArrayList;

public class Emision {
    
    private int serial;
    private ArrayList<Cancion> canciones;
    private ArrayList<Invitado> invitados;
    private Programa programa;

    public Emision(Programa programa) {
        this.programa = programa;
        this.canciones = new ArrayList<>();
        this.invitados = new ArrayList<>();
        this.programa.addEmision(this);
    }
    
    public Cancion getCancion(int index){
        return this.canciones.get(index);
    } 
    
    public void addCancion (Cancion cancion){
        this.canciones.add(cancion);
    }
    
    public ArrayList<Cancion> getCanciones(){
        return this.canciones;
    } 
}
