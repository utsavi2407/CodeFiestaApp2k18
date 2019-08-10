package com.example.shree.codefiesta2k18;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ForgotPassword extends AppCompatActivity {

    SQLiteDatabase db;
    SQLiteOpenHelper openHelper;
    Cursor cursor;

    Button ok;
    Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        final EditText security = ( EditText ) findViewById(R.id.securityhint_edt);
        final TextView getpass = ( TextView ) findViewById(R.id.textView3);
        Button ok = ( Button ) findViewById(R.id.getpassword_btn);
        Button cancel = ( Button ) findViewById(R.id.cancel_btn);
        openHelper = new DatabaseHelper(this);
        db = openHelper.getReadableDatabase();





        ok.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                String sec = security.getText().toString();

                if (sec.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please enter your security hint", Toast.LENGTH_SHORT).show();
                }
                else {
                    String storedPassword = getAllTags(sec);
                    if (storedPassword == null) {
                        Toast.makeText(getApplicationContext(), "Please enter correct securityhint", Toast.LENGTH_SHORT).show();
                    } else {
                        Log.d("GET PASSWORD", storedPassword);
                        getpass.setText(storedPassword);
                    }
                }
            }

            public String getAllTags(String a) {


                Cursor c = db.rawQuery("SELECT * FROM " + DatabaseHelper.TABLE_NAME + " where " + DatabaseHelper.COL_9 + "='" +a + "'" , null);
                String str = null;
                if (c.moveToFirst()) {
                    do {
                        str = c.getString(c.getColumnIndex(DatabaseHelper.COL_6));
                    } while (c.moveToNext());
                }
                return str;
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(i);
            }
        });
    }


}

