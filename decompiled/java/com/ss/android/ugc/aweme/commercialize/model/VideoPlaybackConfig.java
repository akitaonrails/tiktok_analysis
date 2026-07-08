package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class VideoPlaybackConfig implements Serializable {

    @C09CT("ad_speed_up_enabled")
    public final Integer adSpeedUpEnable;

    @C09CT("automatical_playback_speed")
    public final Float automaticallyPlaybackSpeed;

    @C09CT("component_display_timing")
    public final Integer componentDisplayTiming;

    @C09CT("if_automatically_accelerated")
    public final Integer ifAutomaticallyAccelerated;

    @C09CT("speed_up_clear_mode")
    public final Integer speedUpClearMode;

    public VideoPlaybackConfig() {
        this(null, null, null, null, null);
    }

    public VideoPlaybackConfig(Integer num, Integer num2, Integer num3, Integer num4, Float f) {
        this.adSpeedUpEnable = num;
        this.speedUpClearMode = num2;
        this.componentDisplayTiming = num3;
        this.ifAutomaticallyAccelerated = num4;
        this.automaticallyPlaybackSpeed = f;
    }
}
