package com.ss.android.ugc.aweme.live.alphaplayer.multi_player;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.IMonitor;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;

/* JADX INFO: loaded from: classes21.dex */
public interface IMultiPlayerController extends IPlayerController {
    void attachBackgroundAlphaView(ViewGroup viewGroup);

    void detachBackgroundAlphaView(ViewGroup viewGroup);

    View getBackgroundView();

    void setBackgroundMonitor(IMonitor iMonitor);

    void startBackground(DataSource dataSource);

    IPlayerController withBackgroundVideoAction(AlphaPlayerAction alphaPlayerAction);
}
