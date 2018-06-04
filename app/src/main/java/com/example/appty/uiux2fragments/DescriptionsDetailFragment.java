package com.example.appty.uiux2fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by appty on 02/04/18.
 */

public class DescriptionsDetailFragment extends Fragment {

    private long detailDescID;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState != null)
        {
            detailDescID = savedInstanceState.getLong("detail");
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_description_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();

        Descriptions descriptions = Descriptions.descriptionArray[(int)detailDescID];
        if (view != null)
        {
            TextView name = view.findViewById(R.id.textView);
            TextView desc = view.findViewById(R.id.textView2);
            ImageView img = view.findViewById(R.id.img);

            name.setText(descriptions.getName());
            desc.setText(descriptions.getDesc());
            img.setImageResource(descriptions.getImg());
            img.setContentDescription(descriptions.getName());

        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putLong("detail", detailDescID);
    }

    public void setDetailDescID( long id)
    {
        this.detailDescID = id;
    }

}
