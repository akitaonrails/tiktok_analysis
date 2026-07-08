package com.ss.android.ugc.aweme.experiment;

import X.C0C64;

/* JADX INFO: loaded from: classes25.dex */
public final class LiveVideoHeadAnimDelaySettings {
    public static final LiveVideoHeadAnimDelaySettings INSTANCE = new LiveVideoHeadAnimDelaySettings();
    public static final VideoHeadAnimDelayConfig DEFAULT = new VideoHeadAnimDelayConfig(false, 0.8f);

    private final VideoHeadAnimDelayConfig value() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        VideoHeadAnimDelayConfig videoHeadAnimDelayConfig = DEFAULT;
        VideoHeadAnimDelayConfig videoHeadAnimDelayConfig2 = (VideoHeadAnimDelayConfig) c0c64LJIILLIIL.LJJII(VideoHeadAnimDelayConfig.class, videoHeadAnimDelayConfig, "live_video_head_anim_delay_setting", true);
        return videoHeadAnimDelayConfig2 != null ? videoHeadAnimDelayConfig2 : videoHeadAnimDelayConfig;
    }

    public final boolean enable() {
        return value().enable;
    }

    public final float threshold() {
        return value().quickSlideJudgeThreshold;
    }

    public final VideoHeadAnimDelayConfig getDEFAULT() {
        return DEFAULT;
    }
}
