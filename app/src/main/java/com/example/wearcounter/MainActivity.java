package com.example.wearcounter;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends WearableActivity {

    private TextView mTextView;
    private String myCount;
    private int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.text);

        num = Integer.valueOf((mTextView.getText().toString()));

        // Enables Always-on
        setAmbientEnabled();
    }

    public void add(View view) {

        num++;
        mTextView.setText(""+num);


    }
}