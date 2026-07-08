package com.ss.android.ugc.aweme.feed.adapter.playerview;

import X.InterfaceC1473950oSX;
import X.InterfaceC1482650ogZ;
import X.InterfaceC583650Mup;
import X.InterfaceC690050R4x;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.feed.platform.cell.component.playerview.FeedSurfaceViewHolderAbility;

/* JADX INFO: loaded from: classes12.dex */
public interface BaseFeedPlayerView extends InterfaceC583650Mup, InterfaceC690050R4x, OnUIPlayListener, FeedSurfaceViewHolderAbility {
    void Dn(InterfaceC1473950oSX interfaceC1473950oSX);

    void LJIJJ();

    InterfaceC1482650ogZ getSurfaceHolder();

    void jj(boolean z);

    void onDestroyView();

    void onPagePause();

    void onScrollEnd();

    void q7(float f, int i, int i2, int i3);

    void s5(InterfaceC1473950oSX interfaceC1473950oSX);

    void wa(boolean z);
}
