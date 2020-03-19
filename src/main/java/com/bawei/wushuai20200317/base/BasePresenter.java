package com.bawei.wushuai20200317.base;

import android.widget.ImageView;

import java.lang.ref.WeakReference;

public abstract class BasePresenter<V extends ImageView>{
    private WeakReference<V> vWeakReference;;
    public BasePresenter(V view){
        vWeakReference = new WeakReference<>(view);
        initModel();

    }

    protected abstract void initModel();

    public V getView(){
        if (vWeakReference!=null){
            return vWeakReference.get();
        }
        return null;
    }

    public void dechView(){
        if (vWeakReference!=null){
            vWeakReference.clear();
            vWeakReference=null;
        }
    }

}
