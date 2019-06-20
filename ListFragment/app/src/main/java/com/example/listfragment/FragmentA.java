package com.example.listfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentA extends Fragment {
    ListView lv;

    SearchView searchView;
    ArrayAdapter<String> adapter;
    String[] times = {"Grêmio", "Internacional", "Juventude", "Cruzeiro", "Santos",};
    public FragmentA() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_a, container, false);
        lv = (ListView) view.findViewById(R.id.idListView);
        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, times);
        lv.setAdapter(adapter);
        return view;
    }

}
