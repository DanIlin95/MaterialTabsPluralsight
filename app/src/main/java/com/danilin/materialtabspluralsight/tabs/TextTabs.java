package com.danilin.materialtabspluralsight.tabs;

/**
 * Created by danilin on 2/24/17.
 */
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.danilin.materialtabspluralsight.Fragments.FragmentOne;
import com.danilin.materialtabspluralsight.Fragments.FragmentThree;
import com.danilin.materialtabspluralsight.Fragments.FragmentTwo;
import com.danilin.materialtabspluralsight.R;
import com.danilin.materialtabspluralsight.adapters.TextTabsAdapter;

import java.util.ArrayList;
import java.util.List;

public class TextTabs extends AppCompatActivity {

    private List<Fragment> fragmentList = new ArrayList<>();
    private List<String> titleList = new ArrayList<>();
    private ViewPager viewPager ;
    private TextTabsAdapter adapter;
    private TabLayout tabLayout;


    @Override

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_tabs);

        initialise ();


        prepareDateResource();

        adapter = new TextTabsAdapter(getSupportFragmentManager(), fragmentList, titleList);

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
    private void initialise () {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Simple Tabs Example");

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
    }
    private void prepareDateResource() {
        addData(new FragmentOne(), "ONE");
        addData(new FragmentTwo(), "TWO");
        addData(new FragmentThree(), "THREE");



    }
    private void addData(Fragment fragment, String title) {
        fragmentList.add(fragment);
        titleList.add(title);

    }

}
