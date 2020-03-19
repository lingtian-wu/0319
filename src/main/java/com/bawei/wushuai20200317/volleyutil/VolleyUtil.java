package com.bawei.wushuai20200317.volleyutil;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bawei.wushuai20200317.base.App;

import java.util.Map;

public class VolleyUtil {
    private RequestQueue requestQueue;
    public VolleyUtil(){
        requestQueue = Volley.newRequestQueue(App.getAppContext());
    }

    private static class Sing{
        private final static VolleyUtil INSENT = new VolleyUtil();
    }

    public static VolleyUtil getInstance(){
        return Sing.INSENT;
    }

    public void doGet(String url, final CallBack callBack){
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        callBack.onSuccess(response);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                callBack.onFeature(error.getMessage());
            }
        });
        requestQueue.add(stringRequest);
    }

    public void doPost(String url, final Map<String,String> map, final CallBack callBack){
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        callBack.onSuccess(response);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                callBack.onFeature(error.getMessage());
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                return map;
            }
        };
        requestQueue.add(stringRequest);
    }

    public interface CallBack{
        void onSuccess(String json);
        void onFeature(String str);
    }
}
