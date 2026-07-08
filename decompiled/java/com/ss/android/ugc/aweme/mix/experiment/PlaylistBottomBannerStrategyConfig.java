package com.ss.android.ugc.aweme.mix.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes32.dex */
public final class PlaylistBottomBannerStrategyConfig {

    @C09CT("display_fan_count")
    public final int displayFollowerCountThreshold;

    @C09CT("max_count")
    public final int maxShowCount;

    public PlaylistBottomBannerStrategyConfig() {
        this(2, 10000);
    }

    public PlaylistBottomBannerStrategyConfig(int i, int i2) {
        this.maxShowCount = i;
        this.displayFollowerCountThreshold = i2;
    }
}
