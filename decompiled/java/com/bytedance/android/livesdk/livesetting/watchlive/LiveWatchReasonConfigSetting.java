package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_watch_reason_config_setting")
public final class LiveWatchReasonConfigSetting {
    public static final LiveWatchReasonConfigSetting INSTANCE = new LiveWatchReasonConfigSetting();
    public static final WatchReasonConfig DEFAULT = new WatchReasonConfig(0, 0, 2000, 10000, 0, 0);

    public static final WatchReasonConfig config() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        WatchReasonConfig watchReasonConfig = DEFAULT;
        WatchReasonConfig watchReasonConfig2 = (WatchReasonConfig) settingsManager.getValueSafely("live_watch_reason_config_setting", watchReasonConfig);
        return watchReasonConfig2 != null ? watchReasonConfig2 : watchReasonConfig;
    }
}
