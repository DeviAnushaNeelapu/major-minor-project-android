package com.example.majorproject;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ItemAdapter  extends
        FragmentPagerAdapter {

    private Context mContext;

    public ItemAdapter(TabLayoutdesign tabLayoutdesign, FragmentManager supportFragmentManager) {

        super(supportFragmentManager);
        mContext=tabLayoutdesign;
    }


   /* public ItemAdapter(@NonNull FragmentManager fm, Context cc) {
        super(fm);
        this.mContext = cc;
    }*/



    @NonNull
    @Override
    public Fragment getItem(int position)
    {
        if(position == 0){
            return new Restaurant();
        }
        else if(position == 1){
            return new Temples();
        }
        else if(position == 2){
            return new Parks();
        }
        else {
            return new Tourism();
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0)
        {
            return mContext.getString(R.string.restaurant);
        }
        else if(position == 1){
            return mContext.getString(R.string.temples);

        }
        else if(position == 2){
            return mContext.getString(R.string.parks);

        }
        else if(position==3) {
            return mContext.getString(R.string.tourism);
        }
        return null;
    }
}
