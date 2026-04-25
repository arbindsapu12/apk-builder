package com.example.webtoapk;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView t = new TextView(this);
        t.setText("APP STARTED");
        setContentView(t);
    }
}
