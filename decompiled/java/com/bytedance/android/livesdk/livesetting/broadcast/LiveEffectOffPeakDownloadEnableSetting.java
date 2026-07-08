package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_effect_offpeak_download_enable")
public final class LiveEffectOffPeakDownloadEnableSetting {
    public static final boolean DEFAULT = false;
    public static final LiveEffectOffPeakDownloadEnableSetting INSTANCE = new LiveEffectOffPeakDownloadEnableSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_effect_offpeak_download_enable", DEFAULT);
    }
}
