package Adapter;

import android.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anh Trung on 7/7/2015.
 */
public class SeasonAdapter extends FragmentPagerAdapter {
    private final List<String> mFragmentTitles = new ArrayList<>();

    public SeasonAdapter(android.support.v4.app.FragmentManager fm) {
        super(fm);
    }



    @Override
    public Fragment getItem(int position) {
        return null;
    }

    public void addFragment(Fragment fragment, String title) {
        mFragmentTitles.add(title);
    }


    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitles.get(position);
    }
}