package com.bawei.wushuai20200317;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class CustomSerchView extends LinearLayout {

    public CustomSerchView(Context context) {
        super(context);
    }

    public CustomSerchView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomSerchView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustomSerchView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


}
