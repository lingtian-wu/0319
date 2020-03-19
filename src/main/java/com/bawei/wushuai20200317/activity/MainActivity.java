package com.bawei.wushuai20200317.activity;


import android.support.v7.widget.GridLayoutManager;
import android.view.View;
import android.widget.ImageView;

import com.bawei.wushuai20200317.MusicAdapter;
import com.bawei.wushuai20200317.R;
import com.bawei.wushuai20200317.base.BaseActivity;
import com.bawei.wushuai20200317.base.BasePresenter;
import com.bawei.wushuai20200317.bean.BaseMusic;
import com.bawei.wushuai20200317.bean.ContentBean;
import com.bawei.wushuai20200317.contract.IListContract;
import com.bawei.wushuai20200317.presenter.IListPresenter;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.stx.xhb.xbanner.XBanner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity implements IListContract.IModel {


    private android.widget.EditText shuru;
    private android.support.v7.widget.RecyclerView shuju;
    private com.stx.xhb.xbanner.XBanner tupian;

    @Override
    public BasePresenter getPresenter() {
        return null;
    }

    @Override
    protected int getLayoutid() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

        shuru = findViewById(R.id.shuru);;
        shuju = findViewById(R.id.shuju);
        tupian = findViewById(R.id.tupian);
    }

    @Override
    protected void initData() {
        String url = "http://blog.zhaoliang5156.cn/baweiapi/searchmusic?kword=欧美金曲榜";

        BasePresenter presenter = getPresenter();
        if (presenter!=null&&presenter instanceof IListPresenter){
            ((IListPresenter) presenter).list(url);
        }
        ArrayList<BaseMusic> list = new ArrayList<>();
        BaseMusic baseMusic = new BaseMusic(R.mipmap.ic_launcher);
        list.add(baseMusic);
        tupian.setData(list,null);
        tupian.setmAdapter(new XBanner.XBannerAdapter() {
            @Override
            public void loadBanner(XBanner banner, View view, int position) {
                Glide.with(MainActivity.this).load(R.mipmap.tu).into((ImageView) view);
            }
        });

    }

    @Override
    public void list(String str, Callack callack) {
        Gson gson = new Gson();
        BaseMusic baseMusic = gson.fromJson(str, BaseMusic.class);
        List<ContentBean> content = baseMusic.getContent();
        GridLayoutManager gridlayout = new GridLayoutManager(this, 2);
        shuju.setLayoutManager(gridlayout);
        MusicAdapter musicAdapter = new MusicAdapter(MainActivity.this, ContentBean.class);
        shuju.setAdapter(musicAdapter);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
