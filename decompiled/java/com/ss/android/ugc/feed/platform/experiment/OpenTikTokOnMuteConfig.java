package com.ss.android.ugc.feed.platform.experiment;

import X.C09CT;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes24.dex */
public final class OpenTikTokOnMuteConfig {

    @C09CT("first_video_mute")
    public final boolean FIRST_VIDEO_MUTE;

    @C09CT("boot_push_wait")
    public final long PUSH_COUNTDOWN_TIME;

    public OpenTikTokOnMuteConfig() {
        this(Mp4ScreenVideoLoadTimeout.CONTROL, true);
    }

    public OpenTikTokOnMuteConfig(long j, boolean z) {
        this.PUSH_COUNTDOWN_TIME = j;
        this.FIRST_VIDEO_MUTE = z;
    }
}
