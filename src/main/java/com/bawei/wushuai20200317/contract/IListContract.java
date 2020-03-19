package com.bawei.wushuai20200317.contract;

import com.bawei.wushuai20200317.base.IBaseView;

public interface IListContract {
    interface IView extends IBaseView{
        void listSuccess(String str);
        void listFeature(String str);
    }

    interface IModel{
        void list(String str,Callack callack);
        interface Callack{
            void listSuccess(String str);
            void listFeature(String str);
        }
    }

    interface IPresenter{
        void list(String str);
    }
}
