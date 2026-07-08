package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_incentive_task_guide_strategy_enable")
public final class LiveCoinIncentiveGuideSettings {
    public static final boolean DEFAULT = false;
    public static final LiveCoinIncentiveGuideSettings INSTANCE = new LiveCoinIncentiveGuideSettings();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_incentive_task_guide_strategy_enable", DEFAULT);
    }
}
