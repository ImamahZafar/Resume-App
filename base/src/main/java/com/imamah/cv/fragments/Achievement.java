package com.imamah.cv.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.imamah.cv.adapters.AchievementAdapter;
import com.imamah.cv.adapters.EducationAdapter;
import com.imamah.cv.base.R;
import com.imamah.cv.model.DemoItem;

import java.util.ArrayList;
import java.util.List;


public class Achievement extends Fragment {

    public Achievement() {
        // Required empty public constructor
    }


    public static Achievement newInstance() {
        Achievement fragment = new Achievement();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_achievement, container, false);
        RecyclerView recyclerViewDemo = view.findViewById(R.id.recyclerViewDemo4);
        recyclerViewDemo.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerViewDemo.setAdapter(new AchievementAdapter(feedItems(),getContext()));
        return view;
    }



    private List<DemoItem> feedItems() {

        String Titles = "Achievement Section" ;
        List<DemoItem> demoItems = new ArrayList<>();
        DemoItem demoItem = new DemoItem(Titles);
        demoItems.add(demoItem);
        return demoItems;
    }
}
