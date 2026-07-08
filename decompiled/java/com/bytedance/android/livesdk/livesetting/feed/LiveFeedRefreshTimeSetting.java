package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_feed_refresh_time")
public final class LiveFeedRefreshTimeSetting {
    public static final int DEFAULT = 180;
    public static final LiveFeedRefreshTimeSetting INSTANCE = new LiveFeedRefreshTimeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_feed_refresh_time", DEFAULT);
    }
}
