package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "cohost_offset_y_update_opt_setting")
public final class CoHostOffsetYUpdateOptSetting {
    public static final boolean DEFAULT = true;
    public static final CoHostOffsetYUpdateOptSetting INSTANCE = new CoHostOffsetYUpdateOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("cohost_offset_y_update_opt_setting", DEFAULT);
    }
}
