package com.bytedance.android.livesdk.livesetting.effect;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "replace_creative_effect_opt")
public final class ReplaceCreativeEffectOptSetting {
    public static final boolean DEFAULT = false;
    public static final ReplaceCreativeEffectOptSetting INSTANCE = new ReplaceCreativeEffectOptSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("replace_creative_effect_opt", DEFAULT);
    }
}
