package com.example.junior.happydinner.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.junior.happydinner.fragments.EstablishmentFragment;
import com.example.junior.happydinner.fragments.MapsFragment;

/**
 * Created by junior on 27/07/16.
 */
public class TabAdapter extends FragmentPagerAdapter{
    private String[] title={"Estabelecimentos","Mapas"};

    public TabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;

        if (position == 0){
            fragment=new EstablishmentFragment();
        }else if (position == 1){
            fragment=new MapsFragment();
        }

        return fragment;

    }

    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];

    }
}
