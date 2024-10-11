package Modelo;

import java.util.ArrayList;

public class ListaSocio {
    private ArrayList<Socio> listaSocio;

    public ListaSocio() {
        this.listaSocio = new ArrayList<>();
    }

    public void anyadirSocio(Socio socio) {
        listaSocio.add(socio);
    }

    public void eliminarSocio(String noSocio) {
        listaSocio.removeIf(socio -> socio.getNoSocio().equals(noSocio));
    }

    public Socio buscarSocio(String noSocio) {
        for (Socio socio : listaSocio) {
            if (socio.getNoSocio().equals(noSocio)) {
                return socio;
            }
        }
        return null; // o lanzar excepción
    }

    public ArrayList<Socio> filtrarPorTipo(TipoSocio tipo) {
        ArrayList<Socio> resultado = new ArrayList<>();
        for (Socio socio : listaSocio) {
            if (socio.getTipoSocio() == tipo) {
                resultado.add(socio);
            }
        }
        return resultado;
    }

    public void eliminarSocio(Socio socio) {
        listaSocio.remove(socio);
    }

    public ArrayList<Socio> getListaSocios() { // Método para obtener la lista de socios
        return listaSocio;
    }
}
