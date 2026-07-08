package com.bytedance.android.livesdk.livesetting.performance;

import android.os.Build;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_background_image_opt")
public final class LiveRoomBackGroundImageOptSetting {
    public static final LiveRoomBackGroundImageOptSetting INSTANCE = new LiveRoomBackGroundImageOptSetting();
    public static final LiveRoomBgImageOptConfig DEFAULT = new LiveRoomBgImageOptConfig(false, false, false, 1.0f);

    public final LiveRoomBgImageOptConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveRoomBgImageOptConfig liveRoomBgImageOptConfig = DEFAULT;
        LiveRoomBgImageOptConfig liveRoomBgImageOptConfig2 = (LiveRoomBgImageOptConfig) settingsManager.getValueSafely("live_background_image_opt", liveRoomBgImageOptConfig);
        return liveRoomBgImageOptConfig2 != null ? liveRoomBgImageOptConfig2 : liveRoomBgImageOptConfig;
    }

    public final boolean clientDrawBlur() {
        return getConfig().clientDrawBlur && Build.VERSION.SDK_INT >= 31;
    }

    public final boolean useBlurEffect() {
        return getConfig().useBlurEffect && Build.VERSION.SDK_INT >= 31;
    }
}
