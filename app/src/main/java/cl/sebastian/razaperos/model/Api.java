package cl.sebastian.razaperos.model;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    @GET("breeds/list")
    Call<Raza> getRaza();
   // @GET("breeds/list/")
    //Call<List>Raza>> void getRaza();

}
