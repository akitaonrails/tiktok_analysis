package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_feed_strategy_loadmore_config")
public final class LivePredictLoadmoreSetting {
    public static final LivePredictLoadmoreConfig DEFAULT;
    public static final LivePredictLoadmoreSetting INSTANCE = new LivePredictLoadmoreSetting();
    public static final LivePredictLoadmoreConfig config;

    static {
        LivePredictLoadmoreConfig livePredictLoadmoreConfig = new LivePredictLoadmoreConfig(false, 3, 2000L);
        DEFAULT = livePredictLoadmoreConfig;
        LivePredictLoadmoreConfig livePredictLoadmoreConfig2 = (LivePredictLoadmoreConfig) SettingsManager.INSTANCE.getValueSafely("live_feed_strategy_loadmore_config", livePredictLoadmoreConfig);
        if (livePredictLoadmoreConfig2 != null) {
            livePredictLoadmoreConfig = livePredictLoadmoreConfig2;
        }
        config = livePredictLoadmoreConfig;
    }

    public static final int getLoadmoreLeftRoomThrehold() {
        return config.leftRoomThrehold;
    }

    public static final long getLoadmoreMaxWaitTime() {
        return config.maxWaitTime;
    }

    public static final boolean isEnablePredictLoadmore() {
        return config.enable;
    }

    public final LivePredictLoadmoreConfig getConfig() {
        return config;
    }
}
