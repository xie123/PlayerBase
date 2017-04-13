package com.kk.taurus.playerbase.callback;

import android.content.Context;
import android.view.View;

import com.kk.taurus.playerbase.cover.base.BaseCover;
import com.kk.taurus.playerbase.setting.CoverData;
import com.kk.taurus.playerbase.widget.BasePlayer;

/**
 * Created by Taurus on 2017/3/24.
 */

public interface CoverObserver {
    View initCustomCoverView(Context context);
    void onCoverViewInit(View coverView);
    void onBindCover(BaseCover cover, BasePlayer player);
    void onCoverVisibilityChange(View coverView, int visibility);
    void onDataChange(CoverData data);
}