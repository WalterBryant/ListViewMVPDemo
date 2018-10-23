package com.w.mvpdemo.presenter;

import com.w.mvpdemo.MainActivity;
import com.w.mvpdemo.bean.Girl;
import com.w.mvpdemo.model.IGirlModel;
import com.w.mvpdemo.model.IGirlModelImpl;
import com.w.mvpdemo.view.IGirlView;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * 所有的业务逻辑操作都在表示层完成
 */

public class GirlPresenter<T extends IGirlView> {
    //1.view 层的引用
    WeakReference<T> mView;
    //2.model 层的引用
    IGirlModel iGirlModel = new IGirlModelImpl();

    public GirlPresenter(MainActivity view) {
        this.mView = new WeakReference<T>((T) view);
    }

    //3.执行UI逻辑操作
    public void fetch() {
        if (mView.get() != null && iGirlModel != null) {
            iGirlModel.loadGirl(new IGirlModel.GirlOnLoadListener() {
                @Override
                public void onComplete(List<Girl> list) {
                    mView.get().showGirls(list);
                }
            });
        }
    }
}
