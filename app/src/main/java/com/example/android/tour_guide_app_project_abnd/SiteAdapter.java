package com.example.android.tour_guide_app_project_abnd;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mikem on 3/7/2017.
 */

public class SiteAdapter extends ArrayAdapter<Site> {

    public SiteAdapter(Activity context, ArrayList<Site> siteInfo) {
        super(context, 0, siteInfo);
    }

    @Override
    public View getView(int postion, View convertView, ViewGroup parent) {
        View siteItemView = convertView;
        if (siteItemView == null) {
            siteItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_site, parent, false);
        }

        // get the current set of words
        Site site = getItem(postion);

        // get the textview  that will have the the site's name
        TextView siteName = (TextView) siteItemView.findViewById(R.id.site_name_view);

        // set the text in the site's name view
        siteName.setText(site.getSiteName());

        // get the textview that will have the site's address
        TextView siteAddress = (TextView) siteItemView.findViewById(R.id.site_address_view);

        // set the text in the site's address view
        siteAddress.setText(site.getSiteAddress());

        // set image if available
        ImageView imageView = (ImageView) siteItemView.findViewById(R.id.siteImage);

        if (site.HasImage()) {
            imageView.setImageResource(site.getImageResourceId());
        } else {
            imageView.setVisibility(View.GONE);
        }

        return siteItemView;
    }
}
