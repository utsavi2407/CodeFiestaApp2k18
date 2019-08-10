package com.example.shree.codefiesta2k18;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class AppDev extends AppCompatActivity {

    ImageView imguk;
    ImageView imgsk;
    ImageView imgssk;
    ImageView imgsp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_dev);

        imguk=(ImageView )findViewById(R.id.utsavi);
        imgsk=(ImageView)findViewById(R.id.shefali);
        imgssk=(ImageView )findViewById(R.id.snehal);
        imgsp=(ImageView)findViewById(R.id.surendra);


        imguk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.instagram.com/utsavi.2407";
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });

        imgsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.instagram.com/shefali.kulkarni.39";
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });
        imgssk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.instagram.com/snehal_.099";
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });

        imgsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.instagram.com/surendras.pathak";
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });
    }
}
