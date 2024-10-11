package Modelo;

import java.util.ArrayList;
import java.util.Date;

public class ListaInscripcion {
    private ArrayList<Inscripcion> listaInsc;
    public ListaInscripcion() {
        this.listaInsc = new ArrayList<>();
    }
    public void agregarInscripcion(Inscripcion _inscripcion) {
        listaInsc.add(_inscripcion);
        System.out.println("Inscripción añadida.");
    }
    public Inscripcion getInscripcion(String _idInscripcion) {

    }
}
