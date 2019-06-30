package aplicacion.contactos.com.autoarenavision;

public class ProgramacionArenavision {
    String dia;
    String hora;
    String deporte;
    String competicion;
    String eventoPartido; // el madrid-barcelona
    String cadenas;
    String idioma;

    public String getDia() {
        return dia;
    }

    public String getHora() {
        return hora;
    }

    public String getDeporte() {
        return deporte;
    }

    public String getCompeticion() {
        return competicion;
    }

    public String getEventoPartido() {
        return eventoPartido;
    }

    public String getCadenas() {
        return cadenas;
    }

    public String getIdioma() {
        return idioma;
    }

    public ProgramacionArenavision(String dia, String hora, String deporte, String competicion, String eventoPartido, String cadenas, String idioma) {
        this.dia = dia;
        this.hora = hora;
        this.deporte = deporte;
        this.competicion = competicion;
        this.eventoPartido = eventoPartido;
        this.cadenas = cadenas;
        this.idioma = idioma;
    }
}
