package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_broadcast_cpu_opt")
public final class LiveBroadcastCpuOptSetting {
    public static final int DEFAULT = 0;
    public static final LiveBroadcastCpuOptSetting INSTANCE = new LiveBroadcastCpuOptSetting();

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_broadcast_cpu_opt", DEFAULT);
    }

    public static final boolean enableCoroutineOpt() {
        return getValue() >= 1;
    }

    public static final boolean enableGestureDispatchOpt() {
        return getValue() >= 1;
    }

    public static final boolean enableV2WidgetManager() {
        return getValue() == 2;
    }
}
