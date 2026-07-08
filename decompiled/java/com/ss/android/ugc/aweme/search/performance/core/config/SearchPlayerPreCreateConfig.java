package com.ss.android.ugc.aweme.search.performance.core.config;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchPlayerPreCreateConfig {

    @C09CT("enable_pre_init_player")
    public final boolean enablePreInitPlayer;

    @C09CT("enable_preload")
    public final boolean enablePreload;

    @C09CT("max_preload_count")
    public final int maxPreloadCount;

    @C09CT("reset_all_player_when_recycle")
    public final boolean recycleAllPlayerWhenRecycle;

    public SearchPlayerPreCreateConfig() {
        this(false, 0, false, false);
    }

    public SearchPlayerPreCreateConfig(boolean z, int i, boolean z2, boolean z3) {
        this.enablePreload = z;
        this.maxPreloadCount = i;
        this.recycleAllPlayerWhenRecycle = z2;
        this.enablePreInitPlayer = z3;
    }
}
