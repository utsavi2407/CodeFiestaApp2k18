package com.example.shree.codefiesta2k18;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Events extends AppCompatActivity {

    ImageView imglc;
    ImageView imggm;
    ImageView imgpd;
    ImageView imgth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        imglc=(ImageView )findViewById(R.id.lc);
        imggm=(ImageView)findViewById(R.id.gm);
        imgpd=(ImageView)findViewById(R.id.pd);
        imgth=(ImageView)findViewById(R.id.th);

        imglc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(), LetsCode.class);
                startActivity(i);
            }
        });

        imggm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(), Entertainment.class);
                startActivity(i);
            }
        });

        imgpd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(), PersonalityDev.class);
                startActivity(i);
            }
        });

        imgth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(), TreasureHunt.class);
                startActivity(i);
            }
        });
    }
}
