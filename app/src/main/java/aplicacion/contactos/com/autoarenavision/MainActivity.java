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
    private leerUrl ejemplo = new leerUrl();
    private ArrayList<EnlacesWebCadenas> enlacesWebCadenas;
    private ArrayList<ProgramacionArenavision> programacionArenavisions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

        StrictMode.setThreadPolicy(policy);


        // <li class="leaf"><a href=
        // <li class="first leaf"><a href="

        enlacesWebCadenas = new ArrayList<>();
        programacionArenavisions = new ArrayList<>();

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


        ejemplo.buscarTextoPaginaDos(enlacesWebCadenas.get(1).getUrlPaginaWeb(),enlacesWebCadenas,1);

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

        Intent intent;

        switch (v.getId()) {
            case R.id.button1:

                ejemplo.buscarTextoPaginaDos(enlacesWebCadenas.get(1).getUrlPaginaWeb(),enlacesWebCadenas,1);
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(enlacesWebCadenas.get(1).getEnlaceAce()));
                this.startActivity(intent);
                break;

            case R.id.button2:

                ejemplo.buscarTextoPaginaDos(enlacesWebCadenas.get(2).getUrlPaginaWeb(),enlacesWebCadenas,2);
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(enlacesWebCadenas.get(2).getEnlaceAce()));
                this.startActivity(intent);
                break;

            case R.id.button3:

                ejemplo.buscarTextoPaginaDos(enlacesWebCadenas.get(3).getUrlPaginaWeb(),enlacesWebCadenas,3);
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(enlacesWebCadenas.get(3).getEnlaceAce()));
                this.startActivity(intent);
                break;

            case R.id.button4:

                ejemplo.buscarTextoPaginaDos(enlacesWebCadenas.get(4).getUrlPaginaWeb(),enlacesWebCadenas,4);
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(enlacesWebCadenas.get(4).getEnlaceAce()));
                this.startActivity(intent);
                break;

            case R.id.button5:

                ejemplo.buscarTextoPaginaDos(enlacesWebCadenas.get(5).getUrlPaginaWeb(),enlacesWebCadenas,5);
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(enlacesWebCadenas.get(5).getEnlaceAce()));
                this.startActivity(intent);
                break;

            case R.id.button6:

                ejemplo.buscarTextoPaginaDos(enlacesWebCadenas.get(6).getUrlPaginaWeb(),enlacesWebCadenas,6);
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(enlacesWebCadenas.get(6).getEnlaceAce()));
                this.startActivity(intent);
                break;

            case R.id.button7:

                ejemplo.buscarTextoPaginaDos(enlacesWebCadenas.get(7).getUrlPaginaWeb(),enlacesWebCadenas,7);
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(enlacesWebCadenas.get(7).getEnlaceAce()));
                this.startActivity(intent);
                break;

            case R.id.button8:

                ejemplo.buscarTextoPaginaDos(enlacesWebCadenas.get(8).getUrlPaginaWeb(),enlacesWebCadenas,8);
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(enlacesWebCadenas.get(8).getEnlaceAce()));
                this.startActivity(intent);
                break;

            case R.id.button9:

                ejemplo.buscarTextoPaginaDos(enlacesWebCadenas.get(9).getUrlPaginaWeb(),enlacesWebCadenas,9);
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(enlacesWebCadenas.get(9).getEnlaceAce()));
                this.startActivity(intent);
                break;

            case R.id.button10:

                ejemplo.buscarTextoPaginaDos(enlacesWebCadenas.get(10).getUrlPaginaWeb(),enlacesWebCadenas,10);
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(enlacesWebCadenas.get(10).getEnlaceAce()));
                this.startActivity(intent);
                break;

            case R.id.button11:

                ejemplo.buscarTextoPaginaDos(enlacesWebCadenas.get(11).getUrlPaginaWeb(),enlacesWebCadenas,11);
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(enlacesWebCadenas.get(11).getEnlaceAce()));
                this.startActivity(intent);
                break;

            case R.id.button12:

                ejemplo.buscarTextoPaginaDos(enlacesWebCadenas.get(12).getUrlPaginaWeb(),enlacesWebCadenas,12);
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(enlacesWebCadenas.get(12).getEnlaceAce()));
                this.startActivity(intent);
                break;

            case R.id.button13:

                ejemplo.buscarTextoPaginaDos(enlacesWebCadenas.get(13).getUrlPaginaWeb(),enlacesWebCadenas,13);
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(enlacesWebCadenas.get(13).getEnlaceAce()));
                this.startActivity(intent);
                break;

            case R.id.button14:

                ejemplo.buscarTextoPaginaDos(enlacesWebCadenas.get(14).getUrlPaginaWeb(),enlacesWebCadenas,14);
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(enlacesWebCadenas.get(14).getEnlaceAce()));
                this.startActivity(intent);
                break;

            case R.id.button15:

                ejemplo.buscarTextoPaginaDos(enlacesWebCadenas.get(15).getUrlPaginaWeb(),enlacesWebCadenas,15);
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(enlacesWebCadenas.get(15).getEnlaceAce()));
                this.startActivity(intent);
                break;

            case R.id.button16:

                ejemplo.buscarTextoPaginaDos(enlacesWebCadenas.get(16).getUrlPaginaWeb(),enlacesWebCadenas,16);
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(enlacesWebCadenas.get(16).getEnlaceAce()));
                this.startActivity(intent);
                break;

            case R.id.button17:

                ejemplo.buscarTextoPaginaDos(enlacesWebCadenas.get(17).getUrlPaginaWeb(),enlacesWebCadenas,17);
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(enlacesWebCadenas.get(17).getEnlaceAce()));
                this.startActivity(intent);
                break;

            case R.id.button18:

                ejemplo.buscarTextoPaginaDos(enlacesWebCadenas.get(18).getUrlPaginaWeb(),enlacesWebCadenas,18);
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(enlacesWebCadenas.get(18).getEnlaceAce()));
                this.startActivity(intent);
                break;

            case R.id.button19:

                ejemplo.buscarTextoPaginaDos(enlacesWebCadenas.get(19).getUrlPaginaWeb(),enlacesWebCadenas,19);
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(enlacesWebCadenas.get(19).getEnlaceAce()));
                this.startActivity(intent);
                break;

            case R.id.button20:

                ejemplo.buscarTextoPaginaDos(enlacesWebCadenas.get(20).getUrlPaginaWeb(),enlacesWebCadenas,20);
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(enlacesWebCadenas.get(20).getEnlaceAce()));
                this.startActivity(intent);
                break;


        }

        /*// #2 search view in the list
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
        Log.d("TAG", "Button's text is:" + button.getText());*/
    }

}
