public class SocioControlador {
    private ListaSocios listaSocios;
    private VistaSocios vistaSocios;

    public SocioControlador(ListaSocios listaSocios, VistaSocios vistaSocios) {
        this.listaSocios = listaSocios;
        this.vistaSocios = vistaSocios;
    }

    public void gestionarSocios() {
        // Implementar la lógica para gestionar socios
    }

    public void crearSocio() {
        // Implementar la lógica para crear un nuevo socio
    }

    public void eliminarSocio(String noSocio) {
        listaSocios.eliminarSocio(noSocio);
    }

    public void mostrarDetalleSocio(String noSocio) {
        Socio socio = listaSocios.buscarSocio(noSocio);
        if (socio != null) {
            vistaSocios.detalleSocio(socio);
        } else {
            // Manejar el caso en que no se encuentra el socio
        }
    }
}
