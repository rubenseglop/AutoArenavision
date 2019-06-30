package aplicacion.contactos.com.autoarenavision;

public class EnlacesWebCadenas {
     String urlPaginaWeb;
     String cadenaNumero;

    public String getUrlPaginaWeb() {
        return urlPaginaWeb;
    }

    public String getCadenaNumero() {
        return cadenaNumero;
    }

    public EnlacesWebCadenas(String url, String cadenaNumero) {
        this.urlPaginaWeb = url;
        this.cadenaNumero = cadenaNumero;
    }
}
