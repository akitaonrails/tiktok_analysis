package com.bytedance.android.livesdk.comp.api.subscription.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "privilege_page_ux_optimization_is_enabled")
public final class SubOnlySpacePreviewUxOptimizationSetting {
    public static final boolean DEFAULT = false;
    public static final SubOnlySpacePreviewUxOptimizationSetting INSTANCE = new SubOnlySpacePreviewUxOptimizationSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("privilege_page_ux_optimization_is_enabled", DEFAULT);
    }
}
