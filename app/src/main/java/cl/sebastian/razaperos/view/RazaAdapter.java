package cl.sebastian.razaperos.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cl.sebastian.razaperos.R;
import cl.sebastian.razaperos.model.Raza;
import cl.sebastian.razaperos.model.Repositorio;

public class RazaAdapter extends RecyclerView.Adapter<RazaAdapter.RazaVH> {

    private final List<Raza> razas;




    public RazaAdapter(List<Raza> razas) {
        this.razas = razas;
    }


    @NonNull
    @Override
    public RazaAdapter.RazaVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_perros, parent, false);
        return new RazaVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RazaAdapter.RazaVH holder, int position) {
    Raza raza = razas.get(position);
    holder.Bind(raza);

    }

    @Override
    public int getItemCount() {
        return razas.size();
    }

    public class RazaVH extends RecyclerView.ViewHolder {
        private TextView tvList;
        public RazaVH(@NonNull View itemView) {
            super(itemView);
            tvList= itemView.findViewById(R.id.tvList);
        }

        public void Bind(Raza r) {
            tvList.setText(r.getStatus());

        }


    }
}
