package com.hzn.easypath;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    private EasyPathView epv1;
    private EasyPathView epv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // separate
        epv1 = (EasyPathView) findViewById(R.id.view);
        Button btnDraw1 = (Button) findViewById(R.id.btn_draw1);
        btnDraw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (epv1.getState() == EasyPathView.STATE_HIDE)
                    epv1.startDraw();
            }
        });
        Button btnErase1 = (Button) findViewById(R.id.btn_erase1);
        btnErase1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (epv1.getState() == EasyPathView.STATE_SHOW)
                    epv1.startErase();
            }
        });
        SeekBar sb1 = (SeekBar) findViewById(R.id.sb1);
        sb1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                epv1.setAnimProgress(progress / 100.0f);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        // together
        epv2 = (EasyPathView) findViewById(R.id.view2);
        Button btnDraw2 = (Button) findViewById(R.id.btn_draw2);
        btnDraw2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (epv2.getState() == EasyPathView.STATE_HIDE)
                    epv2.startDraw();
            }
        });
        Button btnErase2 = (Button) findViewById(R.id.btn_erase2);
        btnErase2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (epv2.getState() == EasyPathView.STATE_SHOW)
                    epv2.startErase();
            }
        });
        SeekBar sb2 = (SeekBar) findViewById(R.id.sb2);
        sb2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                epv2.setAnimProgress(progress / 100.0f);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
