package com.wheel.daniel.androidnote.eventbus;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author danielwang
 * @Description:
 * @date 2018/9/3 16:28
 */


@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface InjectView {
    int value();
}
