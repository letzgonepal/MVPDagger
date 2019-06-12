package com.technosales.net.mvpdagger.network;

import android.content.Context;
import android.util.Log;

import com.androidquery.AQuery;
import com.androidquery.callback.AjaxCallback;
import com.androidquery.callback.AjaxStatus;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class LoginApiParse {
    private Context context;

    public LoginApiParse(Context context) {
        this.context = context;
    }

    public void Login(final String username, final String password) {
        AQuery aQuery = new AQuery(context);
        Map<String, Object> params = new HashMap<>();
        params.put("username", username);
        params.put("password", password);
            aQuery.ajax("http://202.52.240.148:84/attendance_api/public/api/login", params, JSONObject.class, new AjaxCallback<JSONObject>() {
                @Override
                public void callback(String url, JSONObject object, AjaxStatus status) {
                    super.callback(url, object, status);
                    Log.i("LoginToken",object+"");
                    if (object != null) {
                        boolean error = object.optBoolean("error");
                        if (!error) {
                            JSONObject dataObj = object.optJSONObject("data");
                            String token = dataObj.optString("token");

                            JSONObject departmentObj = dataObj.optJSONObject("department");
                            String dep_id = departmentObj.optString("DeptID");
                            String DeptName = departmentObj.optString("DeptName");
                            String supdeptid = departmentObj.optString("supdeptid");

                           Log.i("LoginToken",token);

                        }
                    }


                }
            });



    }


}
