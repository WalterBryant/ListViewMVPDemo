package com.w.mvpdemo.model;

import com.w.mvpdemo.bean.Girl;

import java.util.List;

/**
 * model 还是原来的 model
 */

public interface IGirlModel {
    //也通过回调的方式返回数据
    void loadGirl(GirlOnLoadListener girlOnLoadListener);

    //设置一个回调接口
    interface GirlOnLoadListener {
        void onComplete(List<Girl> list);
    }
}
