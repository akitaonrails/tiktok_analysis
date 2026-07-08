package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_broadcast_task_list_url")
public final class LiveBroadcastTaskListUrlSetting {
    public static final String DEFAULT = "";
    public static final LiveBroadcastTaskListUrlSetting INSTANCE = new LiveBroadcastTaskListUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_broadcast_task_list_url", DEFAULT);
    }
}
