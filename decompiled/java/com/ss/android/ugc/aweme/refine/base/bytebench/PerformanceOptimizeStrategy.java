package com.ss.android.ugc.aweme.refine.base.bytebench;

import X.C09GA;
import X.C1D7N;
import X.InterfaceC21142817oY;

/* JADX INFO: loaded from: classes36.dex */
public interface PerformanceOptimizeStrategy extends C1D7N, InterfaceC21142817oY {
    @Override // X.C1D7N
    int getOpenAlbumGroup();

    @Override // X.C1D7N
    boolean isOpenAlbumThreeColumns();

    boolean isOpenStopVideoPlayer();

    @Override // X.C1D7N
    boolean isOpenTaskDegradation();

    @Override // X.InterfaceC21142817oY
    /* synthetic */ void setByteBenchStrategy(C09GA c09ga);

    /* synthetic */ void updateValue();
}
