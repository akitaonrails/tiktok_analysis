package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_feed_user_list_retry_times")
public final class LiveCohostFeedUserListRetryTimesSetting {
    public static final int DEFAULT = 3;
    public static final LiveCohostFeedUserListRetryTimesSetting INSTANCE = new LiveCohostFeedUserListRetryTimesSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_feed_user_list_retry_times", DEFAULT);
    }
}
