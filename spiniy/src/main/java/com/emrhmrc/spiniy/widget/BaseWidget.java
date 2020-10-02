package com.emrhmrc.spiniy.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;

/**
 * Created by hamurcuabi on 02,October,2020
 **/
public abstract class BaseWidget extends FrameLayout {

    public BaseWidget(@NonNull Context context) {
        super(context);
        initView(context);
    }

    public BaseWidget(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView(context, attrs);
    }

    public BaseWidget(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context, attrs);
    }

    public BaseWidget(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initView(context, attrs);
    }

    public abstract void initView(Context context);

    public abstract void initView(Context context, AttributeSet attrs);
}