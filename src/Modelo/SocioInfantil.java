package Modelo;
public class SocioInfantil extends Socio {
    private String noTutor;

    public SocioInfantil() {}

    public SocioInfantil(String noSocio, String nombre, TipoSocio tipoSocio, String noTutor) {
        super(noSocio, nombre, tipoSocio);
        this.noTutor = noTutor;
    }

    public String getNoTutor() {
        return noTutor;
    }

    public void setNoTutor(String noTutor) {
        this.noTutor = noTutor;
    }

    @Override
    public double calcularCuota() {
        // Implementar lógica de cálculo de cuota
        return 0.0;
    }

    @Override
    public double costeExcursion(Excursion excursion) {
        // Implementar lógica de cálculo del coste de excursión
        return 0.0;
    }
}
