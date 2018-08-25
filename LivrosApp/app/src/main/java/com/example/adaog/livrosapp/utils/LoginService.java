package com.example.adaog.livrosapp.utils;

import android.util.Log;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.example.adaog.livrosapp.domain.HttpHelper;

public class LoginService {
    private static String url = "http://livrowebservices.com.br/rest/login";

    public static String login(String login, String senha) throws IOException {


        Map<String,String> params = new HashMap<>();
        params.put("login",login);
        params.put("senha",senha);
        String json = HttpHelper.postForm(url,params);

        Log.d("up",json);

        return json;


    }
}