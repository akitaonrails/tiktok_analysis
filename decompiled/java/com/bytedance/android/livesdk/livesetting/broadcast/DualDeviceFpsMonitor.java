package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("game_live_dual_device_fps_monitor")
public final class DualDeviceFpsMonitor {
    public static final int DEFAULT = 0;
    public static final int GROUP_EXPERIMENT = 1;
    public static final DualDeviceFpsMonitor INSTANCE = new DualDeviceFpsMonitor();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("game_live_dual_device_fps_monitor", DEFAULT);
    }

    public final boolean isDefaultGroup() {
        return getValue() == 0;
    }
}
