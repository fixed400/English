package com.data_to_server.grd.english.view;

/**
 * Created by adex on 12.04.16.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.data_to_server.grd.english.R;


public class ScreenThree extends Fragment {

    public ScreenThree() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.screen_third, container,
                false);

        return rootView;
    }
}
