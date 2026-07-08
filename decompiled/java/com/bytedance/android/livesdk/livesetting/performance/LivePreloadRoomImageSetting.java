package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_pre_load_image")
public final class LivePreloadRoomImageSetting {
    public static final LivePreloadRoomImageSetting INSTANCE = new LivePreloadRoomImageSetting();
    public static final LivePreloadImageConfig DEFAULT = new LivePreloadImageConfig(false, false, -1, 0);

    public final LivePreloadImageConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LivePreloadImageConfig livePreloadImageConfig = DEFAULT;
        LivePreloadImageConfig livePreloadImageConfig2 = (LivePreloadImageConfig) settingsManager.getValueSafely("live_pre_load_image", livePreloadImageConfig);
        return livePreloadImageConfig2 != null ? livePreloadImageConfig2 : livePreloadImageConfig;
    }
}
