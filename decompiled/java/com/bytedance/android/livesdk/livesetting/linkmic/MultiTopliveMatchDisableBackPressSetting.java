package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "multi_toplive_match_disable_back_press")
public final class MultiTopliveMatchDisableBackPressSetting {
    public static final boolean DEFAULT = true;
    public static final MultiTopliveMatchDisableBackPressSetting INSTANCE = new MultiTopliveMatchDisableBackPressSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_toplive_match_disable_back_press", DEFAULT);
    }
}
