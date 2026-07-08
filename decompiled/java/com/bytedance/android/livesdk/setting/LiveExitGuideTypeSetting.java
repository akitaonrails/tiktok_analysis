package com.bytedance.android.livesdk.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_exit_guide_type")
public final class LiveExitGuideTypeSetting {
    public static final String DEFAULT = "";
    public static final LiveExitGuideTypeSetting INSTANCE = new LiveExitGuideTypeSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_exit_guide_type", DEFAULT);
    }
}
