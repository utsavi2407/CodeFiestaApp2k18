package com.example.shree.codefiesta2k18;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    SQLiteOpenHelper openHelper;
    SQLiteDatabase db;
    Button bt_reg;
    EditText txtfname, txtlname, txtclgnam, txtpass, txtconfpass, txteml, txtmob, txtsechint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        openHelper=new DatabaseHelper(this);
        bt_reg=(Button)findViewById(R.id.reg2);
        txtfname = (EditText)findViewById(R.id.fname2);
        txtlname = (EditText)findViewById(R.id.lname2);
        txtpass = (EditText)findViewById(R.id.pass2);
        txteml = (EditText)findViewById(R.id.eml2);
        txtmob = (EditText)findViewById(R.id.mob2);
        txtconfpass = (EditText)findViewById(R.id.confpass2);
        txtclgnam = (EditText)findViewById(R.id.clgname2);
        txtsechint=(EditText)findViewById(R.id.security);

        bt_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db = openHelper.getWritableDatabase();
                String fname=txtfname.getText().toString();
                String lname=txtlname.getText().toString();
                String pass=txtpass.getText().toString();
                String confpass=txtconfpass.getText().toString();
                String clgnam=txtclgnam.getText().toString();
                String email=txteml.getText().toString();
                String phone=txtmob.getText().toString();
                String hint=txtsechint.getText().toString();

                if(pass.equals(confpass)==true) {
                    insertdata(fname, lname, pass, email, phone, confpass, clgnam, hint);
                    Toast.makeText(getApplicationContext(), "Registered Successfully", Toast.LENGTH_LONG).show();
                }
                else
                    Toast.makeText(getApplicationContext(), "Unsuccessful Kindly refill the form", Toast.LENGTH_LONG).show();
            }

        public void insertdata(String fname, String lname, String pass, String email, String phone, String confpass, String clgnm, String hint){
            ContentValues contentValues = new ContentValues();
            contentValues.put(DatabaseHelper.COL_1, fname);
            contentValues.put(DatabaseHelper.COL_2, lname);
            contentValues.put(DatabaseHelper.COL_3, clgnm);
            contentValues.put(DatabaseHelper.COL_4, email);
            contentValues.put(DatabaseHelper.COL_5, phone);
            contentValues.put(DatabaseHelper.COL_6, pass);
            contentValues.put(DatabaseHelper.COL_7, confpass);
            contentValues.put(DatabaseHelper.COL_9, hint);
            long id = db.insert(DatabaseHelper.TABLE_NAME, null, contentValues);
        }
    });

}
}
