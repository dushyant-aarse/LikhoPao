package com.code_as_da.android.likhopao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AboutUs extends AppCompatActivity {

    TextView name, sub, creators;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        name = (TextView) findViewById(R.id.name);
        sub = (TextView) findViewById(R.id.sub);
        creators = (TextView) findViewById(R.id.creators);
    }
}
