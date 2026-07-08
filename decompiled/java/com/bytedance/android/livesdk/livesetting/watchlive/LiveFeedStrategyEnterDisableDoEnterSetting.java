package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_feed_strategy_enter_disable_do_enter")
public final class LiveFeedStrategyEnterDisableDoEnterSetting {
    public static final boolean DEFAULT = false;
    public static final LiveFeedStrategyEnterDisableDoEnterSetting INSTANCE = new LiveFeedStrategyEnterDisableDoEnterSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_feed_strategy_enter_disable_do_enter", DEFAULT);
    }
}
