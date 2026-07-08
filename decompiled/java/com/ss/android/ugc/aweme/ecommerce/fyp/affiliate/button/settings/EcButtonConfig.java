package com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class EcButtonConfig {

    @C09CT("frequency")
    public final EcButtonFrequency frequency;

    @C09CT("video_min_duration")
    public final Long videoMinDuration;

    @C09CT("video_play_percent")
    public final Float videoPlayPercent;

    @C09CT("video_play_trigger_time")
    public final Long videoPlayTriggerTime;

    public EcButtonConfig() {
        this(null, null, null, null);
    }

    public EcButtonConfig(EcButtonFrequency ecButtonFrequency, Long l, Float f, Long l2) {
        this.frequency = ecButtonFrequency;
        this.videoMinDuration = l;
        this.videoPlayPercent = f;
        this.videoPlayTriggerTime = l2;
    }
}
