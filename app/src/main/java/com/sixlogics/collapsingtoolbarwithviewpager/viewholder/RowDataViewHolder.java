package com.sixlogics.collapsingtoolbarwithviewpager.viewholder;

import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by adeel.turk on 28/04/2017.
 */

public class RowDataViewHolder extends RecyclerView.ViewHolder {


    private Fragment fragment;

    public RowDataViewHolder(Fragment fragment,View itemView) {
        super(itemView);

        this.fragment=fragment;
    }



    public void invalidate(){


    }
}
