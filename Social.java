package com.example.shree.codefiesta2k18;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Social extends AppCompatActivity {

    ImageView imginsta;
    ImageView imgfb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social);

        imginsta=(ImageView)findViewById(R.id.insta);
        imgfb=(ImageView)findViewById(R.id.fb);

        imginsta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://instagram.com/code_fiesta_2018?utm_source=ig_profile_share&igshid=1wb43dyy4sqdh";
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });

        imgfb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.facebook.com/codefiesta2k18/";
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });


    }
}
