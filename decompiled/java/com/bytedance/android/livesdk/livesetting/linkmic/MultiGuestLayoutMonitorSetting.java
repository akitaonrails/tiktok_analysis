package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_layout_monitor")
public final class MultiGuestLayoutMonitorSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestLayoutMonitorSetting INSTANCE = new MultiGuestLayoutMonitorSetting();

    private final boolean value() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_layout_monitor", DEFAULT);
    }

    public final boolean enable() {
        return value();
    }
}
