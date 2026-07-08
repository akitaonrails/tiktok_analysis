package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_broadcast_task_resource_id")
public final class LiveBroadcastTaskResourceIdSetting {
    public static final int DEFAULT = 43;
    public static final LiveBroadcastTaskResourceIdSetting INSTANCE = new LiveBroadcastTaskResourceIdSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_broadcast_task_resource_id", DEFAULT);
    }
}
