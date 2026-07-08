package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "toplive_hangout_interact_guide_times")
public final class TopliveHangoutInteractGuideTimesSetting {
    public static final int DEFAULT = 1;
    public static final TopliveHangoutInteractGuideTimesSetting INSTANCE = new TopliveHangoutInteractGuideTimesSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("toplive_hangout_interact_guide_times", DEFAULT);
    }
}
