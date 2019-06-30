package aplicacion.contactos.com.autoarenavision;

public class EnlacesWebCadenas {
    String urlPaginaWeb;
    String cadenaNumero;
    String enlaceAce;

    public EnlacesWebCadenas(String url, String cadenaNumero) {
        this.urlPaginaWeb = url;
        this.cadenaNumero = cadenaNumero;
    }

    public String getUrlPaginaWeb() {
        return urlPaginaWeb;
    }

    public String getEnlaceAce() {
        return enlaceAce;
    }

    public String getCadenaNumero() {
        return cadenaNumero;
    }

    public void setEnlaceAce(String enlaceAce) {
        this.enlaceAce = enlaceAce;
    }
}
