package com.wheel.daniel.androidnote.eventbus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.wheel.daniel.androidnote.R;
import com.wheel.daniel.androidnote.R2;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author danielwang
 * @Description:
 * @date 2018/9/3 14:18
 */
public class EventBusActivity extends Activity {

    @BindView(R2.id.bt_GreenDao)
    Button bt;

    @BindView(R2.id.tv)
    TextView tv;

    @OnClick(R2.id.bt_GreenDao)
    public void showToast() {
        startActivity(new Intent(this, TestActivity.class));
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_bus);
        EventBus.getDefault().register(this);
        ButterKnife.bind(this);
        tv.setText("hahha");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void Event(MessageEvent messageEvent) {
        tv.setText(messageEvent.getMessage().trim());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
    }
}
