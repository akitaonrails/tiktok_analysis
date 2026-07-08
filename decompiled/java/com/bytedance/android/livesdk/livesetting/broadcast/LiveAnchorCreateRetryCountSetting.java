package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_anchor_create_retry_count")
public final class LiveAnchorCreateRetryCountSetting {
    public static final int DEFAULT = 0;
    public static final LiveAnchorCreateRetryCountSetting INSTANCE = new LiveAnchorCreateRetryCountSetting();

    public final int retryCount() {
        return SettingsManager.INSTANCE.getIntValue("live_anchor_create_retry_count", DEFAULT);
    }
}
