package com.example.android.tour_guide_app_project_abnd;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class LandMarkFragment extends Fragment {

    public LandMarkFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.site_list, container, false);

        //create list of site info
        final ArrayList<Site> siteInfo = new ArrayList<Site>();
        siteInfo.add(new Site(R.string.landmark_one_name,R.string.landmark_one_address));
        siteInfo.add(new Site(R.string.landmark_two_name,R.string.landmark_two_address));
        siteInfo.add(new Site(R.string.landmark_three_name,R.string.landmark_three_address));
        siteInfo.add(new Site(R.string.landmark_four_name,R.string.landmark_four_address));
        siteInfo.add(new Site(R.string.landmark_five_name,R.string.landmark_five_address));

        // Create an {@link SiteAdapter}, whose data source is a list of {@link site}s. The
        // adapter knows how to create list items for each item in the list.
        SiteAdapter adapter = new SiteAdapter(getActivity(), siteInfo);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // site_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SiteAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Site} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}
