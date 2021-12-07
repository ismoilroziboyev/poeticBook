package uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.service;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.models.Chapter;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.models.Mark;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.models.Poet;

public class MySharedPreferences {
    public static MySharedPreferences mySharedPreferences = new MySharedPreferences();
    private static SharedPreferences sharedPreferences;
    private static SharedPreferences.Editor editor;
    private static Gson gson;
    private static String FILE_NAME = "hamidovUsmonxon";

    public static MySharedPreferences getInstance(Context context) {

        if (sharedPreferences == null) {
            sharedPreferences = context.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
            editor = sharedPreferences.edit();
            gson = new Gson();
        }

        return mySharedPreferences;
    }

    public void putLikedPoets(List<Poet> poetList) {
        editor.putString("likedPoets", gson.toJson(poetList)).commit();
    }

    public List<Poet> getLikedPoetsList() {
        String likedPoetsString = sharedPreferences.getString("likedPoets", "");

        List<Poet> likedPoetsList;

        if (likedPoetsString.equals("")) {
            likedPoetsList = new ArrayList<>();
        } else {
            Type type = new TypeToken<List<Poet>>() {
            }.getType();

            likedPoetsList = gson.fromJson(likedPoetsString, type);
        }

        return likedPoetsList;
    }

}



