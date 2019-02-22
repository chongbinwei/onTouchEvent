package com.example.administrator.ontouchevent;


import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by chongbinwei on 2017/3/21.
 */

public class MyLinearLayout extends LinearLayout {

    private static final String str = "LinearLayout";

    public MyLinearLayout(Context context) {
        super(context);
    }

    public MyLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /*
     * 分发触摸事件的方法，当这个 ViewGroup 能够接收到触摸事件的时候，
     * 这个方法首先被调用，用于分发接收到的触摸事件，父类方法默认返回 false
     */
    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.i(str, "dispatchTouchEvent");
        return super.dispatchTouchEvent(event);
    }

    /*
     * 重写父类的拦截触摸事件方法，，ViewGroup 独有的方法，
     * 如果返回值为 true，那么这个触摸事件由这个 ViewGroup 处理，
     * 会调用 onTouchEvent 方法，并且拦截触摸事件，不让子 View 接收到。
     */
    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        super.onInterceptTouchEvent(event);
        Log.i(str, "onInterceptTouchEvent");
        return false;
    }

    /*
     * 如果接收到的触摸事件由这个 View/ViewGroup 处理，那么调用这个方法用于处理这个触摸事件
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        super.onTouchEvent(event);
        Log.i(str, "onTouchEvent");
        return false;
    }
}
