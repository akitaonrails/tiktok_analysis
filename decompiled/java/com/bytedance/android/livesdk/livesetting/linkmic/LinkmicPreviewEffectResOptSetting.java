package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_preview_effect_res_opt")
public final class LinkmicPreviewEffectResOptSetting {
    public static final boolean DEFAULT = true;
    public static final LinkmicPreviewEffectResOptSetting INSTANCE = new LinkmicPreviewEffectResOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_preview_effect_res_opt", DEFAULT);
    }
}
