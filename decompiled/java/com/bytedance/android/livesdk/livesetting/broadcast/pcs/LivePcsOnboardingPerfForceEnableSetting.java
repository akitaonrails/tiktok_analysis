package com.bytedance.android.livesdk.livesetting.broadcast.pcs;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_pcs_onboarding_perf_force_enable")
public final class LivePcsOnboardingPerfForceEnableSetting {
    public static final boolean DEFAULT = false;
    public static final LivePcsOnboardingPerfForceEnableSetting INSTANCE = new LivePcsOnboardingPerfForceEnableSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_pcs_onboarding_perf_force_enable", DEFAULT);
    }

    public final boolean isEnabled() {
        return getValue();
    }
}
