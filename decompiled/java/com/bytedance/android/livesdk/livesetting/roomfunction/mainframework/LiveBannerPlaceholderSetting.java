package com.bytedance.android.livesdk.livesetting.roomfunction.mainframework;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_lynx_banner_placeholder_setting")
public final class LiveBannerPlaceholderSetting {
    public static final boolean DEFAULT = false;
    public static final LiveBannerPlaceholderSetting INSTANCE = new LiveBannerPlaceholderSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_lynx_banner_placeholder_setting", DEFAULT);
    }
}
