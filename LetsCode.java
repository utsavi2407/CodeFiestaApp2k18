package com.example.shree.codefiesta2k18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LetsCode extends AppCompatActivity {

    ImageView imgbr;
    ImageView imgbl;
    ImageView imgtw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lets_code);

        imgbr=(ImageView )findViewById(R.id.bctr);
        imgbl=(ImageView)findViewById(R.id.blcd);
        imgtw=(ImageView)findViewById(R.id.twzd);

        imgbr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(), ByteRace.class);
                startActivity(i);
            }
        });

        imgbl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(), BlindCoding.class);
                startActivity(i);
            }
        });

        imgtw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(), TechWizard.class);
                startActivity(i);
            }
        });



    }
}
