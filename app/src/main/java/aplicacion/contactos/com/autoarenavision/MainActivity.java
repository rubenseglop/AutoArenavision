package aplicacion.contactos.com.autoarenavision;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView mTextMessage;

    private List<Button> buttons;
    private static final int[] BUTTON_IDS = {
            R.id.button1,
            R.id.button2,
            R.id.button3,
            R.id.button4,
            R.id.button5,
            R.id.button6,
            R.id.button7,
            R.id.button8,
            R.id.button9,
            R.id.button10,
            R.id.button11,
            R.id.button12,
            R.id.button13,
            R.id.button14,
            R.id.button15,
            R.id.button16,
            R.id.button17,
            R.id.button18,
            R.id.button19,
            R.id.button20
    };

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



        final ArrayList<EnlacesWebCadenas> enlacesWebCadenas = new ArrayList<>();
        ArrayList<ProgramacionArenavision> programacionArenavisions = new ArrayList<>();

        String busco1 = "<li class=\"leaf\"><a href=";
        String busco2 = "<li class=\"first leaf\"><a href=";
        String busco3 = "</tr><tr><td class=\"auto-style3\">";
        String busco4 = "<td class=\"auto-style3\">";

        ejemplo.buscarTextoPagina("http://arenavision.us/guide",enlacesWebCadenas,programacionArenavisions,busco1,busco2,busco3,busco4);


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




        // actualizar los botones con la informacion del partido (de hoy)


        buttons = new ArrayList<Button>(BUTTON_IDS.length);
        int position = 0; // for #4
        for(int id : BUTTON_IDS) {
            Button button = (Button)findViewById(id);
            button.setOnClickListener(this); // maybe
            button.setTag(position++); // for #4
            buttons.add(button);
        }
    }

    @Override
    public void onClick(View v) {
        // #1 switch directly based on id
        switch (v.getId()) {
            case R.id.button1:
                Log.d("TAG", "Pressed button one.");
                break;
            case R.id.button2:
                Log.d("TAG", "Pressed button two.");
                break;

        }

        // #2 search view in the list
        int positionViaTheList = buttons.indexOf(v);

        // #3 same result as above, search id in the array
        int position = -1;
        for (int i = 0; i < BUTTON_IDS.length; i++) {
            if (BUTTON_IDS[i] == v.getId()) {
                position = i;
                break;
            }
        }
        if (position >= 0)
            Log.d("TAG", "Pressed the " + (position + 1) + "th button.");
        else
            Log.d("TAG", "Not pressed any button from my list."); // won't happen in this example

        // #4 use tags:
        Integer positionFromTag = (Integer) v.getTag();

        // button's text:
        Button button = (Button) v; // safe to cast since we know that all views are actually buttons.
        Log.d("TAG", "Button's text is:" + button.getText());
    }

}
