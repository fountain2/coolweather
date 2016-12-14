package com.example.coolweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by fountian on 2016/10/30.
 */
public class CoolWeatherOpenHelper extends SQLiteOpenHelper {

    public static final String CREAT_PROVINCE="creat table Province{" +
            "id interger primary key autoincrement," +
            "province_name text," +
            "province_code text}";

    public static final String CREAT_CITY="creat table City{" +
            "id interger primary key autoincrement," +
            "city_name text," +
            "city_code text," +
            "province_id integer}";

    public static final String CREAT_COUNTY="creat table County{" +
            "id interger primary key autoincrement," +
            "county_name text," +
            "county_code text," +
            "city_id integer}";



    public CoolWeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREAT_PROVINCE);
        db.execSQL(CREAT_CITY);
        db.execSQL(CREAT_COUNTY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
