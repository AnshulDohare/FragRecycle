package com.anshul.fragrecycle;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetailFragment extends Fragment{
    public static TextView tvName,tvTel;
    //LayoutInflater inflater;
    public DetailFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=  inflater.inflate(R.layout.fragment_detail, container, false);
        tvName = v.findViewById(R.id.tvName);
        tvTel = v.findViewById(R.id.tvTel);

        //tvName.setText("Name");
        //tvTel.setText("Telephone Number");
        return v;
    }
    public void Change(String name,String tel){
        tvName.setText(name);
        tvTel.setText(tel);
    }
}