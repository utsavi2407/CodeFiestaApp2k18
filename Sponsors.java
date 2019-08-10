package com.example.shree.codefiesta2k18;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Sponsors extends AppCompatActivity {

    ImageView imgsw;
    ImageView imgpb;
    ImageView imgtcs;
    ImageView imgbtw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sponsors);

        imgsw=(ImageView)findViewById(R.id.swiggy);
        imgpb=(ImageView)findViewById(R.id.paperboat);
        imgtcs=(ImageView)findViewById(R.id.tcs);
        imgbtw=(ImageView)findViewById(R.id.bitwise);

        imgsw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.swiggy.com/?utm_source=Google-Sok&utm_medium=CPC&utm_campaign=google_web_desktop_order_rmretention_search_pune_brand_rlsa_transacted&gclid=Cj0KCQjw6fvdBRCbARIsABGZ-vSv2izc3TVv50yamxlXw2Y4PYBAEjFUwS9ucMwahBgL-1aNDPzzU30aAv6PEALw_wcB";
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });

        imgpb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://warehousebizongo.wordpress.com/2016/12/05/analysis-of-paperboat-packaging/\n";
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });

        imgtcs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://careers.tcs.com/EForms/configuredHtml/2030/56971/login.html?instanceId=1#1@IID@Home/\n";
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });

        imgbtw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.bitwiseglobal.com/";
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });

    }
}
