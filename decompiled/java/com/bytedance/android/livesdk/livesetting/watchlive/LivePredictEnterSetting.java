package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_feed_strategy_enter_enable")
public final class LivePredictEnterSetting {
    public static final LivePredictEnterSetting INSTANCE = new LivePredictEnterSetting();
    public static final boolean DEFAULT = false;
    public static final boolean config = SettingsManager.INSTANCE.getBooleanValue("live_feed_strategy_enter_enable", DEFAULT);

    public static final boolean isEnablePredictEnter() {
        return config;
    }

    public final boolean getConfig() {
        return config;
    }
}
