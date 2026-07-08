package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_cross_linker_destroy_race_fix")
public final class LinkMicCrossLinkerDestroyRaceFixSetting {
    public static final boolean DEFAULT = true;
    public static final LinkMicCrossLinkerDestroyRaceFixSetting INSTANCE = new LinkMicCrossLinkerDestroyRaceFixSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_cross_linker_destroy_race_fix", DEFAULT);
    }
}
