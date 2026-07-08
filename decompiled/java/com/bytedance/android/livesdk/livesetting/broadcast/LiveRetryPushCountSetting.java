package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_retry_push_count_setting")
public final class LiveRetryPushCountSetting {
    public static final int DEFAULT = 0;
    public static final LiveRetryPushCountSetting INSTANCE = new LiveRetryPushCountSetting();

    public final int liveRetryPushCount() {
        return SettingsManager.INSTANCE.getIntValue("live_retry_push_count_setting", DEFAULT);
    }
}
