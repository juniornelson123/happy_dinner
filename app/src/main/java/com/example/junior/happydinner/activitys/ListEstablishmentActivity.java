package com.example.junior.happydinner.activitys;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.junior.happydinner.R;
import com.example.junior.happydinner.adapter.TabAdapter;

public class ListEstablishmentActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_establishment);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("Estabelecimentos");
        toolbar.setTitleTextColor(getResources().getColor(android.R.color.white));
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TabAdapter tabAdapter=new TabAdapter(getSupportFragmentManager());
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        viewPager.setAdapter(tabAdapter);
        tabLayout=(TabLayout) findViewById(R.id.tab);
       // tabLayout.setTabTextColors(getResources().getColor(android.R.color.white),getResources().getColor(R.color.accent));
        tabLayout.setupWithViewPager(viewPager);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
