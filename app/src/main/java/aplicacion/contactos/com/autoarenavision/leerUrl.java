package aplicacion.contactos.com.autoarenavision;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class leerUrl {

    /**
     * Realiza la lectura de una pagina enviada como parametro e imprime el
     * contenido
     *
     * @param url
     * @return
     */
    public String leerPagina(String url) {
        System.out.println("Leyendo Pagina : " + url);
        StringBuffer resultado = new StringBuffer();

        try {
            URL urlPagina = new URL(url);
            URLConnection urlConexion = urlPagina.openConnection();
            urlConexion.connect();

            // Creamos el objeto con el que vamos a leer
            BufferedReader lector = new BufferedReader(new InputStreamReader(
                    urlConexion.getInputStream(), "UTF-8"));
            String linea = "";
            String contenido = "";

            while ((linea = lector.readLine()) != null) {
                resultado.append(String.valueOf(linea));
                resultado.append("\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Contenido : \n\n" + resultado.toString());
        return resultado.toString();
    }

    /**
     * Realiza la lectura de una pagina enviada como parametro y busca las
     * coincidencias de un texto especificado.
     *
     * @param url
     * @param enlacesWebCadenas
     * @param programacionArenavisions
     * @param texto1
     * @param texto2
     * @param texto3
     * @return
     */
    public void buscarTextoPagina(String url, ArrayList<EnlacesWebCadenas> enlacesWebCadenas, ArrayList<ProgramacionArenavision> programacionArenavisions, String texto1, String texto2, String texto3, String texto4) {
        StringBuffer resultado = new StringBuffer();


        try {
            URL pagina = new URL(url);
            URLConnection uc = pagina.openConnection();
            uc.connect();

            // Creamos el objeto con el que vamos a leer
            BufferedReader lector = new BufferedReader(new InputStreamReader(
                    uc.getInputStream(), "UTF-8"));
            int contando = 0;
            String programas[] = new String[7];
            String linea = "";



            while ((linea = lector.readLine()) != null) {


                //para las cadenas
                if (linea.contains(texto1) || linea.contains(texto2)) {

                    linea = linea.replace("<li class=\"leaf\"><a href=\"", "");
                    linea = linea.replace("<li class=\"expanded\"><a href=\"/acestream1\">AV 1-10</a><ul class=\"menu\"><li class=\"first leaf\"><a href=\"", "");
                    linea = linea.replace("<li class=\"expanded\"><a href=\"/acestream2\">AV 11-20</a><ul class=\"menu\"><li class=\"first leaf\"><a href=\"", "");
                    linea = linea.replace("<li class=\"expanded\"><a href=\"/acestream3\">AV 21-30</a><ul class=\"menu\"><li class=\"first leaf\"><a href=\"", "");
                    linea = linea.replace("<li class=\"expanded\"><a href=\"/acestream4\" title=\"\">AV 31-44</a><ul class=\"menu\"><li class=\"first leaf\"><a href=\"", "");

                    linea = linea.replace("\" title=\"\">", " ");
                    linea = linea.replace("</a></li>", "");
                    resultado.append(String.valueOf(linea));
                    String[] parts = linea.split(" ");

                    enlacesWebCadenas.add(new EnlacesWebCadenas(parts[0], parts[2]));
                    resultado.append("\n");

                }

                if (linea.contains(texto3) || linea.contains(texto4)){

                    linea = linea.replace("</tr><tr><td class=\"auto-style3\">", "");
                    linea = linea.replace("<td class=\"auto-style3\">", "");
                    linea = linea.replace("</td>", "");
                    linea = linea.replace("<br />" ,"");

                    contando = contando % 6;
                    programas[contando] = linea;



                    //System.out.println(contando + "- " + linea);

                    if (contando==5){

                        String[] idioma = programas[5].split(" ");
                        programacionArenavisions.add(new ProgramacionArenavision(
                                programas[0],
                                programas[1],
                                programas[2],
                                programas[3],
                                programas[4],
                                idioma[0],
                                idioma[1]) // todo corregir para dos o mas idiomas
                        );

                        }
                    contando++;



                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * Método chungo
     * @param url Url de la pagina a leer
     * @param enlacesWebCadenas Objeto que le paso para almacenar el valor
     * @param pos Numero de objeto (su posicion)
     */
    public void buscarTextoPaginaDos(String url, ArrayList<EnlacesWebCadenas> enlacesWebCadenas, int pos) {
        StringBuffer resultado = new StringBuffer();


        try {
            URL pagina = new URL(url);
            URLConnection uc = pagina.openConnection();
            uc.connect();

            // Creamos el objeto con el que vamos a leer
            BufferedReader lector = new BufferedReader(new InputStreamReader(
                    uc.getInputStream(), "UTF-8"));
            int contando = 0;
            String programas[] = new String[7];
            String linea = "";



            while ((linea = lector.readLine()) != null) {


                //para las cadenas
                if (linea.contains("acestream://")) {

                    linea = linea.substring(48,100);  // todo para recortar el texto y dejar solo el acestream enlace
                    System.out.println(linea);
                    enlacesWebCadenas.get(pos).setEnlaceAce(linea);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }









}
