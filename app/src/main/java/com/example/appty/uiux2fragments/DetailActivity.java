package com.example.appty.uiux2fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by appty on 02/04/18.
 */

public class DetailActivity extends AppCompatActivity {

    public static final String DESC = "id";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.detail_activity);

        DescriptionsDetailFragment newDetailFrag = (DescriptionsDetailFragment)getSupportFragmentManager().findFragmentById(R.id.detailFragment);

        int descID = (int)getIntent().getExtras().getLong(DESC);

        newDetailFrag.setDetailDescID(descID);

    }
}
