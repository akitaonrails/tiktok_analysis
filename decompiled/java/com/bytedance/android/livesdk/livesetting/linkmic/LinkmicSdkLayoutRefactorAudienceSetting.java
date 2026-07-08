package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_sdk_layout_refactor_audience")
public final class LinkmicSdkLayoutRefactorAudienceSetting {
    public static final boolean DEFAULT = true;
    public static final LinkmicSdkLayoutRefactorAudienceSetting INSTANCE = new LinkmicSdkLayoutRefactorAudienceSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_sdk_layout_refactor_audience", DEFAULT);
    }

    public final boolean getEnable() {
        return getValue();
    }
}
