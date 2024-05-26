package com.example.sample_retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private Gson gson;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gson = new Gson();
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://food2fork.ca/api/recipe/").addConverterFactory(GsonConverterFactory.create()).build();

        RecepiApi recepiApi = retrofit.create(RecepiApi.class);

        recepiApi.getRecipeSearchResult("Token 9c8b06d329136da358c2d00e76946b0111ce2c48").enqueue(new Callback<RecipeSearchResult>() {
            @Override
            public void onResponse(Call<RecipeSearchResult> call, Response<RecipeSearchResult> response) {

                Log.i(TAG, "onResponse: " + response.body());
                RecipeSearchResult recipeSearchResult = gson.fromJson(String.valueOf(response.body()), RecipeSearchResult.class);

                for (int i = 0; i < recipeSearchResult.getResults().size(); i++) {
                    Log.i(TAG, "onResponse: recepie title : " + recipeSearchResult.getResults().get(i).getTitle());

                }


            }

            @Override
            public void onFailure(Call<RecipeSearchResult> call, Throwable throwable) {

                Log.i(TAG, "onResponse: " + throwable);
            }
        });
    }
}