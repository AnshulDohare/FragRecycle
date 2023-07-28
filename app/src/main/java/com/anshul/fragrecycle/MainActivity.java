package com.anshul.fragrecycle;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity implements PersonAdapter.itemClicked{
    FragmentManager fragmentManager;
    DetailFragment detailfrag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager=this.getSupportFragmentManager();
        detailfrag = (DetailFragment) fragmentManager.findFragmentById(R.id.DetailFrag);

    }

    @Override
    protected void onStart() {
        super.onStart();
        String name = ApplicationClass.people.get(0).getName();
        String tel = ApplicationClass.people.get(0).getTelNr();
        detailfrag.Change(name,tel);
    }

    @Override
    public void onItemClicked(int index) {
        String name = ApplicationClass.people.get(index).getName();
        String tel = ApplicationClass.people.get(index).getTelNr();
        detailfrag.Change(name,tel);
    }
}