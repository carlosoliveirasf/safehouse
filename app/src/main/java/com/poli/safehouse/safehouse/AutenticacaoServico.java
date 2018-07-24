package com.poli.safehouse.safehouse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AutenticacaoServico {
    private final Retrofit retrofit;

    public AutenticacaoServico() {
        Gson gson = new GsonBuilder().registerTypeAdapter(Date.class, new DateDeserializer()).create();

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .readTimeout(15, TimeUnit.SECONDS)
                .connectTimeout(15, TimeUnit.SECONDS)
                .writeTimeout(15, TimeUnit.SECONDS)
                .build();

        retrofit = new Retrofit.Builder()
                .baseUrl(WebService.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(okHttpClient)
                .build();
    }

    public void callAutenticacao(Callback<Void> callback, PedidoAutenticacao pedidoAutenticacao) {
        WebService webService = retrofit.create(WebService.class);
        Call<Void> call = webService.getUser(pedidoAutenticacao);
        call.enqueue(callback);
    }
}