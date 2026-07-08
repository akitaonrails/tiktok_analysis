package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("feed_preload")
public final class FeedPreloadSetting {
    public static final int DEFAULT = 4;
    public static final FeedPreloadSetting INSTANCE = new FeedPreloadSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("feed_preload", DEFAULT);
    }
}
