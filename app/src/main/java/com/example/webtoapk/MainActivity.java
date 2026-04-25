package com.example.webtoapk;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.View;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View v = new View(this);
        v.setBackgroundColor(Color.GREEN);
        setContentView(v);
    }
}
