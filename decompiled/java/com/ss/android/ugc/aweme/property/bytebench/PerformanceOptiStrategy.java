package com.ss.android.ugc.aweme.property.bytebench;

import X.C09GA;
import X.InterfaceC21142817oY;
import X.InterfaceC540790LIv;

/* JADX INFO: loaded from: classes9.dex */
public interface PerformanceOptiStrategy extends InterfaceC540790LIv, InterfaceC21142817oY {
    @Override // X.InterfaceC540790LIv
    int getOpenAlbumOptiGroup();

    boolean isOpenAlbumThreeColumnsOpti();

    boolean isOpenStopVideoPlayerOpti();

    boolean isOpenTaskDegradationOpti();

    @Override // X.InterfaceC21142817oY
    /* synthetic */ void setByteBenchStrategy(C09GA c09ga);

    /* synthetic */ void updateValue();
}
