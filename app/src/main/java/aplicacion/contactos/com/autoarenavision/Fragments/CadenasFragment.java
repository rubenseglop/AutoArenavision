package aplicacion.contactos.com.autoarenavision.Fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import aplicacion.contactos.com.autoarenavision.MainActivity;
import aplicacion.contactos.com.autoarenavision.R;

public class CadenasFragment extends Fragment implements View.OnClickListener {

    private List<Button> buttons;
    private static final int[] BUTTON_IDS = {
            R.id.button1, R.id.button2, R.id.button3,
            R.id.button4, R.id.button5, R.id.button6,
            R.id.button7, R.id.button8, R.id.button9,
            R.id.button10, R.id.button11, R.id.button12,
            R.id.button13, R.id.button14, R.id.button15,
            R.id.button16, R.id.button17, R.id.button18,
            R.id.button19, R.id.button20
    };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cadenas, container, false);


        buttons = new ArrayList<Button>(BUTTON_IDS.length);
        int position = 0; // for #4


        view = inflater.inflate(R.layout.fragment_cadenas, container, false);
        view.findViewById(R.id.home).setOnClickListener(this);


        for (int id : BUTTON_IDS) {
            Button button = (Button) view.findViewById(id);
            button.setOnClickListener(this); // maybe
            button.setTag(position++); // for #4
            buttons.add(button);
        }
        return view;
    }

    @Override
    public void onClick(View v) {
        // #1 switch directly based on id

        Intent intent;

        switch (v.getId()) {
            case R.id.button1:

                MainActivity.ejemplo.buscarTextoPaginaDos(MainActivity.enlacesWebCadenas.get(1).getUrlPaginaWeb(), MainActivity.enlacesWebCadenas, 1);
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(MainActivity.enlacesWebCadenas.get(1).getEnlaceAce()));
                this.startActivity(intent);
                break;

            case R.id.button2:

                MainActivity.ejemplo.buscarTextoPaginaDos(MainActivity.enlacesWebCadenas.get(2).getUrlPaginaWeb(), MainActivity.enlacesWebCadenas, 2);
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(MainActivity.enlacesWebCadenas.get(2).getEnlaceAce()));
                this.startActivity(intent);
                break;

            case R.id.button3:

                MainActivity.ejemplo.buscarTextoPaginaDos(MainActivity.enlacesWebCadenas.get(3).getUrlPaginaWeb(), MainActivity.enlacesWebCadenas, 3);
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(MainActivity.enlacesWebCadenas.get(3).getEnlaceAce()));
                this.startActivity(intent);
                break;

            case R.id.button4:

                MainActivity.ejemplo.buscarTextoPaginaDos(MainActivity.enlacesWebCadenas.get(4).getUrlPaginaWeb(), MainActivity.enlacesWebCadenas, 4);
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(MainActivity.enlacesWebCadenas.get(4).getEnlaceAce()));
                this.startActivity(intent);
                break;

            case R.id.button5:

                MainActivity.ejemplo.buscarTextoPaginaDos(MainActivity.enlacesWebCadenas.get(5).getUrlPaginaWeb(), MainActivity.enlacesWebCadenas, 5);
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(MainActivity.enlacesWebCadenas.get(5).getEnlaceAce()));
                this.startActivity(intent);
                break;

            case R.id.button6:

                MainActivity.ejemplo.buscarTextoPaginaDos(MainActivity.enlacesWebCadenas.get(6).getUrlPaginaWeb(), MainActivity.enlacesWebCadenas, 6);
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(MainActivity.enlacesWebCadenas.get(6).getEnlaceAce()));
                this.startActivity(intent);
                break;

            case R.id.button7:

                MainActivity.ejemplo.buscarTextoPaginaDos(MainActivity.enlacesWebCadenas.get(7).getUrlPaginaWeb(), MainActivity.enlacesWebCadenas, 7);
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(MainActivity.enlacesWebCadenas.get(7).getEnlaceAce()));
                this.startActivity(intent);
                break;

            case R.id.button8:

                MainActivity.ejemplo.buscarTextoPaginaDos(MainActivity.enlacesWebCadenas.get(8).getUrlPaginaWeb(), MainActivity.enlacesWebCadenas, 8);
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(MainActivity.enlacesWebCadenas.get(8).getEnlaceAce()));
                this.startActivity(intent);
                break;

            case R.id.button9:

                MainActivity.ejemplo.buscarTextoPaginaDos(MainActivity.enlacesWebCadenas.get(9).getUrlPaginaWeb(), MainActivity.enlacesWebCadenas, 9);
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(MainActivity.enlacesWebCadenas.get(9).getEnlaceAce()));
                this.startActivity(intent);
                break;

            case R.id.button10:

                MainActivity.ejemplo.buscarTextoPaginaDos(MainActivity.enlacesWebCadenas.get(10).getUrlPaginaWeb(), MainActivity.enlacesWebCadenas, 10);
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(MainActivity.enlacesWebCadenas.get(10).getEnlaceAce()));
                this.startActivity(intent);
                break;

            case R.id.button11:

                MainActivity.ejemplo.buscarTextoPaginaDos(MainActivity.enlacesWebCadenas.get(11).getUrlPaginaWeb(), MainActivity.enlacesWebCadenas, 11);
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(MainActivity.enlacesWebCadenas.get(11).getEnlaceAce()));
                this.startActivity(intent);
                break;

            case R.id.button12:

                MainActivity.ejemplo.buscarTextoPaginaDos(MainActivity.enlacesWebCadenas.get(12).getUrlPaginaWeb(), MainActivity.enlacesWebCadenas, 12);
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(MainActivity.enlacesWebCadenas.get(12).getEnlaceAce()));
                this.startActivity(intent);
                break;

            case R.id.button13:

                MainActivity.ejemplo.buscarTextoPaginaDos(MainActivity.enlacesWebCadenas.get(13).getUrlPaginaWeb(), MainActivity.enlacesWebCadenas, 13);
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(MainActivity.enlacesWebCadenas.get(13).getEnlaceAce()));
                this.startActivity(intent);
                break;

            case R.id.button14:

                MainActivity.ejemplo.buscarTextoPaginaDos(MainActivity.enlacesWebCadenas.get(14).getUrlPaginaWeb(), MainActivity.enlacesWebCadenas, 14);
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(MainActivity.enlacesWebCadenas.get(14).getEnlaceAce()));
                this.startActivity(intent);
                break;

            case R.id.button15:

                MainActivity.ejemplo.buscarTextoPaginaDos(MainActivity.enlacesWebCadenas.get(15).getUrlPaginaWeb(), MainActivity.enlacesWebCadenas, 15);
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(MainActivity.enlacesWebCadenas.get(15).getEnlaceAce()));
                this.startActivity(intent);
                break;

            case R.id.button16:

                MainActivity.ejemplo.buscarTextoPaginaDos(MainActivity.enlacesWebCadenas.get(16).getUrlPaginaWeb(), MainActivity.enlacesWebCadenas, 16);
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(MainActivity.enlacesWebCadenas.get(16).getEnlaceAce()));
                this.startActivity(intent);
                break;

            case R.id.button17:

                MainActivity.ejemplo.buscarTextoPaginaDos(MainActivity.enlacesWebCadenas.get(17).getUrlPaginaWeb(), MainActivity.enlacesWebCadenas, 17);
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(MainActivity.enlacesWebCadenas.get(17).getEnlaceAce()));
                this.startActivity(intent);
                break;

            case R.id.button18:

                MainActivity.ejemplo.buscarTextoPaginaDos(MainActivity.enlacesWebCadenas.get(18).getUrlPaginaWeb(), MainActivity.enlacesWebCadenas, 18);
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(MainActivity.enlacesWebCadenas.get(18).getEnlaceAce()));
                this.startActivity(intent);
                break;

            case R.id.button19:

                MainActivity.ejemplo.buscarTextoPaginaDos(MainActivity.enlacesWebCadenas.get(19).getUrlPaginaWeb(), MainActivity.enlacesWebCadenas, 19);
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(MainActivity.enlacesWebCadenas.get(19).getEnlaceAce()));
                this.startActivity(intent);
                break;

            case R.id.button20:

                MainActivity.ejemplo.buscarTextoPaginaDos(MainActivity.enlacesWebCadenas.get(20).getUrlPaginaWeb(), MainActivity.enlacesWebCadenas, 20);
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(MainActivity.enlacesWebCadenas.get(20).getEnlaceAce()));
                this.startActivity(intent);
                break;
        }
    }
}



