package com.bawei.wushuai20200317.presenter;

import android.widget.ImageView;

import com.bawei.wushuai20200317.base.BasePresenter;
import com.bawei.wushuai20200317.contract.IListContract;
import com.bawei.wushuai20200317.model.IListModel;

public class IListPresenter extends BasePresenter implements IListContract.IPresenter {
    private IListModel iListModel;
    public IListPresenter(ImageView view) {
        super(view);
    }

    @Override
    protected void initModel() {
        iListModel = new IListModel();
    }

    @Override
    public void list(String str) {
        iListModel.list(str, new IListContract.IModel.Callack() {
            @Override
            public void listSuccess(String str) {
                ImageView view = getView();
                if (view instanceof IListContract.IView){
                    ((IListContract.IView) view).listSuccess(str);
                }
            }

            @Override
            public void listFeature(String str) {
                ImageView view = getView();
                if (view instanceof IListContract.IView){
                    ((IListContract.IView) view).listFeature(str);
                }
            }
        });
    }
}
