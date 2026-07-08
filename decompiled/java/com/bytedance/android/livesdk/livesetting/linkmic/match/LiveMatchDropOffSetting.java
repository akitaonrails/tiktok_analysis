package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_match_drop_off_setting")
public final class LiveMatchDropOffSetting {
    public static final LiveMatchDropOffSetting INSTANCE = new LiveMatchDropOffSetting();
    public static final LiveMatchDropOffConfig DEFAULT = new LiveMatchDropOffConfig(true, true, 1000);

    private final LiveMatchDropOffConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveMatchDropOffConfig liveMatchDropOffConfig = DEFAULT;
        LiveMatchDropOffConfig liveMatchDropOffConfig2 = (LiveMatchDropOffConfig) settingsManager.getValueSafely("live_match_drop_off_setting", liveMatchDropOffConfig);
        return liveMatchDropOffConfig2 != null ? liveMatchDropOffConfig2 : liveMatchDropOffConfig;
    }

    public final boolean battleFinishDisabledForOthers() {
        return getConfig().battleFinishDisabledForOthers;
    }

    public final long getToastDelayTimeMs() {
        return getConfig().toastDelayMs;
    }

    public final boolean isEnable() {
        return getConfig().enable;
    }
}
