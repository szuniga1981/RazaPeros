package cl.sebastian.razaperos.view;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import cl.sebastian.razaperos.R;
import cl.sebastian.razaperos.model.Raza;

public class RazaAdapter extends RecyclerView.Adapter<RazaAdapter.RazaVH> {


    private static final String TAG ="Raza adapter" ;
    private final List<String> razas;








    public RazaAdapter(List<String> razas) {
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
        Log.d(TAG, "onBindViewHolder: "+razas.get(position));
    String raza = razas.get(position);
    holder.bind(raza);

    }

    @Override
    public int getItemCount() {
        return razas.size();
    }

    public void update(List<String> listaPerros) {
        razas.clear();
        razas.addAll(listaPerros);
        notifyDataSetChanged();
    }

    public class RazaVH extends RecyclerView.ViewHolder {
        private TextView tvList; //crea la vista
       // private ImageView imgBreed;
        //private Context context;
        public RazaVH(@NonNull View itemView) {

            super(itemView);


            tvList= itemView.findViewById(R.id.tvList);//inicialzar la vista
           // imgBreed=itemView.findViewById(R.id.imageView);
            //context=itemView.getContext();
        }

        public void bind(String r) {
            Log.d(TAG, "bind: "+r);

            tvList.setText(r);
           // Glide.with(context).load(r);

        }


    }
}
