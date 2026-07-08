package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_public_screen_shadow_optimization_anchor")
public final class LivePublicScreenShadowOptimizationAnchorSetting {
    public static final boolean DEFAULT = false;
    public static final LivePublicScreenShadowOptimizationAnchorSetting INSTANCE = new LivePublicScreenShadowOptimizationAnchorSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_public_screen_shadow_optimization_anchor", DEFAULT);
    }
}
