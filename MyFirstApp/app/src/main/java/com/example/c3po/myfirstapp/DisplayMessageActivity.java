package com.example.c3po.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


         /* My code starts here */
        Intent intent = getIntent();  // Getting intent
        String message = intent.getStringExtra(MyActivity.EXTRA_MESSAGE); // Getting string message

        TextView textView = new TextView(this); // Creating texView
        textView.setTextSize(40); // Setting fontSize
        textView.setText(message); // Setting message
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.content); // Creating layout and set it content
        layout.addView(textView); // Adding content

    }
}
