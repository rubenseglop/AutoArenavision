package aplicacion.contactos.com.autoarenavision;

import android.os.Bundle;
import android.os.StrictMode;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

        StrictMode.setThreadPolicy(policy);


        leerUrl ejemplo = new leerUrl();

        // <li class="leaf"><a href=
        // <li class="first leaf"><a href="


        String busco1 = "<li class=\"leaf\"><a href=";
        String busco2 = "<li class=\"first leaf\"><a href=";
        String busco3 = "</tr><tr><td class=\"auto-style3\">";
        String busco4 = "<td class=\"auto-style3\">";
        ArrayList<EnlacesWebCadenas> enlacesWebCadenas = ejemplo.buscarTextoPagina("http://arenavision.us/guide",busco1,busco2,busco3,busco4);


        System.out.println(enlacesWebCadenas.get(1).getCadenaNumero());
        System.out.println(enlacesWebCadenas.get(1).getUrlPaginaWeb());

        //recorrer todas las cadenas

        for (int i = 0; i < enlacesWebCadenas.size(); i++) {

        }
    }

}
