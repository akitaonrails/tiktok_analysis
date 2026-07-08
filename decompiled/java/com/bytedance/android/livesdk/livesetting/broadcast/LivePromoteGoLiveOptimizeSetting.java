package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_inner_promote_golive_opt")
public final class LivePromoteGoLiveOptimizeSetting {
    public static final LivePromoteGoLiveOptimizeConfig DEFAULT;
    public static final LivePromoteGoLiveOptimizeSetting INSTANCE = new LivePromoteGoLiveOptimizeSetting();
    public static final LivePromoteGoLiveOptimizeConfig config;

    static {
        LivePromoteGoLiveOptimizeConfig livePromoteGoLiveOptimizeConfig = new LivePromoteGoLiveOptimizeConfig(false, false, false);
        DEFAULT = livePromoteGoLiveOptimizeConfig;
        config = (LivePromoteGoLiveOptimizeConfig) SettingsManager.INSTANCE.getValueSafely("live_inner_promote_golive_opt", livePromoteGoLiveOptimizeConfig);
    }

    public final boolean enablePreloadVideo() {
        return config.getEnablePreloadVideo();
    }

    public final boolean optimizeShowCardsRecord() {
        return config.getOptimizeShowCardsRecord();
    }

    public final boolean useFirstFrameImage() {
        return config.getVideoFirstFrame();
    }
}
