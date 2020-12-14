package cl.sebastian.razaperos.model;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.Path;

public class Repositorio {

    private static final String TAG = "Repositorio";

    public void setPr(PresenterRepositorio pr) {
        this.pr = pr;
    }

    private PresenterRepositorio pr;

    public void loadinfo() {
        RetrofitClient.getRetrofitInstance().getRaza().enqueue(new Callback<Raza>() {
            @Override
            public void onResponse(Call<Raza> call, Response<Raza> response) {
                Log.d(TAG, "onResponse: " + response.body());
                List<String> listaPerros = new ArrayList<>();
                listaPerros.addAll(response.body().getMessage());

                pr.showInfo(listaPerros);
            }

            @Override
            public void onFailure(Call<Raza> call, Throwable t) {
                Log.d(TAG, "onFailure: " + t.toString());

            }
        });


    }
    public void loadInfoImage(String breed){

        RetrofitClient.getRetrofitInstance().getImageDetails(breed).enqueue(new Callback<Image>() {
            @Override
            public void onResponse(Call<Image> call, Response<Image> response) {
                Log.d(TAG, "onResponse:loadInfoImage "+response.body());

                //List<String> listaIamgenes = new ArrayList<>();

            }

            @Override
            public void onFailure(Call<Image> call, Throwable t) {
                Log.d(TAG, "onFailure:loadInfoImage "+t.toString());

            }
        });
    }



}
