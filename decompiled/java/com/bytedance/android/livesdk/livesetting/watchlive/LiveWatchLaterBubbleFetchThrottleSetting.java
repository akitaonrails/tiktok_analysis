package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_watch_later_bubble_fetch_throttle")
public final class LiveWatchLaterBubbleFetchThrottleSetting {
    public static final long DEFAULT = 60000;
    public static final LiveWatchLaterBubbleFetchThrottleSetting INSTANCE = new LiveWatchLaterBubbleFetchThrottleSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_watch_later_bubble_fetch_throttle", DEFAULT);
    }
}
