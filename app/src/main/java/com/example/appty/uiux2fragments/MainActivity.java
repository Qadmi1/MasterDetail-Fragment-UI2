package com.example.appty.uiux2fragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements DescriptionsListFragment.DescriptionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void itemClicked(long id) {

        View fragmentContainer = findViewById(R.id.fragContainer);

        if (fragmentContainer != null)
        {
            DescriptionsDetailFragment newDetailFrag = new DescriptionsDetailFragment();
            newDetailFrag.setDetailDescID(id);

            android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.fragContainer, newDetailFrag);
            ft.addToBackStack(null);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
        }
        else {
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.DESC, id);
            startActivity(intent);
        }

    }
}
