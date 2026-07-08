package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_force_refresh_rate_setting")
public final class LiveForceRefreshRateSetting {
    public static final boolean DEFAULT = false;
    public static final LiveForceRefreshRateSetting INSTANCE = new LiveForceRefreshRateSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_force_refresh_rate_setting", DEFAULT);
    }
}
