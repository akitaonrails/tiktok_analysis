package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_panel_new_radius")
public final class LiveSheetRadiusOptSetting {
    public static final boolean DEFAULT = false;
    public static final LiveSheetRadiusOptSetting INSTANCE = new LiveSheetRadiusOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_panel_new_radius", DEFAULT);
    }
}
