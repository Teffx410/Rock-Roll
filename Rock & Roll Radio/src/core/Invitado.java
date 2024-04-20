
package core;

import java.util.ArrayList;

public class Invitado extends Persona {
    private ArrayList<Emision> emisiones;

    public Invitado(String nombre) {
        super(nombre);
        emisiones = new ArrayList<>();
    }
    
}
