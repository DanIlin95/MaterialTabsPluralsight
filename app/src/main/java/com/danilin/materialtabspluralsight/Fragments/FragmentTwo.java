package com.danilin.materialtabspluralsight.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.danilin.materialtabspluralsight.R;

/**
 * Created by danilin on 2/24/17.
 */

public class FragmentTwo extends Fragment {
    public FragmentTwo() {
        Log.i("Fragment", "Fragment One Created");
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_two, container, false);
    }
}