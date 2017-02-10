package com.example.zappos.ilovezappos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.zappos.ilovezappos.Interface.key;

public class MainActivity extends AppCompatActivity {

    String BASE_URL = "https://api.zappos.com";
    String item = "nike";
    private RecyclerView recyclerView;
    private List<Results> data;
    private DataAdapter adapter;

    public MainActivity() throws IOException {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();}

    private void initViews() {
        recyclerView = (RecyclerView) findViewById(R.id.card_recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        loadJSON();
    }

    private void loadJSON() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Interface request = retrofit.create(Interface.class);
        Call<Product> call = request.listProducts(item, key);
        call.enqueue(new Callback<Product>() {
            @Override
            public void onResponse(Call<Product> call, Response<Product> response) {
                System.out.print(response);
                List<Results> jsonResponse = response.body().getResults();
//                data = new List<>(Arrays.asList(jsonResponse));
                adapter = new DataAdapter(getApplicationContext(), jsonResponse);
                recyclerView.setAdapter(adapter);
            }
            @Override
            public void onFailure(Call<Product> call, Throwable t) {
                Log.d("Error", t.getMessage());
            }
        });
    }
}




