package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_link_ping_time")
public final class LiveAnchorPingAnchorWsIntervalSetting {
    public static final LiveAnchorPingAnchorWsIntervalSetting INSTANCE = new LiveAnchorPingAnchorWsIntervalSetting();
    public static final int DEFAULT = 15;
    public static int value = SettingsManager.INSTANCE.getIntValue("live_link_ping_time", 15);

    public final int getValue() {
        return value;
    }
}
