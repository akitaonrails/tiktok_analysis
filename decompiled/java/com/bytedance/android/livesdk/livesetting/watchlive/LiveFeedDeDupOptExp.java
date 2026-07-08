package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_feed_dedup_fix")
public final class LiveFeedDeDupOptExp {
    public static final boolean DEFAULT = false;
    public static final LiveFeedDeDupOptExp INSTANCE = new LiveFeedDeDupOptExp();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_feed_dedup_fix", DEFAULT);
    }
}
