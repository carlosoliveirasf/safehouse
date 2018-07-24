package com.poli.safehouse.safehouse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface WebService {
    String BASE_URL = "http://192.168.0.111:8077/";
    String VALIDAR_LOGIN = "login/";

    @POST(VALIDAR_LOGIN)
    Call<Void> getUser(@Body PedidoAutenticacao pedidoAutenticacao);

    @POST(VALIDAR_LOGIN)
    Call<Void> getlogin(@Body String login, String password);
}
