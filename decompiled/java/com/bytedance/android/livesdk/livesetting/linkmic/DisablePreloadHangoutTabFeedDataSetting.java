package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "disable_preload_hangout_tab_feed_data")
public final class DisablePreloadHangoutTabFeedDataSetting {
    public static final boolean DEFAULT = false;
    public static final DisablePreloadHangoutTabFeedDataSetting INSTANCE = new DisablePreloadHangoutTabFeedDataSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("disable_preload_hangout_tab_feed_data", DEFAULT);
    }
}
