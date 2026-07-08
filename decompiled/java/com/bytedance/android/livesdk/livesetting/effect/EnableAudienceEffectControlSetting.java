package com.bytedance.android.livesdk.livesetting.effect;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "enable_audience_effect_control")
public final class EnableAudienceEffectControlSetting {
    public static final boolean DEFAULT = true;
    public static final EnableAudienceEffectControlSetting INSTANCE = new EnableAudienceEffectControlSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("enable_audience_effect_control", DEFAULT);
    }
}
