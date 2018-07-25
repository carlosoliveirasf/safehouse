package com.poli.safehouse.safehouse.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.poli.safehouse.safehouse.LoginService;
import com.poli.safehouse.safehouse.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    private Button bt_login;
    private EditText login;
    private EditText senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        bt_login = findViewById(R.id.bt_login);
        bt_login.setOnClickListener(this);
        login = findViewById(R.id.loginUser);
        senha = findViewById(R.id.passwordUser);
    }

    @Override
    public void onClick(View view) {
        String loginText = login.getText().toString();
        String passwordText = senha.getText().toString();

        if(!(loginText.isEmpty() && passwordText.isEmpty())){
            LoginService loginService = new LoginService();
            loginService.callAutenticacao(new Callback<Void>() {
                @Override
                public void onResponse(Call<Void> call, Response<Void> response) {
                    if(response.isSuccessful()){
                        Log.i("onResponse", "Success");
                    }else{
                        Log.i("onResponse",response.message());
                    }
                }

                @Override
                public void onFailure(Call<Void> call, Throwable t) {
                    Log.i("onFailure", t.getMessage());
                }
            }, loginText, passwordText);
        }
    }
}
