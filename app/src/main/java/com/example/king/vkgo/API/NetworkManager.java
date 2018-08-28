package com.example.king.vkgo.API;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by KING on 14.12.2017.
 */

public class NetworkManager {
    private OkHttpClient mOkHttpClient;
    private ApiService mApiService;
    private SharedPreferences mSharedPreferences;


    public NetworkManager(final String token) {
        mOkHttpClient = new OkHttpClient().newBuilder().addNetworkInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                HttpUrl originalUrl = chain.request().url();
                HttpUrl url = originalUrl.newBuilder()
                        .addQueryParameter("access_token", token)
                        .addQueryParameter("v", "5.69")
                        .build();
                Request.Builder reBuilder = chain.request().newBuilder().url(url);
                Request request = reBuilder.build();
                Log.d("URL", url.toString());
                return chain.proceed(request);
            }
        }).build();


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.vk.com/method/")
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .client(mOkHttpClient)
                .build();
        mApiService = retrofit.create(ApiService.class);
    }

    public ApiService getmApiService(){
        return mApiService;
    }

}
