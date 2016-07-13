package com.androidcourse.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.androidcourse.R;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<String> {


    public CustomAdapter(Context context, int resource, List<String> dataSet) {
        super(context, resource, dataSet);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.item_layout, parent, false);

        TextView textView = (TextView) rowView.findViewById(R.id.textCustom);
        textView.setText(getItem(position));
        return rowView;

    }
}
