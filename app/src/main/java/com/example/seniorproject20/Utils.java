package com.example.seniorproject20;

import android.content.Context;
import android.util.Log;

import com.google.gson.JsonSyntaxException;

import java.io.IOException;
import java.io.InputStream;
public class Utils {
    //Function for reading JSOn file from assets
    static String getJsonFromAssets(Context context, String fileName) {
        String jsonString;
        try {
            InputStream is = context.getAssets().open(fileName);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            jsonString = new String(buffer, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return jsonString;
    }
//
//    public <T> T fromJson(java.lang.String json, java.lang.Class<T> classOfT)
//            throws JsonSyntaxException;
//    public <T> T fromJson(java.lang.String json,
//                          java.lang.reflect.Type typeOfT)
//            throws JsonSyntaxException

}

