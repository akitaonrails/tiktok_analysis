package com.ss.android.ugc.tiktok.location.popup.config;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class FypPoiPermissionFrequencyConfig {

    @C09CT("enable")
    public final Boolean enable;

    @C09CT("first_hit_exp_waiting_threshold")
    public final long firstHitExpWaitingThreshold;

    @C09CT("is_only_once")
    public final boolean isOnlyOnce;

    @C09CT("is_poi_relevant_event")
    public final boolean isPoiEvent;

    @C09CT("time_gap")
    public final int timeGap;

    @C09CT("vv_count")
    public final int vvCount;

    @C09CT("waiting_threshold")
    public final long waitingThreshold;

    public FypPoiPermissionFrequencyConfig() {
        this(null, false, false, -1, -1, -1L, -1L);
    }

    public FypPoiPermissionFrequencyConfig(Boolean bool, boolean z, boolean z2, int i, int i2, long j, long j2) {
        this.enable = bool;
        this.isOnlyOnce = z;
        this.isPoiEvent = z2;
        this.vvCount = i;
        this.timeGap = i2;
        this.waitingThreshold = j;
        this.firstHitExpWaitingThreshold = j2;
    }
}
