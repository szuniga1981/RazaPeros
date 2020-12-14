package cl.sebastian.razaperos.model;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Api {
    @GET("breeds/list")
    Call<Raza> getRaza();
   // @GET("breeds/list/")
    //Call<List>Raza>> void getRaza();

    @GET("breed/{breed}/images/")
    Call <Image> getImageDetails(@Path("breed") String breed);

    ;
}
