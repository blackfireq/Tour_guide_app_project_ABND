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


public class PizzaFragment extends Fragment {

    public PizzaFragment() {
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
        siteInfo.add(new Site("Johns of Bleecker Street", "278 Bleecker Street"));
        siteInfo.add(new Site("Motorino", "139 Broadway"));
        siteInfo.add(new Site("Paulie Gees", "60 Greenpoint Avenue"));
        siteInfo.add(new Site("Speedy Romeo", "376 Classon Avenue"));
        siteInfo.add(new Site("Robertas", "261 Moore Street"));

        // Create an {@link SiteAdapter}, whose data source is a list of {@link site}s. The
        // adapter knows how to create list items for each item in the list.
        SiteAdapter adapter = new SiteAdapter(getActivity(), siteInfo);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // site_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Site} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}
