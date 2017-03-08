package com.example.android.tour_guide_app_project_abnd;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by mikem on 3/8/2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    //integer to count number of tabs
    int tabCount;

    private String tabTitles[] = new String[] { "Comedy Clubs", "Landmarks", "Parks", "Pizza" };

    public CategoryAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        //Initializing tab count
        this.tabCount= tabCount;
    }


    //Overriding method getItem
    @Override
    public Fragment getItem(int position) {
        //Returning the current tabs
        switch (position) {
            case 0:
                ComedyFragment comedyFragment = new ComedyFragment();
                return comedyFragment;
            case 1:
                LandMarkFragment landMarkFragment = new LandMarkFragment();
                return landMarkFragment;
            case 2:
                ParkFragment parkFragment = new ParkFragment();
                return parkFragment;
            case 3:
                PizzaFragment pizzaFragment = new PizzaFragment();
                return pizzaFragment;
            default:
                return null;
        }
    }

    //Overriden method getCount to get the number of tabs
    @Override
    public int getCount() {
        return tabCount;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
