package core;

import java.util.ArrayList;

public class RockRollRadio {

    private ArrayList<Artista> artistas;
    private ArrayList<Cancion> canciones;
    private ArrayList<Invitado> invitados;
    private ArrayList<Locutor> locutores;
    private ArrayList<Programa> programas;
    private ArrayList<Emision> emisiones;

    public RockRollRadio() {
        artistas = new ArrayList<>();
        canciones = new ArrayList<>();
        invitados = new ArrayList<>();
        locutores = new ArrayList<>();
        programas = new ArrayList<>();
        emisiones = new ArrayList<>();
    }

    public void addLocutor(Locutor locutor) {
        this.locutores.add(locutor);
        
    }

    public Locutor getLocutor(int index) {
        return this.locutores.get(index);
    }

    public void addArtista(Artista artista) {
        this.artistas.add(artista);
    }

    public Artista getArtista(int index) {
        return this.artistas.get(index);
    }

    public ArrayList<Artista> getArtistas() {
        return this.artistas;
    }

    public void addPrograma(Programa programa) {
        this.programas.add(programa);        
    }

    public Programa getPrograma(int index) {
        return this.programas.get(index);
    }

    public ArrayList<Programa> getProgramas() {
        return this.programas;
    }

    public void addCancion(Cancion cancion) {
        this.canciones.add(cancion);
    }

    public Cancion getCancion(int index) {
        return this.canciones.get(index);
    }

    public void addEmision(Emision emision) {
        this.emisiones.add(emision);
    }

    public void addInvitado(Invitado invitado, Emision emision) {
        this.invitados.add(invitado);
        this.emisiones.add(emision);
    }

    public Programa getProgramaConMasCancionesDeArtista(Artista artista) {

        Programa maxPrg = this.getPrograma(0);
        int maxCnc = 0;
        for (Programa programa : this.getProgramas()) {
            int c = 0;
            for (Emision emision : programa.getEmisiones()) {
                for (Cancion cancion : emision.getCanciones()) {
                    if (cancion.getArtista() == artista) {
                        c++;
                    }
                }
            }
            if (c > maxCnc) {
                maxCnc = c;
                maxPrg = programa;
            }
        }
        return maxPrg;
    }

}
