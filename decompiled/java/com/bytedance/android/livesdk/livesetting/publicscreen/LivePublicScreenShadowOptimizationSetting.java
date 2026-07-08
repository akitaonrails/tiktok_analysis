package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_public_screen_shadow_optimization")
public final class LivePublicScreenShadowOptimizationSetting {
    public static final boolean DEFAULT = false;
    public static final LivePublicScreenShadowOptimizationSetting INSTANCE = new LivePublicScreenShadowOptimizationSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_public_screen_shadow_optimization", DEFAULT);
    }
}
