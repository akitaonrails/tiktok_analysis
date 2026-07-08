package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_search_card_warm_up")
public final class LiveSearchCardWarmUpOpt {
    public static final LiveSearchCardWarmUpOpt INSTANCE = new LiveSearchCardWarmUpOpt();
    public static final LiveSearchCardWarmUpOptConfig DEFAULT = new LiveSearchCardWarmUpOptConfig();

    public final LiveSearchCardWarmUpOptConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveSearchCardWarmUpOptConfig liveSearchCardWarmUpOptConfig = DEFAULT;
        LiveSearchCardWarmUpOptConfig liveSearchCardWarmUpOptConfig2 = (LiveSearchCardWarmUpOptConfig) settingsManager.getValueSafely("live_search_card_warm_up", liveSearchCardWarmUpOptConfig);
        return liveSearchCardWarmUpOptConfig2 != null ? liveSearchCardWarmUpOptConfig2 : liveSearchCardWarmUpOptConfig;
    }

    public final LiveSearchCardWarmUpOptConfig getDEFAULT() {
        return DEFAULT;
    }
}
