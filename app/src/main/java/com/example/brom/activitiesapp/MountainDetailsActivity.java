package com.example.brom.activitiesapp;

import android.os.Bundle;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class MountainDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountaindetails);

        Intent myIntent = getIntent();

        /*
        String mName=myIntent.getStringExtra("mName");
        String mHeight=myIntent.getStringExtra("mHeight");
        String mLocation=myIntent.getStringExtra("mLocation");
        */
        String mName=myIntent.getStringExtra("Name");
        String mHeight=myIntent.getStringExtra("Height");
        String mLocation=myIntent.getStringExtra("Location");
        TextView textView1 = (TextView) findViewById(R.id.mHeightID);
        textView1.setText(mName);
        TextView textView2 = (TextView) findViewById(R.id.mHeightID2);
        textView2.setText(mHeight);
        TextView textView3 = (TextView) findViewById(R.id.mHeightID3);
        textView3.setText(mLocation);



        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
@@ -25,6 +41,7 @@ public void onClick(View view) {
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        */
    }

}