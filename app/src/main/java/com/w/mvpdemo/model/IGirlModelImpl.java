package com.w.mvpdemo.model;

import com.w.mvpdemo.R;
import com.w.mvpdemo.bean.Girl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jp on 2018/10/22.
 */

public class IGirlModelImpl implements IGirlModel {

    @Override
    public void loadGirl(GirlOnLoadListener girlOnLoadListener) {
        List<Girl> data = new ArrayList<Girl>();
        data.add(new Girl(R.mipmap.f1, "*****", "123潮流女个性字母印花无袖露脐上衣"));
        data.add(new Girl(R.mipmap.f2, "231412星", "迷依诗诺夏天新款韩版女装性感夜店欧美风字母印花牛仔露脐背心上衣"));
        data.add(new Girl(R.mipmap.f3, "五颗星", "迷依诗诺春夏欧美新款性感女装单排扣牛仔背心露脐上衣"));
        data.add(new Girl(R.mipmap.f4, "三颗星", "美莉丹 新款欧美单排扣牛仔背心露脐上衣"));
        data.add(new Girl(R.mipmap.f5, "五颗星", "夏季新款韩版时尚个性字母无袖露脐上衣"));
        data.add(new Girl(R.mipmap.f6, "三颗星", "新款欧美单排扣牛仔背心露脐上衣"));
        data.add(new Girl(R.mipmap.f7, "四颗星", "夏装新款下摆波浪边挂脖露肩"));
        data.add(new Girl(R.mipmap.f8, "五颗星", "夏天新款欧美时尚潮流休闲百"));
        data.add(new Girl(R.mipmap.f9, "四颗星", "迷依诗诺夏季新款小香风甜美性感夜"));
        data.add(new Girl(R.mipmap.f10, "三颗星", "安巴克夏季新款韩版时尚套"));
        girlOnLoadListener.onComplete(data);
    }
}
