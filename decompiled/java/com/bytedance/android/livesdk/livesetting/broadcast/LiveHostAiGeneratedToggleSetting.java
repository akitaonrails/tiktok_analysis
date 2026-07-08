package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_host_ai_generated_toggle_settings")
public final class LiveHostAiGeneratedToggleSetting {
    public static final int DEFAULT = 0;
    public static final LiveHostAiGeneratedToggleSetting INSTANCE = new LiveHostAiGeneratedToggleSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("live_host_ai_generated_toggle_settings", DEFAULT) == 1;
    }
}
