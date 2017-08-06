package com.hzn.easypath;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;

import com.hzn.lib.EasyPathView;

public class RepeatActivity extends FragmentActivity {

    private EasyPathView epv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repeat);
        initViews();
    }

    private void initViews() {
        epv = (EasyPathView) findViewById(R.id.view);

        Button btnRepeat = (Button) findViewById(R.id.btn_repeat);
        btnRepeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                epv.startDraw(true);
            }
        });

        Button btnStop = (Button) findViewById(R.id.btn_stop);
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                epv.stopRepeat();
            }
        });
    }
}
