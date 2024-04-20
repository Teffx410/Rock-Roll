
package core;

import java.util.ArrayList;


public class Artista extends Persona {
    private ArrayList<Cancion> canciones;

    public Artista(String nombre) {
        super(nombre);
        canciones = new ArrayList<>();
    }
    
     public String getNombre(){
        return this.nombre;
    } 
}
