package com.asis.gl.week7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RealMain extends AppCompatActivity {

    TextView txtInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real_main);

        txtInfo = (TextView)findViewById(R.id.activityInfo);
        Intent intent = getIntent();
        String str = intent.getStringExtra("uName");
        int rnd = intent.getIntExtra("randomNumber",-1);

        txtInfo.setText(str.toString() + rnd);
    }
}
