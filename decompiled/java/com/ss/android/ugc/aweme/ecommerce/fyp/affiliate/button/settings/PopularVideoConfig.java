package com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.settings;

import X.C09CT;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes29.dex */
public final class PopularVideoConfig {

    @C09CT("video_min_duration")
    public final long videoMinDuration;

    @C09CT("video_play_percent")
    public final float videoPlayPercent;

    @C09CT("video_play_trigger_time")
    public final long videoPlayTriggerTime;

    public PopularVideoConfig() {
        this(Mp4ScreenVideoLoadTimeout.CONTROL, 0.5f, 2000L);
    }

    public PopularVideoConfig(long j, float f, long j2) {
        this.videoMinDuration = j;
        this.videoPlayPercent = f;
        this.videoPlayTriggerTime = j2;
    }
}
