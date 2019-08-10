package com.example.shree.codefiesta2k18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Entertainment extends AppCompatActivity {

    ImageView imgssk;
    ImageView imgpubg;
    ImageView imgcs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment);

        imgssk=(ImageView )findViewById(R.id.ssk);
        imgpubg=(ImageView)findViewById(R.id.pubg);
        imgcs=(ImageView)findViewById(R.id.cs);

        imgssk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(), SabseSmartKoun.class);
                startActivity(i);
            }
        });

        imgpubg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(), Pubg.class);
                startActivity(i);
            }
        });

        imgcs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(), CounterStrike.class);
                startActivity(i);
            }
        });

    }
}
