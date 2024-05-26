package com.example.sample_retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface RecepiApi {


    @GET("search/?page=2&query=beef carrot potato onion")
    Call<RecipeSearchResult> getRecipeSearchResult(@Header("Authorization") String ath);

}
