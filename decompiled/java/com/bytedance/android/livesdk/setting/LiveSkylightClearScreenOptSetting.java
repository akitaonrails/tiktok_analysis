package com.bytedance.android.livesdk.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_skylight_clear_screen_opt")
public final class LiveSkylightClearScreenOptSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSkylightClearScreenOptSetting INSTANCE = new LiveSkylightClearScreenOptSetting();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_skylight_clear_screen_opt", DEFAULT);
    }
}
