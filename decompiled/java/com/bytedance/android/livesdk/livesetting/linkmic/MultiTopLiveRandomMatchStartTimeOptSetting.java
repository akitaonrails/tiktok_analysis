package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "multi_toplive_random_match_start_time_opt")
public final class MultiTopLiveRandomMatchStartTimeOptSetting {
    public static final boolean DEFAULT = true;
    public static final MultiTopLiveRandomMatchStartTimeOptSetting INSTANCE = new MultiTopLiveRandomMatchStartTimeOptSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_toplive_random_match_start_time_opt", DEFAULT);
    }
}
