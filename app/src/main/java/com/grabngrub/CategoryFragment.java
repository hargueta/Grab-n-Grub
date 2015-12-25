package com.grabngrub;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.Arrays;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryFragment extends Fragment {

    private RecyclerView categoriesRecyclerView;


    public CategoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_category, container, false);

        String[] testList = {"First", "Second", "Third", "Fourth", "Fifth",
                "First", "Second", "Third", "Fourth", "Fifth",
                "First", "Second", "Third", "Fourth", "Fifth",
                "First", "Second", "Third", "Fourth", "Fifth"};

        List<String> list = Arrays.asList(testList);

        CategoriesAdapter recyclerAdapter = new CategoriesAdapter(getActivity(), list);

        categoriesRecyclerView = (RecyclerView) rootView.findViewById(R.id.categories_recycler_view);

        categoriesRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        categoriesRecyclerView.setAdapter(recyclerAdapter);

        return rootView;
    }

}
