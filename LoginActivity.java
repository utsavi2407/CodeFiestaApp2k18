package com.example.shree.codefiesta2k18;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class LoginActivity extends AppCompatActivity {

    SQLiteDatabase db;
    SQLiteOpenHelper openHelper;
    Cursor cursor;
    Button _btnLogin;
    Button _btnForgot;
    EditText _txtEmail, _txtPass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        _txtEmail=(EditText)findViewById(R.id.eml);
        _txtPass=(EditText)findViewById(R.id.pass);
        _btnLogin=(Button)findViewById(R.id.lgn);
        _btnForgot=(Button)findViewById(R.id.frgtps);
        openHelper=new DatabaseHelper(this);
        db = openHelper.getReadableDatabase();

        _btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = _txtEmail.getText().toString();
                String pass = _txtPass.getText().toString();
                cursor = db.rawQuery("SELECT *FROM " + DatabaseHelper.TABLE_NAME + " WHERE " + DatabaseHelper.COL_4 + "=? AND " + DatabaseHelper.COL_6 + "=?", new String[]{email, pass});
                if (cursor != null) {
                    if (cursor.getCount() > 0) {
                        Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_SHORT).show();
                        Intent i =new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);
}
                    else {
                        Toast.makeText(getApplicationContext(), "Login error", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });

        _btnForgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(), ForgotPassword.class);
                startActivity(i);
            }
        });

    }
}
