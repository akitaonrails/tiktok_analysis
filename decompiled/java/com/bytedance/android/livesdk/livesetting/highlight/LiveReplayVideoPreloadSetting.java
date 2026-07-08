package com.bytedance.android.livesdk.livesetting.highlight;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_video_preload_config")
public final class LiveReplayVideoPreloadSetting {
    public static final LiveReplayVideoPreloadSetting INSTANCE = new LiveReplayVideoPreloadSetting();
    public static final VideoPreloadConfig DEFAULT = new VideoPreloadConfig(0, 3, 3, 512);

    public static final VideoPreloadConfig getParams() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        VideoPreloadConfig videoPreloadConfig = DEFAULT;
        VideoPreloadConfig videoPreloadConfig2 = (VideoPreloadConfig) settingsManager.getValueSafely("live_video_preload_config", videoPreloadConfig);
        return videoPreloadConfig2 != null ? videoPreloadConfig2 : videoPreloadConfig;
    }

    public final int getPreloadHighlightCount() {
        return getParams().preloadHighlightCount;
    }

    public final int getPreloadReplayCount() {
        return getParams().preloadReplayCount;
    }

    public final int getPreloadVideoSize() {
        return getParams().preloadVideoSize;
    }

    public final boolean isEnable() {
        return getParams().isPreloadEnable > 0;
    }
}
