package aplicacion.contactos.com.autoarenavision.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import aplicacion.contactos.com.autoarenavision.MainActivity;
import aplicacion.contactos.com.autoarenavision.R;

public class ProgramacionFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_programacion, container, false);
/*


        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.reciclerprogramacion);


        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        MyAdapter mAdapter = new MyAdapter(MainActivity.programacionArenavisions);

        recyclerView.setAdapter(mAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
*/



        // Obtener el Recycler para el adatapdor DMAdapter
        RecyclerView recyclerdomicilio = view.findViewById(R.id.reciclerprogramacion);
        recyclerdomicilio.setHasFixedSize(true);
        // Usar un administrador para LinearLayout
        // LayoutManager mide y posiciona las vistas de elementos dentro de un RecyclerView
        RecyclerView.LayoutManager lManagerDom = new LinearLayoutManager(getActivity());
        recyclerdomicilio.setLayoutManager(lManagerDom);
        // Crear un nuevo adaptador
        MyAdapter mAdapter = new MyAdapter(MainActivity.programacionArenavisions);
        recyclerdomicilio.setAdapter(mAdapter);


        return view;
    }

}



