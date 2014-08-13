package org.omnirom.music.app.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.omnirom.music.api.echonest.EchoNest;
import org.omnirom.music.app.MainActivity;
import org.omnirom.music.app.R;

/**
 * Created by Guigui on 11/08/2014.
 */
public class AutomixFragment extends Fragment {

    private EchoNest mEchoNest;

    public AutomixFragment() {

    }

    public static AutomixFragment newInstance() {
        return new AutomixFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_automix, container, false);
        mEchoNest = new EchoNest();
        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MainActivity) activity).onSectionAttached(MainActivity.SECTION_AUTOMIX);
    }
}