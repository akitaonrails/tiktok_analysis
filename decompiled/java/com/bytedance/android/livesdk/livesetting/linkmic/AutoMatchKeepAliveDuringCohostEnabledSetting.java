package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "auto_match_keep_alive_during_cohost_enabled")
public final class AutoMatchKeepAliveDuringCohostEnabledSetting {
    public static final boolean DEFAULT = false;
    public static final AutoMatchKeepAliveDuringCohostEnabledSetting INSTANCE = new AutoMatchKeepAliveDuringCohostEnabledSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("auto_match_keep_alive_during_cohost_enabled", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
