package com.sixlogics.collapsingtoolbarwithviewpager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sixlogics.collapsingtoolbarwithviewpager.adapter.SampleDataRecyclerAdapter;

/**
 * Created by adeel.turk on 28/04/2017.
 */

public class EmptyFragment extends Fragment {



    private RecyclerView recyclerView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.empty_fragment,null);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView=(RecyclerView)view.findViewById(R.id.datalistView);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        SampleDataRecyclerAdapter adapter=new SampleDataRecyclerAdapter(this);

        recyclerView.setAdapter(adapter);

    }








}
