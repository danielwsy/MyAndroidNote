package com.wheel.daniel.androidnote.eventbus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;

import com.wheel.daniel.androidnote.R;
import com.wheel.daniel.androidnote.R2;

import org.greenrobot.eventbus.EventBus;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author danielwang
 * @Description:
 * @date 2018/9/3 16:08
 */
public class TestActivity extends Activity {

    @BindView(R2.id.bt_back)
    Button bt;

    @OnClick(R2.id.bt_back)
    public void showToast() {
        EventBus.getDefault().post(new MessageEvent("欢迎大家浏览我写的博客"));
        finish();
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        ButterKnife.bind(this);
    }
}
