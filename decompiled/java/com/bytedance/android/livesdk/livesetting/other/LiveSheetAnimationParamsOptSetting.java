package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_sheet_animation_params_opt")
public final class LiveSheetAnimationParamsOptSetting {
    public static final boolean DEFAULT = false;
    public static final LiveSheetAnimationParamsOptSetting INSTANCE = new LiveSheetAnimationParamsOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sheet_animation_params_opt", DEFAULT);
    }
}
