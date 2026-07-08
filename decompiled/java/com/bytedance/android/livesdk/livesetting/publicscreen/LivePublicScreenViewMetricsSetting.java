package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_public_screen_view_metrics_enabled")
public final class LivePublicScreenViewMetricsSetting {
    public static final boolean DEFAULT = false;
    public static final LivePublicScreenViewMetricsSetting INSTANCE = new LivePublicScreenViewMetricsSetting();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_public_screen_view_metrics_enabled", DEFAULT);
    }
}
