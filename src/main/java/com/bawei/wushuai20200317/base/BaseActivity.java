package com.bawei.wushuai20200317.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity  implements IBaseView{
    private P presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutid());
        initView();
        initData();
        presenter = getPresenter();
    }
    public abstract P getPresenter();
    protected abstract int getLayoutid();
    protected abstract void initView();
    protected abstract void initData();
}
