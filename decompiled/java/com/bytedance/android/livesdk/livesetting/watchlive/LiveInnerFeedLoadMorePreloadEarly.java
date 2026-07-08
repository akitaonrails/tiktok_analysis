package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_inner_feed_load_more_preload_early")
public final class LiveInnerFeedLoadMorePreloadEarly {
    public static final boolean DEFAULT = false;
    public static final LiveInnerFeedLoadMorePreloadEarly INSTANCE = new LiveInnerFeedLoadMorePreloadEarly();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_inner_feed_load_more_preload_early", DEFAULT);
    }
}
