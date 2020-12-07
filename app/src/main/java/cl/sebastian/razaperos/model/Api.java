package cl.sebastian.razaperos.model;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Api {
    @GET("breeds/list/")
    Call<Raza> getRaza();

}
