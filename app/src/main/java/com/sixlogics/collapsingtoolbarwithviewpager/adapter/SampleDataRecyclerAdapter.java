package com.sixlogics.collapsingtoolbarwithviewpager.adapter;

import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sixlogics.collapsingtoolbarwithviewpager.R;
import com.sixlogics.collapsingtoolbarwithviewpager.viewholder.RowDataViewHolder;

import java.util.ArrayList;

/**
 * Created by adeel.turk on 18/04/2017.
 */

public class SampleDataRecyclerAdapter extends RecyclerView.Adapter {


    private Fragment fragment;




    public SampleDataRecyclerAdapter(Fragment fragment){

        this.fragment=fragment;
    }




    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_data,parent,false);

        return new RowDataViewHolder(fragment,view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {


        ((RowDataViewHolder)holder).invalidate();

    }

    @Override
    public int getItemCount() {
        return 10;
    }




}
