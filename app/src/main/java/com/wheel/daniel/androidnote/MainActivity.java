package com.wheel.daniel.androidnote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.wheel.daniel.androidnote.eventbus.EventBusActivity;
import com.wheel.daniel.androidnote.eventbus.InjectUtil;
import com.wheel.daniel.androidnote.eventbus.InjectView;
import com.wheel.daniel.androidnote.greendao.GreenDaoActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R2.id.bt_GreenDao)
    Button btGreenDao;

    @BindView(R2.id.bt_event_bus)
    Button btEventBus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        btGreenDao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, GreenDaoActivity.class));
            }
        });


        btEventBus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, EventBusActivity.class));
            }
        });
    }
}
