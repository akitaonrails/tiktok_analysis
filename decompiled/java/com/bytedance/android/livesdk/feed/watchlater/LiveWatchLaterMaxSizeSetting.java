package com.bytedance.android.livesdk.feed.watchlater;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_watch_later_max_size")
public final class LiveWatchLaterMaxSizeSetting {
    public static final int DEFAULT = 5;
    public static final LiveWatchLaterMaxSizeSetting INSTANCE = new LiveWatchLaterMaxSizeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_watch_later_max_size", DEFAULT);
    }
}
