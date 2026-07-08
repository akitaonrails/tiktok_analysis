package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_settings_updater")
public final class LiveCoHostSettingsUpdaterSetting {
    public static final boolean DEFAULT = true;
    public static final LiveCoHostSettingsUpdaterSetting INSTANCE = new LiveCoHostSettingsUpdaterSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_settings_updater", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
