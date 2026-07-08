package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_broadcast_toolbar_limit_count")
public final class LiveBroadcastToolbarLimitCountSetting {
    public static final int DEFAULT = 7;
    public static final LiveBroadcastToolbarLimitCountSetting INSTANCE = new LiveBroadcastToolbarLimitCountSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_broadcast_toolbar_limit_count", DEFAULT);
    }
}
