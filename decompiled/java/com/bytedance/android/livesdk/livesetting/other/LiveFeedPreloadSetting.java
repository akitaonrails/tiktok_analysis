package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.FeedPreloadConfig;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_feed_preload")
public final class LiveFeedPreloadSetting {
    public static final LiveFeedPreloadSetting INSTANCE = new LiveFeedPreloadSetting();
    public static final FeedPreloadConfig DEFAULT = new FeedPreloadConfig();

    public final FeedPreloadConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        FeedPreloadConfig feedPreloadConfig = DEFAULT;
        FeedPreloadConfig feedPreloadConfig2 = (FeedPreloadConfig) settingsManager.getValueSafely("live_feed_preload", feedPreloadConfig);
        return feedPreloadConfig2 != null ? feedPreloadConfig2 : feedPreloadConfig;
    }
}
