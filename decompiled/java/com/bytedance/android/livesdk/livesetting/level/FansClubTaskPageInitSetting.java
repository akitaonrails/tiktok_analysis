package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "live_fans_task_initial_data_experiment_android")
public final class FansClubTaskPageInitSetting {
    public static final boolean DEFAULT = false;
    public static final FansClubTaskPageInitSetting INSTANCE = new FansClubTaskPageInitSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fans_task_initial_data_experiment_android", DEFAULT);
    }
}
