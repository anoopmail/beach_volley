
package com.tavant.beachvolley;

import android.content.Context;

import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.JsonRequest;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.UnsupportedEncodingException;


/**
 * Created by anoop.m on 24 Jul.
 */

public class BeachVolleyRequest<T> extends JsonRequest<T>{
    private final int method;
    private final String url;
    private final String requestBody;
    private final BeachVolleyResponseHandler callback;
    public Method Methods ;

    private final Gson gson = new Gson();
    private Class<T> clazz = null;

    public BeachVolleyRequest(int method, String url, String requestBody, Class<T> clazz, final BeachVolleyResponseHandler callback) {
        super(method, url, requestBody, new Response.Listener<T>() {

            @Override
            public void onResponse(T response) {
                callback.success(response);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                callback.error(error.getMessage());
            }
        });
        this.method         = method;
        this.url            = url;
        this.requestBody    = requestBody;
        this.callback       = callback;
        this.clazz          = clazz ;
    }


    public BeachVolleyRequest(String url, Class<T> clazz, final BeachVolleyResponseHandler callback) {
        this(Method.GET, url, "", clazz, callback ) ;
    }


    @Override
    protected Response<T> parseNetworkResponse(NetworkResponse response) {
        try {
            String json = new String(response.data, HttpHeaderParser.parseCharset(response.headers));
            return Response.success( gson.fromJson(json, clazz), HttpHeaderParser.parseCacheHeaders(response));
        } catch (UnsupportedEncodingException e) {
            return Response.error(new ParseError(e));
        } catch (JsonSyntaxException e) {
            return Response.error(new ParseError(e));
        }
        }

    public void run(Context context){
        BeachVolley.newRequestQueue(context).add(this);
    }
}


