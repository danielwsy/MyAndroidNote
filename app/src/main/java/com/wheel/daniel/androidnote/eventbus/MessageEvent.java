package com.wheel.daniel.androidnote.eventbus;

/**
 * @author danielwang
 * @Description:
 * @date 2018/9/3 16:01
 */
public class MessageEvent {

    private String message;

    public MessageEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
