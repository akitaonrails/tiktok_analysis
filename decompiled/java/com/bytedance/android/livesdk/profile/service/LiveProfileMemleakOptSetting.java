package com.bytedance.android.livesdk.profile.service;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_profile_memleak_opt")
public final class LiveProfileMemleakOptSetting {
    public static final boolean DEFAULT = true;
    public static final LiveProfileMemleakOptSetting INSTANCE = new LiveProfileMemleakOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_profile_memleak_opt", DEFAULT);
    }
}
