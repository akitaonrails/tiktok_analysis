package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_feed_strategy_enter_ttl")
public final class LiveFeedStrategyEnterTtlSetting {
    public static final long DEFAULT = 20000;
    public static final LiveFeedStrategyEnterTtlSetting INSTANCE = new LiveFeedStrategyEnterTtlSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_feed_strategy_enter_ttl", DEFAULT);
    }
}
