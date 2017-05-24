package com.abhijeetdeshmukh.android.internshiprmrc.info;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;

import com.abhijeetdeshmukh.android.internshiprmrc.R;


/*** Created by ABHIJEET on 23-05-2017.*/

public class BeforeFragment extends Fragment{

    TextView mTextView ;

    public BeforeFragment () {
        //Requires empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_text, container, false);

        // insert <code></code>
        TextView textView = (TextView) rootView.findViewById(R.id.textView);
        textView.setText(getString(R.string.before_childbirth));

        return rootView;
    }
}
