package com.poli.safehouse.safehouse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface WebService {
    String BASE_URL = "http://10.0.3.155:8077/";
    String VALIDAR_LOGIN = "user/login";

    @POST(VALIDAR_LOGIN)
    Call<Void> getUser(@Body PedidoAutenticacao pedidoAutenticacao);

    @GET(VALIDAR_LOGIN)
    Call<Void> getlogin(@Query("login") String login, @Query("password") String password);
}
