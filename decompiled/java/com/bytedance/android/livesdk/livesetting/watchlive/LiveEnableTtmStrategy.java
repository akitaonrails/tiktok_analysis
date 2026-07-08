package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_enable_ttm_strategy")
public final class LiveEnableTtmStrategy {
    public static final LiveEnableTtmStrategy INSTANCE = new LiveEnableTtmStrategy();
    public static final TtmStrategyConfig DEFAULT = new TtmStrategyConfig(false, false);

    public final TtmStrategyConfig getValue() {
        return (TtmStrategyConfig) SettingsManager.INSTANCE.getValueSafely("live_enable_ttm_strategy", DEFAULT);
    }

    public final boolean combineRequest() {
        TtmStrategyConfig value;
        return (!enable() || (value = getValue()) == null || value.coldStartSingleRequest) ? false : true;
    }

    public final boolean disable() {
        return !enable();
    }

    public final boolean enable() {
        TtmStrategyConfig value = getValue();
        if (value != null) {
            return value.enable;
        }
        return false;
    }

    public final boolean singleRequest() {
        TtmStrategyConfig value;
        return enable() && (value = getValue()) != null && value.coldStartSingleRequest;
    }

    public final TtmStrategyConfig getDEFAULT() {
        return DEFAULT;
    }
}
