package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_anchor_network_monitor_duration")
public final class LiveAnchorNetworkMonitorDurationSetting {
    public static final int DEFAULT = 20;
    public static final LiveAnchorNetworkMonitorDurationSetting INSTANCE = new LiveAnchorNetworkMonitorDurationSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_anchor_network_monitor_duration", DEFAULT);
    }
}
