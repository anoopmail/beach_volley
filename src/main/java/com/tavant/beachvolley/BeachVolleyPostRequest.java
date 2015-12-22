
package com.tavant.beachvolley;

import android.content.Context;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.JsonRequest;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by anoop.m on 22 Dec.
 */

public class BeachVolleyPostRequest<T> extends BeachVolleyRequest<T>{
    public BeachVolleyPostRequest(String url, Object requestObject, Class<T> clazz, final BeachVolleyResponseHandler callback) {
        super(Method.POST, url, new Gson().toJson(requestObject), clazz, callback ) ;
    }
}


