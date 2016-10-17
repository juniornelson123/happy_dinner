package com.example.junior.happydinner.activitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.example.junior.happydinner.R;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    private TextView all;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=(Toolbar) findViewById(R.id.toolbar_main);
        toolbar.setTitle("Happy Dinner");
        toolbar.setTitleTextColor(getResources().getColor(android.R.color.white));

        all=(TextView) findViewById(R.id.all);
        all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ListEstablishmentActivity.class));
            }
        });
    }
}
