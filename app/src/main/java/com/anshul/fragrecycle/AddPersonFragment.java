package com.anshul.fragrecycle;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddPersonFragment extends Fragment {
    public AddPersonFragment() {
        // Required empty public constructor
    }

    EditText etName,etTel;
    Button btnAdd;
    ListFragment listFragment;
    FragmentManager fragmentManager;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_add_person, container, false);
        etName = v.findViewById(R.id.etName);
        etTel = v.findViewById(R.id.etTel);
        btnAdd = v.findViewById(R.id.btnAdd);
        fragmentManager = getActivity().getSupportFragmentManager();
        listFragment =(ListFragment) fragmentManager.findFragmentById(R.id.listFrag);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etName.getText().toString().isEmpty()||etTel.getText().toString().isEmpty()){
                    Toast.makeText(getActivity(), "Please Enter All Fields", Toast.LENGTH_SHORT).show();
                }
                else{
                    ApplicationClass.people.add(new Person(etName.getText().toString(),etTel.getText().toString()));
                    Toast.makeText(getActivity(), "Successful", Toast.LENGTH_SHORT).show();
                    etName.setText(null);
                    etTel.setText(null);
                    listFragment.notifyDataChangedd();
                }
            }
        });
        return v;

    }
}