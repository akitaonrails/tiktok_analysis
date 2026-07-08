package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "dm_guidance_max_show_count_per_day")
public final class DmGuidanceMaxShowCountPerDaySetting {
    public static final int DEFAULT = 3;
    public static final DmGuidanceMaxShowCountPerDaySetting INSTANCE = new DmGuidanceMaxShowCountPerDaySetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("dm_guidance_max_show_count_per_day", DEFAULT);
    }
}
