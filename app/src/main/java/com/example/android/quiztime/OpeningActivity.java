package com.example.android.quiztime;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.widget.LinearLayout;
import android.widget.TextView;

import static android.webkit.ConsoleMessage.MessageLevel.LOG;

public class OpeningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening);

        //Log.d("ll_val",ll.toString());
        String[] rule_array = getResources().getStringArray(R.array.rule_array);

       for(int i = 0;i<rule_array.length;i++) {
           LinearLayout ll = findViewById(R.id.linear_layout);
           TextView tv = new TextView(this);
           tv.setTextSize(20);
           tv.setPadding(5, 5, 2, 0);
           tv.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
           tv.setText(rule_array[i]);
           ll.addView(tv, i + 1);
       }

    }
}
