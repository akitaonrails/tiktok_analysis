package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_host_enable_net_control")
public final class LiveHostEnableNetControlSetting {
    public static final boolean DEFAULT = false;
    public static final LiveHostEnableNetControlSetting INSTANCE = new LiveHostEnableNetControlSetting();

    private final boolean getSetting() {
        return SettingsManager.INSTANCE.getBooleanValue("live_host_enable_net_control", DEFAULT);
    }

    public final boolean enable() {
        return getSetting();
    }
}
