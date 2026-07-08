package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_layout_monitor_switch")
public final class MultiGuestLayoutMonitorSwitchSetting {
    public static final MultiGuestLayoutMonitorSwitchSetting INSTANCE = new MultiGuestLayoutMonitorSwitchSetting();
    public static final MultiGuestLayoutMonitorInfo DEFAULT = new MultiGuestLayoutMonitorInfo(true, 10, 10);

    private final MultiGuestLayoutMonitorInfo getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        MultiGuestLayoutMonitorInfo multiGuestLayoutMonitorInfo = DEFAULT;
        MultiGuestLayoutMonitorInfo multiGuestLayoutMonitorInfo2 = (MultiGuestLayoutMonitorInfo) settingsManager.getValueSafely("multi_guest_layout_monitor_switch", multiGuestLayoutMonitorInfo);
        return multiGuestLayoutMonitorInfo2 != null ? multiGuestLayoutMonitorInfo2 : multiGuestLayoutMonitorInfo;
    }

    public final long getBgFlickThresholdMs() {
        return getValue().getBgFlickThresholdMs();
    }

    public final long getLayoutFlickThresholdMs() {
        return getValue().getLayoutFlickThresholdMs();
    }

    public final boolean isSwitch() {
        return getValue().getSwitch();
    }
}
