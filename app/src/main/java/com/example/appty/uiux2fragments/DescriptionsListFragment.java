package com.example.appty.uiux2fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by appty on 02/04/18.
 */

public class DescriptionsListFragment extends ListFragment {

    interface DescriptionListener {
        void itemClicked(long id);
    }

    private DescriptionListener listener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        String[] listTitles = new String[Descriptions.descriptionArray.length];

        for (int i = 0; i < listTitles.length; i++) {
            listTitles[i] = Descriptions.descriptionArray[i].getName();
        }

        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(inflater.getContext(), android.R.layout.simple_list_item_1, listTitles);

        setListAdapter(adapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if (context instanceof DescriptionListener) {
            listener = (DescriptionListener) context;
        } else {
            throw new RuntimeException(context.toString() + "must implement listener");
        }
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        if ( listener != null)
        {
            listener.itemClicked(id);
        }
    }
}
