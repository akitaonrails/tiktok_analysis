package com.ss.android.ugc.aweme.live.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class PreCreateConfigForColdBoot {

    @C09CT("cache_expired_interval_ms")
    public final long cacheExpiredIntervalMs;

    @C09CT("pre_create_player")
    public final boolean preCreatePlayer;

    @C09CT("pre_create_render_view")
    public final boolean preCreateRenderView;

    @C09CT("pre_create_view_holder")
    public final boolean preCreateViewHolder;

    @C09CT("pre_create_view_in_advance")
    public final boolean preCreateViewInAdvance;

    @C09CT("pre_create_view_on_demand")
    public final boolean preCreateViewOnDemand;

    @C09CT("pre_play_after_player_created")
    public final boolean prePlayAfterPlayerCreated;

    public PreCreateConfigForColdBoot() {
        this(false, false, false, false, false, false, 60000L);
    }

    public PreCreateConfigForColdBoot(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, long j) {
        this.preCreateViewInAdvance = z;
        this.preCreateViewOnDemand = z2;
        this.preCreateRenderView = z3;
        this.preCreateViewHolder = z4;
        this.preCreatePlayer = z5;
        this.prePlayAfterPlayerCreated = z6;
        this.cacheExpiredIntervalMs = j;
    }
}
