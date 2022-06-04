package com.fizzanasir.learn_and_test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.fizzanasir.learn_and_test.R;
import com.fizzanasir.learn_and_test.learning_list;

import java.util.List;

public class AlphAdaptor extends ArrayAdapter<learning_list> {


    public AlphAdaptor(@NonNull Context context, int resource, @NonNull List<learning_list> list) {
        super(context, resource, list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        learning_list alphabet_list=getItem(position);
        if(convertView==null)
        {
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.alphabet_cell, parent, false);
        }
        TextView tv=convertView.findViewById(R.id.alph);
        ImageView iv=convertView.findViewById(R.id.cellimg);
        tv.setText(alphabet_list.getAlphabet());
        iv.setImageResource(alphabet_list.getImageid());

        return convertView;
    }
}
