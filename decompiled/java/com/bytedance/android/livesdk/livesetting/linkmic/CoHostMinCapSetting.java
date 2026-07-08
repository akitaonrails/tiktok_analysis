package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_cohost_min_cap_fps")
public final class CoHostMinCapSetting {
    public static final boolean DEFAULT = false;
    public static final CoHostMinCapSetting INSTANCE = new CoHostMinCapSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_cohost_min_cap_fps", DEFAULT);
    }
}
