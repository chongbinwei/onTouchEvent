package com.example.administrator.ontouchevent;


import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * Created by chongbinwei on 2017/3/21.
 */

public class MyView extends Button {

    private static final String str = "MyView";

    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /*
     * 分发触摸事件的方法，当这个 View 接收到触摸事件的时候，
     * 这个方法首先被调用，用于分发接收到的触摸事件，父类的方法默认返回 false
     */
    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.i(str, "dispatchTouchEvent");
        return super.dispatchTouchEvent(event);
    }

    /*
     * 因为这已经是一个 View，因此它是触摸事件处理的最底层，如果触摸事件能够传递给它，
     * 那么它的 onTouchEvent 方法一定会被调用
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) { // 重写父类的处理触摸事件的方法
        super.onTouchEvent(event);
        Log.i(str, "onTouchEvent");
        return false;
    }
}
