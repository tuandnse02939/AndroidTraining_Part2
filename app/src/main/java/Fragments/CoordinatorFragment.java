package Fragments;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import Adapter.SampleFragmentPagerAdapter;
import tuandn.com.androidtraining_part2.R;

/**
 * Created by Anh Trung on 7/9/2015.
 */
public class CoordinatorFragment extends Fragment {
    private static final String TAG = "MyActivity";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.coordinator_1, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        Toolbar toolbar = (Toolbar) getView().findViewById(R.id.toolbar);
        TabLayout tabLayout = (TabLayout) getView().findViewById(R.id.tabs);
        ViewPager viewPager = (ViewPager) getView().findViewById(R.id.viewpager);
        viewPager.setAdapter(new SampleFragmentPagerAdapter(getActivity().getSupportFragmentManager(),
                getActivity()));
        tabLayout.setupWithViewPager(viewPager);
        super.onActivityCreated(savedInstanceState);
    }

}