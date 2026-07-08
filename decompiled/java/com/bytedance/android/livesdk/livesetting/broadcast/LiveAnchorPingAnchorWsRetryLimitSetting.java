package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_link_retry_limit")
public final class LiveAnchorPingAnchorWsRetryLimitSetting {
    public static final LiveAnchorPingAnchorWsRetryLimitSetting INSTANCE = new LiveAnchorPingAnchorWsRetryLimitSetting();
    public static final int DEFAULT = 3;
    public static int value = SettingsManager.INSTANCE.getIntValue("live_link_retry_limit", 3);

    public final int getValue() {
        return value;
    }
}
