package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_feed_match_retry_interval")
public final class LiveCohostFeedMatchRetryIntervalSetting {
    public static final int DEFAULT = 1000;
    public static final LiveCohostFeedMatchRetryIntervalSetting INSTANCE = new LiveCohostFeedMatchRetryIntervalSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_feed_match_retry_interval", DEFAULT);
    }
}
