package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "enable_full_float_layout_resolution_opt_for_cohost")
public final class CoHostFloatResOptSettings {
    public static final boolean DEFAULT = false;
    public static final CoHostFloatResOptSettings INSTANCE = new CoHostFloatResOptSettings();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("enable_full_float_layout_resolution_opt_for_cohost", DEFAULT);
    }
}
