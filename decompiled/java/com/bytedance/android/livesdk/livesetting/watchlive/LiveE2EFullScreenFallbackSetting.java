package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_e2e_full_screen_fallback")
public final class LiveE2EFullScreenFallbackSetting {
    public static final boolean DEFAULT = false;
    public static final LiveE2EFullScreenFallbackSetting INSTANCE = new LiveE2EFullScreenFallbackSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_e2e_full_screen_fallback", DEFAULT);
    }
}
