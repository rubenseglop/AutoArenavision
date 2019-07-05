package aplicacion.contactos.com.autoarenavision;

import android.os.Bundle;
import android.os.StrictMode;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import aplicacion.contactos.com.autoarenavision.Fragments.CadenasFragment;
import aplicacion.contactos.com.autoarenavision.Fragments.NotificationsFragment;
import aplicacion.contactos.com.autoarenavision.Fragments.ProgramacionFragment;

public class MainActivity extends AppCompatActivity {


    final Fragment fragment1 = new CadenasFragment();
    final Fragment fragment2 = new ProgramacionFragment();
    final Fragment fragment3 = new NotificationsFragment();
    final FragmentManager fm = getSupportFragmentManager();
    Fragment active = fragment1;

    public static leerUrl ejemplo = new leerUrl();
    public static ArrayList<EnlacesWebCadenas> enlacesWebCadenas;
    public static ArrayList<ProgramacionArenavision> programacionArenavisions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

        StrictMode.setThreadPolicy(policy);


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


        enlacesWebCadenas = new ArrayList<>();
        programacionArenavisions = new ArrayList<>();

        String busco1 = "<li class=\"leaf\"><a href=";
        String busco2 = "<li class=\"first leaf\"><a href=";
        String busco3 = "</tr><tr><td class=\"auto-style3\">";
        String busco4 = "<td class=\"auto-style3\">";

        ejemplo.buscarTextoPagina("http://arenavision.us/guide", enlacesWebCadenas, programacionArenavisions, busco1, busco2, busco3, busco4);


        System.out.println(enlacesWebCadenas.get(1).getCadenaNumero());
        System.out.println(enlacesWebCadenas.get(1).getUrlPaginaWeb());




/*        for (int i = 0; i < programacionArenavisions.size(); i++) {
            System.out.println("dia " + programacionArenavisions.get(i).getDia() + "-" +
                    "hora " + programacionArenavisions.get(i).getHora() + "-" +
                    "deporte " + programacionArenavisions.get(i).getDeporte() + "-" +
                    "competicion " + programacionArenavisions.get(i).getCompeticion() + "-" +
                    "evento " + programacionArenavisions.get(i).getEventoPartido() + "-" +
                    "cadena " + programacionArenavisions.get(i).getCadenas() + "-" +
                    "idioma " + programacionArenavisions.get(i).getIdioma()
            );
        }*/


        //recorrer todas las cadenas y ponerle su URL

/*        for (int i = 0; i < enlacesWebCadenas.size(); i++) {
            ejemplo.buscarTextoPaginaDos(enlacesWebCadenas.get(i).getUrlPaginaWeb(),enlacesWebCadenas,i);
        }*/


        ejemplo.buscarTextoPaginaDos(enlacesWebCadenas.get(1).getUrlPaginaWeb(), enlacesWebCadenas, 1);

        // actualizar los botones con la informacion del partido (de hoy)

        fm.beginTransaction().add(R.id.main_container, fragment3, "3").hide(fragment3).commit();
        fm.beginTransaction().add(R.id.main_container, fragment2, "2").hide(fragment2).commit();
        fm.beginTransaction().add(R.id.main_container, fragment1, "1").commit();


    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    fm.beginTransaction().hide(active).show(fragment1).commit();
                    active = fragment1;
                    return true;

                case R.id.navigation_dashboard:
                    fm.beginTransaction().hide(active).show(fragment2).commit();
                    active = fragment2;
                    return true;

                case R.id.navigation_notifications:
                    fm.beginTransaction().hide(active).show(fragment3).commit();
                    active = fragment3;
                    return true;
            }
            return false;
        }
    };


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.bottom_nav_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

}
