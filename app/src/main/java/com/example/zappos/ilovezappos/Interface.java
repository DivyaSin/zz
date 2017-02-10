package com.example.zappos.ilovezappos;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by divyasingh on 2/6/17.
 */

public interface Interface {
    String key = "b743e26728e16b81da139182bb2094357c31d331";
    @GET("/Search")
    Call<Product> listProducts(@Query("term") String term, @Query("key") String key);
}
