package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_inner_feed_refresh_unified_setting")
public final class LiveInnerFeedRefreshUnifiedSetting {
    public static final LiveInnerFeedRefreshUnifiedSetting INSTANCE = new LiveInnerFeedRefreshUnifiedSetting();
    public static final FeedRefreshUnified DEFAULT = new FeedRefreshUnified(false, false);

    public static final FeedRefreshUnified getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        FeedRefreshUnified feedRefreshUnified = DEFAULT;
        FeedRefreshUnified feedRefreshUnified2 = (FeedRefreshUnified) settingsManager.getValueSafely("live_inner_feed_refresh_unified_setting", feedRefreshUnified);
        return feedRefreshUnified2 != null ? feedRefreshUnified2 : feedRefreshUnified;
    }

    public final FeedRefreshUnified getDEFAULT() {
        return DEFAULT;
    }
}
