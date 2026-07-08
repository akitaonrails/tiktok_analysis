package com.bytedance.android.livesdk.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_drawer_tab_update_delay")
public final class LiveDrawerTabUpdateDelaySetting {
    public static final long DEFAULT = -1;
    public static final LiveDrawerTabUpdateDelaySetting INSTANCE = new LiveDrawerTabUpdateDelaySetting();

    public static final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_drawer_tab_update_delay", DEFAULT);
    }

    public static final boolean enable() {
        return getValue() >= 0;
    }
}
