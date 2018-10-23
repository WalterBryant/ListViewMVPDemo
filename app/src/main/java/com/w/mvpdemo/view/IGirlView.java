package com.w.mvpdemo.view;

import com.w.mvpdemo.bean.Girl;

import java.util.List;

/**
 * 所有的UI逻辑
 */

public interface IGirlView {
    /**
     * 显示listview 中的数据（用回调）
     *
     * @param girls
     */
    void showGirls(List<Girl> girls);
}
