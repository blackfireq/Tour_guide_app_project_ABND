package com.example.android.tour_guide_app_project_abnd;

/**
 * Created by mikem on 3/7/2017.
 */

public class Site {

    private int mSiteName;
    private int mSiteAddress;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Site (int siteName, int siteAddress){
        mSiteName = siteName;
        mSiteAddress = siteAddress;
    }

    public Site (int siteName, int siteAddress, int imageResourceId){
        mSiteName = siteName;
        mSiteAddress = siteAddress;
        mImageResourceId = imageResourceId;
    }

    public int getSiteName(){
        return mSiteName;
    }

    public int getSiteAddress(){
        return mSiteAddress;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

    public boolean HasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}
