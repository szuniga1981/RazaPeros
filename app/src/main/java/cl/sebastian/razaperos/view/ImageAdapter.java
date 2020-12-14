package cl.sebastian.razaperos.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import cl.sebastian.razaperos.R;
import cl.sebastian.razaperos.model.Image;
import cl.sebastian.razaperos.model.Repositorio;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageVH> {
    private final List<String> imagebreed;



    public ImageAdapter(List<String> imagebreed) {
        this.imagebreed = imagebreed;
    }

    @NonNull
    @Override
    public ImageVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_perros,parent,false);
        return new ImageVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageVH holder, int position) {
    String image=imagebreed.get(position);
    holder.bind(image);
    }

    @Override
    public int getItemCount() {
        return imagebreed.size();
    }

    public class ImageVH extends RecyclerView.ViewHolder {
        private ImageView imgbreed;
        private Context context;
        public ImageVH(@NonNull View itemView) {

            super(itemView);
            context=itemView.getContext();
            imgbreed=itemView.findViewById(R.id.imageView);
        }

        public void bind(String i) {
            Glide.with(context).load(i).into(imgbreed);
        }

    }
}
