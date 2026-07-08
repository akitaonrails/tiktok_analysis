package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_effect_sdk_config")
public final class LiveEffectSDKConfigSetting {
    public static final String DEFAULT = "";
    public static final LiveEffectSDKConfigSetting INSTANCE = new LiveEffectSDKConfigSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_effect_sdk_config", DEFAULT);
    }
}
