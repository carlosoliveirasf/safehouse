package com.poli.safehouse.safehouse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface WebService {
    String BASE_URL = "http://10.0.3.155:8077/";
    String VALIDAR_LOGIN = "login/";

    @POST(VALIDAR_LOGIN)
    Call<Void> getUser(@Body PedidoAutenticacao pedidoAutenticacao);

    @FormUrlEncoded
    @POST(VALIDAR_LOGIN)
    Call<Void> getlogin(@Field("login") String login, @Field("password") String password);
}
