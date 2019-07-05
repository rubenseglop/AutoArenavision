package aplicacion.contactos.com.autoarenavision.Fragments;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import aplicacion.contactos.com.autoarenavision.ProgramacionArenavision;
import aplicacion.contactos.com.autoarenavision.R;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private ArrayList<ProgramacionArenavision> programacionArenavision;

    public MyAdapter(ArrayList<ProgramacionArenavision> programacionArenavision) {
        this.programacionArenavision = programacionArenavision;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.filas_cadenas, parent, false);

        // create ViewHolder

        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;

    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {

        // - get data from your itemsData at this position
        // - replace the contents of the view with that itemsData

        viewHolder.txtdia.setText(programacionArenavision.get(position).getDia());
        viewHolder.txthora.setText(programacionArenavision.get(position).getHora());
        viewHolder.txtdeporte.setText(programacionArenavision.get(position).getDeporte());
        viewHolder.txtcompeticion.setText(programacionArenavision.get(position).getCompeticion());
        viewHolder.txtevento.setText(programacionArenavision.get(position).getEventoPartido());
        viewHolder.txtcadena.setText(programacionArenavision.get(position).getCadenas());
        viewHolder.txtidioma.setText(programacionArenavision.get(position).getIdioma());

    }

    // inner class to hold a reference to each item of RecyclerView
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView txtdia;
        private final TextView txthora;
        private final TextView txtdeporte;
        private final TextView txtcompeticion;
        private final TextView txtevento;
        private final TextView txtcadena;
        private final TextView txtidioma;


//        public TextView txtViewTitle;
//        public ImageView imgViewIcon;

        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            txtdia = (TextView) itemLayoutView.findViewById(R.id.dia);
            txthora = (TextView) itemLayoutView.findViewById(R.id.hora);
            txtdeporte = (TextView) itemLayoutView.findViewById(R.id.deporte);
            txtcompeticion = (TextView) itemLayoutView.findViewById(R.id.competicion);
            txtevento = (TextView) itemLayoutView.findViewById(R.id.evento);
            txtcadena = (TextView) itemLayoutView.findViewById(R.id.cadena);
            txtidioma = (TextView) itemLayoutView.findViewById(R.id.idioma);
        }
    }


    // Return the size of your itemsData (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return programacionArenavision.size();
    }
}