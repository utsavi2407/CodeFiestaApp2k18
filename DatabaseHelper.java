package com.example.shree.codefiesta2k18;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="register_event.db";
    public static final String TABLE_NAME="registration_event";

    public static SQLiteDatabase db;


    public static final String COL_1="FirstName";
    public static final String COL_2="LastName";
    public static final String COL_3="CollegeName";
    public static final String COL_4="Email";
    public static final String COL_5="Phone";
    public static final String COL_6="Password";
    public static final String COL_7="ConfirmPassword";
    public static final String COL_8="ID";
    public static final String COL_9="Hint";
    Cursor c;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT,FirstName TEXT,LastName TEXT,CollegeName TEXT,Email TEXT,Phone TEXT,Password TEXT, ConfirmPassword TEXT, Hint TEXT)");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME); //Drop older table if exists
        onCreate(db);
    }



}
