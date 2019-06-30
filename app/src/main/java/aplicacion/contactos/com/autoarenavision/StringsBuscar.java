package aplicacion.contactos.com.autoarenavision;

import java.util.ArrayList;

public class StringsBuscar {

    ArrayList<EnlacesWebCadenas> enlacesWebCadenas = new ArrayList<>();
    ArrayList<ProgramacionArenavision> programacionArenavisions = new ArrayList<>();

    public ArrayList<EnlacesWebCadenas> getEnlacesWebCadenas() {
        return enlacesWebCadenas;    }


    public ArrayList<ProgramacionArenavision> getProgramacionArenavisions() {
        return programacionArenavisions;
    }

    public StringsBuscar(ArrayList<EnlacesWebCadenas> enlacesWebCadenas, ArrayList<ProgramacionArenavision> programacionArenavisions) {
        this.enlacesWebCadenas = enlacesWebCadenas;
        this.programacionArenavisions = programacionArenavisions;
    }
}
