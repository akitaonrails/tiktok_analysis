package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_link_enable_ws")
public final class LiveAnchorPingAnchorWsSwitch {
    public static final LiveAnchorPingAnchorWsSwitch INSTANCE = new LiveAnchorPingAnchorWsSwitch();
    public static final int DEFAULT = 0;
    public static int value = SettingsManager.INSTANCE.getIntValue("live_link_enable_ws", DEFAULT);

    public final boolean enableChangeStateWebsocket() {
        return value == 2;
    }

    public final boolean isEnable() {
        return value > 0;
    }
}
