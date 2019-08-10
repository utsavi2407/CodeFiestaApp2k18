package com.example.shree.codefiesta2k18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PersonalityDev extends AppCompatActivity {

    Button debate;
    Button pi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality_dev);

        debate=(Button)findViewById(R.id.dbb);
        debate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(), Debate.class);
                startActivity(i);
            }
        });

        pi=(Button)findViewById(R.id.pib);
        pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(), pi.class);
                startActivity(i);
            }
        });

    }




}
