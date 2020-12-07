package cl.sebastian.razaperos.model;

import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Repositorio {

    private static final String TAG = "Repositorio";

    public void loadinfo(){
    RetrofitClient.getRetrofitInstance().getRaza().enqueue(new Callback<Raza>() {
        @Override
        public void onResponse(Call<Raza> call, Response<Raza> response) {
            Log.d(TAG, "onResponse: "+ response.body());
        }

        @Override
        public void onFailure(Call<Raza> call, Throwable t) {
            Log.d(TAG, "onFailure: "+ t.toString());

        }
    });
}

}
