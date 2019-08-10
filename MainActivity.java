package com.example.shree.codefiesta2k18;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.signin, menu);

        return super.onCreateOptionsMenu(menu);

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);

        switch (item.getItemId())
        {
            case R.id.signIn:
            {
                Intent i =new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(i);
                return true;
            }

            case R.id.register:
            {
                Intent i =new Intent(getApplicationContext(), Register.class);
                startActivity(i);
                return true;
            }

            default:
                return false;
        }
    }

    Button myProfile;
    Button appDev;
    Button schedule;
    Button team;
    Button sponsor;
    Button social;
    Button events;
    Button rateus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myProfile=(Button)findViewById(R.id.prof);
        myProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(i);
            }
        });

        appDev=(Button)findViewById(R.id.ad);
        appDev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(), AppDev.class);
                startActivity(i);
            }
        });

        schedule=(Button)findViewById(R.id.scd);
        schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(), Schedule.class);
                startActivity(i);
            }
        });

        team=(Button)findViewById(R.id.tm);
        team.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(), Team.class);
                startActivity(i);
            }
        });

        sponsor=(Button)findViewById(R.id.spon);
        sponsor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(), Sponsors.class);
                startActivity(i);
            }
        });

        social=(Button)findViewById(R.id.sc);
        social.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(), Social.class);
                startActivity(i);
            }
        });

        events=(Button)findViewById(R.id.event);
        events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(), Events.class);
                startActivity(i);
            }
        });

        rateus=(Button)findViewById(R.id.rt);
        rateus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(), RateUs.class);
                startActivity(i);
            }
        });




    }


}
