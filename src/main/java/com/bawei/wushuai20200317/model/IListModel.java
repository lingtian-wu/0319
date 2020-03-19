package com.bawei.wushuai20200317.model;

import com.bawei.wushuai20200317.contract.IListContract;
import com.bawei.wushuai20200317.volleyutil.VolleyUtil;

public class IListModel implements IListContract.IModel {

    @Override
    public void list(String str, final Callack callack) {
        VolleyUtil.getInstance().doGet(str, new VolleyUtil.CallBack() {
            @Override
            public void onSuccess(String json) {
                callack.listSuccess(json);
            }

            @Override
            public void onFeature(String str) {
                callack.listFeature(str);
            }
        });
    }
}
