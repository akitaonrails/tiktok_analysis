package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_incentive_task_config")
public final class LiveCoinIncentiveTaskConfigSettings {
    public static final LiveCoinIncentiveTaskConfigSettings INSTANCE = new LiveCoinIncentiveTaskConfigSettings();
    public static final ConfigSettingsParams DEFAULT = new ConfigSettingsParams(3600, 3, 5, false);

    private final ConfigSettingsParams getSettingsValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        ConfigSettingsParams configSettingsParams = DEFAULT;
        ConfigSettingsParams configSettingsParams2 = (ConfigSettingsParams) settingsManager.getValueSafely("live_incentive_task_config", configSettingsParams);
        return configSettingsParams2 != null ? configSettingsParams2 : configSettingsParams;
    }

    public final boolean enableForceRefreshTaskInfo() {
        return getSettingsValue().enableForceReq;
    }

    public final int requestRetryTimes() {
        return getSettingsValue().requestRetryTimes;
    }

    public final long timeCanRequestNextDay() {
        return getSettingsValue().timeCanRequestNextDay;
    }
}
