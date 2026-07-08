package com.ss.android.ugc.aweme.music.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class FanSpotlightGuideConfig {
    public static final int $stable = 0;

    @C09CT("display_interval_in_seconds")
    public final int fanSpotlightGuideDisplayInterval = 604800;

    @C09CT("max_display_attempts")
    public final int fanSpotlightGuideMaxDisplayTime = 2;

    @C09CT("video_visible_period_in_weeks")
    public final int fanSpotlightVideoExpiredWeeks = 1;

    public final int getFanSpotlightGuideDisplayInterval() {
        return this.fanSpotlightGuideDisplayInterval;
    }

    public final int getFanSpotlightGuideMaxDisplayTime() {
        return this.fanSpotlightGuideMaxDisplayTime;
    }

    public final int getFanSpotlightVideoExpiredWeeks() {
        return this.fanSpotlightVideoExpiredWeeks;
    }
}
