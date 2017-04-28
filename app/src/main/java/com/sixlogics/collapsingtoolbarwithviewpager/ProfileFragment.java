package com.sixlogics.collapsingtoolbarwithviewpager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by adeel.turk on 28/04/2017.
 */

public class ProfileFragment extends Fragment {




    private ViewPager viewPager;
    private TabLayout tabLayout;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.profile_fragment,null);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        viewPager = (ViewPager) view.findViewById(R.id.viewpager);
        tabLayout = (TabLayout) view.findViewById(R.id.tabs);

        setupViewPager(viewPager);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }




    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getChildFragmentManager());
        adapter.addFragment(new EmptyFragment(), "");
        adapter.addFragment(new EmptyFragment(), "");
        adapter.addFragment(new EmptyFragment(), "");

        adapter.addFragment(new EmptyFragment(), "");
        adapter.addFragment(new EmptyFragment(), "");
        adapter.addFragment(new EmptyFragment(), "");
        adapter.addFragment(new EmptyFragment(), "");
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);

        /*tabLayout.addOnTabSelectedListener(this);*/


        addNewViewToTab("Profile",0);
        addNewViewToTab("Photos",1);
        addNewViewToTab("Videos",2);
        addNewViewToTab("ETC1",3);
        addNewViewToTab("ETC2",4);
        addNewViewToTab("ETC3",5);
        addNewViewToTab("ETC4",6);

    }



    public void addNewViewToTab(String menuname,int tabNumber){


        View customTabView=LayoutInflater.from(getActivity().getApplicationContext()).inflate(R.layout.custom_tab_view,null);
        TextView menuName=(TextView)customTabView.findViewById(R.id.menuName);


        menuName.setText(menuname);
        tabLayout.getTabAt(tabNumber).setCustomView(customTabView);

    }



}
