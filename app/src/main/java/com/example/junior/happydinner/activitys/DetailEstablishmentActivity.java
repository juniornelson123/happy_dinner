package com.example.junior.happydinner.activitys;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.junior.happydinner.R;

public class DetailEstablishmentActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private CollapsingToolbarLayout cToolbar;
    private AppBarLayout appBarLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_establishment);

        toolbar=(Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Restaurante");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        appBarLayout=(AppBarLayout) findViewById(R.id.app_bar);
        cToolbar=(CollapsingToolbarLayout) findViewById(R.id.colapse);
        cToolbar.setContentScrimColor(getResources().getColor(R.color.colorPrimaryDark));
        cToolbar.setCollapsedTitleTextColor(getResources().getColor(android.R.color.white));
    }
}
