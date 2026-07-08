package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_effect_new_engine_config")
public final class LiveEffectNewEngineConfigSetting {
    public static final String DEFAULT = "";
    public static final LiveEffectNewEngineConfigSetting INSTANCE = new LiveEffectNewEngineConfigSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_effect_new_engine_config", DEFAULT);
    }
}
