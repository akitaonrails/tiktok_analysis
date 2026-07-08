package com.bytedance.android.livesdk.comp.api.pcs.data.setting.onboarding;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "smb_onboarding_c2b_schema")
public final class LivePcsSmbOnboardingC2BSchemaConfig {
    public static final String DEFAULT = "";
    public static final LivePcsSmbOnboardingC2BSchemaConfig INSTANCE = new LivePcsSmbOnboardingC2BSchemaConfig();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("smb_onboarding_c2b_schema", DEFAULT);
    }
}
