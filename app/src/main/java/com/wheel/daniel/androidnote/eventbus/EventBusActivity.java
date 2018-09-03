package com.wheel.daniel.androidnote.eventbus;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.wheel.daniel.androidnote.R;

/**
 * @author danielwang
 * @Description:
 * @date 2018/9/3 14:18
 */
public class EventBusActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_bus);
    }
}
